/**
 * 
 */
package org.chinese.go.log.interceptor;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.aspectj.lang.reflect.MethodSignature;
import org.chinese.go.AppConstant;
import org.chinese.go.exception.NoAuthorityException;
import org.chinese.go.log.entity.StAppLog;
import org.chinese.go.log.repository.StAppLogRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import org.chinese.go.annotation.Location;
import org.chinese.go.annotation.Operation;

/**
 * 
 * 
 *	服务公共拦截器,处理流水及权限
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月1日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.core
 *
 * @copyright www.chinesego.org
 */
@Aspect
@Component
public class ChineseGoLogInterceptor {

	private static final Log logger = LogFactory.getLog(ChineseGoLogInterceptor.class);

	private static final String P_S_LOCATION = "Location code【%s】" + " desc【%s】";

//	private static final String P_S_AUTHORITY_CODE = "Operation code【%s】" + " desc【%s】";

	private static final String P_S_LOCATION_NOT_FIND = "【%s】 not find @Location";

//	private static final String P_S_OPERATION_NOT_FIND = "【%s】 not find @Operation";

//	private static final String P_S_RESULT = "Result --> %s";

	@Autowired
	private StAppLogRepository appLogRepository;

	/**
	 * 切入点
	 */
	@Pointcut("@annotation(org.chinese.go.annotation.Operation)")
	public void ChineseGoService() {
	}

	/**
	 * 
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around("ChineseGoService()")
	public Object interceptor(ProceedingJoinPoint pjp) throws Throwable {

		Date reqTime = new Date();
		long startTime = reqTime.getTime();

		StAppLog appLog = new StAppLog();
		appLog.setReqTime(new Timestamp(startTime));

		Object result = null;

		try {
			beforePre(pjp, appLog);
		} catch (NoAuthorityException e) {
			throw e;
		} catch (Exception e) {
//			e.printStackTrace();
			logger.warn(AppConstant.S_EMPTY_STRING + e.getMessage());
		}
//		if (logger.isInfoEnabled()) {
//			logger.info(String.format(P_S_RESULT, pjp.getArgs()));
//		}

		try {
			result = pjp.proceed(pjp.getArgs());
		} catch (Throwable e) {
			appLog.setException(e + "");
			throw e;
		} finally {
			Date respTime = new Date();
			long endTime = respTime.getTime();
			appLog.setRespTime(new Timestamp(endTime));
			appLog.setProcTime((int) (endTime - startTime));
			try {
				appLog.setResult(result + "");
			} catch (Exception e) {
				logger.warn(AppConstant.S_EMPTY_STRING + e);
			}

			appLogRepository.save(appLog);
		}
//		if (logger.isInfoEnabled()) {
//			logger.info(String.format(P_S_RESULT, result));
//		}

//		LOGGER.error("++++++++++++++++++++++++++++++++++++++++++++++++");
		return result;
	}

	/**
	 * @param pjp
	 * @param serviceLogBean
	 * @return
	 */
	@SuppressWarnings("unused")
	private void beforePre(ProceedingJoinPoint pjp, StAppLog serviceLogBean) throws NoAuthorityException {

		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();

		serviceLogBean.setSessionId(request.getSession().getId());
//		serviceLogBean.setApiUrl(request.getRequestURL().toString());
//		serviceLogBean.setApiVersion(request.getHeader(AppConstant.API_VERSION));
//		serviceLogBean.setApiMethod(request.getMethod());
		serviceLogBean.setClientIp(request.getRemoteAddr());
//		serviceLogBean.setClassMethod(pjp.getSignature().getDeclaringTypeName() + AppConstant.S_DOT + pjp.getSignature().getName());
//		serviceLogBean.setRequestData(JSON.toJSONString(Arrays.toString(pjp.getArgs())));
//		serviceLogBean.setServerName(request.getLocalName());

		// 打印请求内容
		if (logger.isDebugEnabled()) {
			Object[] args = pjp.getArgs();
			if (args != null && args.length > 0) {
				int i = 0;
				for (Object obj : args) {
					logger.debug("args[" + i + "] --> " + args[i++]);
				}
			}
		}

		Location location = pjp.getTarget().getClass().getAnnotation(Location.class);

		if (logger.isDebugEnabled()) {
			logger.debug(String.format(P_S_LOCATION, location.code(), location.desc()));
		}

		if (location == null) {
			logger.warn(String.format(P_S_LOCATION_NOT_FIND, pjp.getTarget().getClass()));
			return;
		}

		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
		Method method = methodSignature.getMethod();

		Operation operation = method.getAnnotation(Operation.class);

		if (operation == null) {
//			logger.warn(String.format(P_S_OPERATION_NOT_FIND, serviceLogBean.getClassMethod()));
			return;
		}

//		String authorityCode = location.code() + AppConstant.S_DOLLAR + operation.code();
//		if (log.isDebugEnabled()) {
//			log.debug(String.format(P_S_AUTHORITY_CODE, authorityCode,location.desc() + AppConstant.S_DOLLAR + operation.desc()));
//		}
//
//		serviceLogBean.setAuthorityCode(authorityCode);

	}
}

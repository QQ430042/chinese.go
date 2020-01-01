/**
 * 
 */
package org.chinese.go.listener;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.chinese.go.util.AnnotationUtil;

/**
 * 
 *	注解监听器
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月1日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.core
 *
 * @copyright www.chinesego.org
 */
@WebListener
public class ChineseGoAnnotationListener implements ServletContextListener {

	private static final Log logger = LogFactory.getLog(ChineseGoAnnotationListener.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.
	 * ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		List<String> permissionCodeList = AnnotationUtil.getAllPermissionCodes("org.chinese.go");
		logger.info("Authority code size 【" + permissionCodeList.size() + "】\n");
		List<String> restUrlList = AnnotationUtil.getAllRestUrl("org.chinese.go");
		logger.info("Rest url size 【" + restUrlList.size() + "】\n");
		List<String> entityList = AnnotationUtil.getAllDocument("org.chinese.go");
		logger.info("Entity size 【" + entityList.size() + "】\n");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.
	 * ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}

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
 * 	注解监听器
 * 
 *
 * @author 2430042@qq.com
 * @createDate 2018年9月6日
 * @version 1.0.0
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
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
		List<String> permissionCodeList = AnnotationUtil.getAllPermissionCodes("org.chinaese.go");
		logger.info("Authority code size 【" + permissionCodeList.size() + "】\n");
		List<String> restUrlList = AnnotationUtil.getAllRestUrl("org.chinaese.go");
		logger.info("Rest url size 【" + restUrlList.size() + "】\n");
		List<String> entityList = AnnotationUtil.getAllDocument("org.chinaese.go");
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

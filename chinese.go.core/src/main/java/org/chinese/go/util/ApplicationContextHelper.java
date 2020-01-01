/**
 * 
 */
package org.chinese.go.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * ApplicationContextHelper
 * 
 *
 * @author      2430042@qq.com
 * @createDate  2019年1月12日
 * @version     2.2.1.RELEASE
 * @Project     chinaese.go.core
 *
 * @copyright   www.chinaesego.org
 */
@Component
public class ApplicationContextHelper implements ApplicationContextAware {
    private static ApplicationContext appContext;

    public ApplicationContextHelper() {
    }

    @Override
    public void setApplicationContext(ApplicationContext appContext) throws BeansException {
        ApplicationContextHelper.appContext = appContext;
    }

    public static Object getBean(String beanName)  throws BeansException{
        return appContext != null?appContext.getBean(beanName):null;
    }
        
    
}

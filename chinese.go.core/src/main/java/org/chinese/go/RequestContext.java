package org.chinese.go;

import java.io.Serializable;

/**
 * 
 * 
 *	请求上下文
 *
 * @author 2430042@qq.com
 * @createDate 2019年11月9日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
public class RequestContext implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4482661251865303328L;
	
	/**
	 * 	用户语言
	 */
	private Language userLanguage = Language.zh_CN;
	
	/**
	 *	应用信息
	 */
	private Application application;
	
	/**
	 * 	用户信息
	 */
	private IUser user;
	
	/**
	 * 	是否跳过安全检查
	 */
	private boolean skipSafetyCheck;
	
	/**
	 * 	是否开启调试
	 */
	private boolean debugEnabled;

	public Language getUserLanguage() {
		return userLanguage;
	}

	public void setUserLanguage(Language userLanguage) {
		this.userLanguage = userLanguage;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public IUser getUser() {
		return user;
	}

	public void setUser(IUser user) {
		this.user = user;
	}

	public boolean isSkipSafetyCheck() {
		return skipSafetyCheck;
	}

	public void setSkipSafetyCheck(boolean skipSafetyCheck) {
		this.skipSafetyCheck = skipSafetyCheck;
	}

	public boolean isDebugEnabled() {
		return debugEnabled;
	}

	public void setDebugEnabled(boolean debugEnabled) {
		this.debugEnabled = debugEnabled;
	}

	
	
}

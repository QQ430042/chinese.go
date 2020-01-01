package org.chinese.go;

import java.io.Serializable;
import java.net.InetAddress;

/**
 * 
 * 
 *	TODO [类型说明]
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月1日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.core
 *
 * @copyright www.chinesego.org
 */
public class Application implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1451300994038692752L;
	
	/**
	 *	应用ID
	 */
	private String appId;
	
	/**
	 *	应用名称
	 */
	private String appName;
	
	/**
	 *	应用版本
	 */
	private String appVersion;
	
	/**
	 *	应用上下文
	 */
	private String appContextPath;
	
	/**
	 *	应用作用域
	 */
	private String appScope;
	
	/**
	 *	应用运行环境
	 */
	private AppEnv appEnv;
	
	/**
	 *	数据库类型
	 */
	private String dbType;
	
	/**
	 *	服务器地址
	 */
	private InetAddress inetAddress;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppContextPath() {
		return appContextPath;
	}

	public void setAppContextPath(String appContextPath) {
		this.appContextPath = appContextPath;
	}

	public String getAppScope() {
		return appScope;
	}

	public void setAppScope(String appScope) {
		this.appScope = appScope;
	}

	public AppEnv getAppEnv() {
		return appEnv;
	}

	public void setAppEnv(AppEnv appEnv) {
		this.appEnv = appEnv;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public InetAddress getInetAddress() {
		return inetAddress;
	}

	public void setInetAddress(InetAddress inetAddress) {
		this.inetAddress = inetAddress;
	}
		

}

package org.chinese.go;

/**
 * 
 *	异常信息
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月1日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.core
 *
 * @copyright www.chinesego.org
 */
public enum ErrorMessage {

	E001("E001", "[%s] Parameter cannot be empty."), 
	E010("E010", "[%s] No data found."),
	
	E998("E998", "未知错误"),
	E999("E999", "未知错误");

	ErrorMessage(String msgCode, String message) {
		this.msgCode = msgCode;
		this.message = message;
	}

	/**
	 * 错误码
	 */
	private String msgCode;

	/**
	 * 错误信息
	 */
	private String message;
	
	

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}

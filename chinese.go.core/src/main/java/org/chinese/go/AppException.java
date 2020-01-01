package org.chinese.go;

/**
 * 
 * 
 *	 平台异常类型定义
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月1日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.core
 *
 * @copyright www.chinesego.org
 */
public abstract class AppException extends Exception {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7399372255667179022L;
	
	/**
	 * 	错误码
	 */
	private ErrorMessage errorMessage ;


	
	/**
	 * 
	 * @param errorMessage
	 * @param cause
	 */
	public AppException(ErrorMessage errorMessage,Throwable cause){
		super("["+errorMessage.getMsgCode()+"]"+errorMessage.getMessage(), cause);
		this.errorMessage = errorMessage;
	}
	
	/**
	 * 
	 * @param errorMessage
	 */
	public AppException(ErrorMessage errorMessage){		
		this.errorMessage = errorMessage;
	}
	
	/**
	 * 
	 * @param errorMessage
	 * @param args
	 */
	public AppException(ErrorMessage errorMessage,Object... args){		
		super(errorMessage.getMsgCode()+String.format(errorMessage.getMessage(), args));
		this.errorMessage = errorMessage;		
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AppException(String message, Throwable cause){
		super("[E999]"+message, cause);
		this.errorMessage = ErrorMessage.E999;
	}

	/**
	 *
	 * @param cause
	 */
	public AppException(Throwable cause){
		super(cause);
		this.errorMessage = ErrorMessage.E999;
	}

	/**
	 * 
	 * @param message
	 */
	public AppException(String message){
		super("[E998]"+message);
		this.errorMessage = ErrorMessage.E998;
	}
	
	/**
	 * 
	 * @return
	 */
	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	

}

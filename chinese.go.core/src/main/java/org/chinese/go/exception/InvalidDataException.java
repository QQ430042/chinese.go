/**
 * 
 */
package org.chinese.go.exception;

import org.chinese.go.AppException;
import org.chinese.go.ErrorMessage;

/**
 * 
 * 
 *  TODO [类型说明]
 *
 * @author 2430042@qq.com
 * @createDate 2019年11月23日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
public class InvalidDataException extends AppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5562011537079681588L;

	/**
	 * @param message
	 */
	public InvalidDataException(String message) {
		super(ErrorMessage.E001,message);
	}
	
	/**
	 * 
	 * @param errorMessage
	 * @param args
	 */
	public InvalidDataException(ErrorMessage errorMessage,Object... args){
		super(errorMessage,args);		
	}

	
}

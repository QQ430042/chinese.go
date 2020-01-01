/**
 * 
 */
package org.chinese.go.exception;

import org.chinese.go.AppException;
import org.chinese.go.ErrorMessage;

/**
 * 
 * 
 *  [NoDataFoundException]
 *
 * @author 2430042@qq.com
 * @createDate 2019年11月23日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
/**
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
public class NoDataFoundException extends AppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2284225292523587576L;


	
	/**
	 * @param message
	 */
	public NoDataFoundException(String message) {
		super(ErrorMessage.E010,message);
	}

}

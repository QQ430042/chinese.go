/**
 * 
 */
package org.chinese.go.exception;

import org.chinese.go.AppException;

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
public class TimeoutException extends AppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2284225292523587576L;

	/**
	 * @param cause
	 */
	public TimeoutException(Throwable cause) {
		super(cause);
	}
	

}

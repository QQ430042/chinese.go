/**
 * 
 */
package org.chinese.go.exception;

import org.chinese.go.AppException;
import org.chinese.go.ErrorMessage;

/**
 * 
 * 
 *   [未登录异常]
 *
 * @author 2430042@qq.com
 * @createDate 2019年11月23日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
public class NotLoggedInException  extends AppException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1522506372425609903L;
	
	public NotLoggedInException(ErrorMessage errorMessage) {
		super(errorMessage);
	}


}

/**
 * 
 */
package org.chinese.go.exception;

import org.chinese.go.AppException;
import org.chinese.go.ErrorMessage;

/**
 * 
 * 
 *   [权限异常封装]
 *
 * @author 2430042@qq.com
 * @createDate 2019年11月23日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
public class NoAuthorityException extends AppException {


	public NoAuthorityException(ErrorMessage errorMessage) {
		super(errorMessage);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7954974216801228345L;

	


}

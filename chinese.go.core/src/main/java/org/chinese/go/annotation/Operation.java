/**
 * 
 */
package org.chinese.go.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.chinese.go.OperationType;

/**
 * 
 *	函数执行权限注解
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月1日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.core
 *
 * @copyright www.chinesego.org
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface Operation {

	/**
	 *	 权限编码
	 *
	 * @return
	 */
	OperationType operationType();
	
	/**
	 *	权限描述
	 * 
	 * @return
	 */
//	public String dimension() ;
}

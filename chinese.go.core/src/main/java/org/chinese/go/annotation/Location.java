/**
 * 
 */
package org.chinese.go.annotation;


import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * 
 *	服务分组单元注解
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
@Target(TYPE)
public @interface Location {

	/**
	 *	 单元编码
	 *
	 * @return
	 */
	String code();

	/**
	 * 	单元描述
	 *
	 * @return
	 */
	String desc();
}

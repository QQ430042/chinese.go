/**
 * 
 */
package org.chinese.go.i18n.repository;


import java.util.List;

import org.chinese.go.i18n.entity.StI18n;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * 
 *  [国际化信息]
 *
 * @author 2430042@qq.com
 * @createDate 2019年11月10日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
public interface StI18nRepository extends JpaRepository <StI18n, String>{
	
	/**
	 *	根据语言查询国际化信息
	 *
	 *	@param language
	 *	@return
	 */
	List<StI18n> findByMsgLanguage(String language);
	
	/**
	 *	根据国际化KEY和语言查询国际化信息
	 *
	 *	@param language
	 *	@param msgKey
	 *	@return
	 */
	StI18n getByMsgKeyAndMsgLanguage(String language,String msgKey);
	
	/**
	 *	根据国际化类型和语言查询国际化信息
	 *
	 *	@param language
	 *	@param msgType
	 *	@return
	 */
	List<StI18n> findByMsgTypeAndMsgLanguage(String language,String msgType);

}

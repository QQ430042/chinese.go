package org.chinese.go.i18n;


import org.chinese.go.i18n.entity.StI18n;

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
public class I18nBean extends StI18n{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6851090151606751619L;
	
	public I18nBean(String msgKey,String msgValue) {
		this.setMsgKey(msgKey);
		this.setMsgValue(msgValue);
	}

	
}

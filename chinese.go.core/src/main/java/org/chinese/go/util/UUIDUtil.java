package org.chinese.go.util;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 
 * TODO [类型说明]
 *
 * @author 2430042@qq.com
 * @createDate 2019年7月8日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
public class UUIDUtil {

	private static final Logger log = LoggerFactory.getLogger(UUIDUtil.class);

	/**
	 * UUID校验
	 * 
	 * @param uuid
	 * @return
	 */
	public static boolean isValidUUID(String uuid) {

		if (uuid == null) {
			log.warn("uuid is null");
		}
		String regex = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$";
		return uuid.matches(regex);
	}

	/**
	 *	获取UUID
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
}

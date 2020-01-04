/**
 *	2020年1月4日
 */
package org.chinese.go.service;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/** 
 *	TODO [类型说明]
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月4日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.base
 *
 * @copyright www.chinesego.org
 */
@Component
public class UserSecurityService implements UserDetailsService {

	private static final Log logger = LogFactory.getLog(UserSecurityService.class);
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("username --> "+username);
		UserDetails user = new User(username,"123456",Arrays.asList(new SimpleGrantedAuthority("ROLE_admin")));
		logger.info("user --> "+user);
		return user;
	}


//protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////      // 添加admin账号
////      auth.inMemoryAuthentication().withUser("admin").password("123456").
////      authorities("showOrder","addOrder","updateOrder","deleteOrder");
////      // 添加userAdd账号
////      auth.inMemoryAuthentication().withUser("userAdd").password("123456").authorities("showOrder","addOrder");
////      // 如果想实现动态账号与数据库关联 在该地方改为查询数据库
//        auth.userDetailsService(myUserDetailsService);
//
//    }
}

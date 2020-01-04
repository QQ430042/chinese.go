/**
 *	2020年1月4日
 */
package org.chinese.go;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 
 *	TODO [类型说明]
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月4日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.web
 *
 * @copyright www.chinesego.org
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //可以设置内存指定的登录的账号密码,指定角色
        //不加.passwordEncoder(new MyPasswordEncoder())
        //就不是以明文的方式进行匹配，会报错
        //auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");

        //.passwordEncoder(new MyPasswordEncoder())。
        //这样，页面提交时候，密码以明文的方式进行匹配。
        auth.inMemoryAuthentication().passwordEncoder(new UserPasswordEncoder()).withUser("admin").password("123456").roles("ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //设置登录,注销，表单登录不用拦截，其他请求要拦截
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .logout().permitAll()
                .and()
                .formLogin();

        //关闭默认的csrf认证
        http.csrf().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //设置静态资源不要拦截
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");

    }
}

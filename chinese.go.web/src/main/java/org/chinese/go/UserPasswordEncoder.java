/**
 *	2020年1月4日
 */
package org.chinese.go;


import org.springframework.security.crypto.password.PasswordEncoder;

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
public class UserPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}

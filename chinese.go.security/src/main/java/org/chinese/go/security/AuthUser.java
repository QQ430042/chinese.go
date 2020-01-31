package org.chinese.go.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



/**
 * 
 *	TODO [类型说明]
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月5日
 * @version 2.x.x.RELEASE
 * @Project security-jwt-restful
 *
 * @copyright www.chinesego.org
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthUser implements UserDetails {
    /**
	 *	serialVersionUID
	 */
	private static final long serialVersionUID = -4970374974610999301L;
	private String username;
    private String password;
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    	// ROLE_ 是springsecurity对于角色的默认前缀，如果不加，验证会失败
        return roles.isEmpty() ? Collections.EMPTY_LIST : (roles.parallelStream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRoleName())).collect(Collectors.toList()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

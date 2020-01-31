package org.chinese.go.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.*;
import java.util.stream.Collectors;


/**
 * 
 * 
 * TODO [类型说明]
 *
 * @author 2430042@qq.com
 * @createDate 2019年12月8日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
public class JwtUtil {
	private static final String secret = "2430042@qq.com";

	/**
	 * 
	 *	@param username
	 *	@param roles
	 *	@return
	 */
	public static String generateToken(String username, List<Role> roles) {
		Map<String, Object> claims = new HashMap<String, Object>();
		claims.put("roles", roles.parallelStream().map(Role::getRoleName).collect(Collectors.joining(",")));

		return Jwts.builder().setClaims(claims).setSubject(username)
				// 创建时间
				.setIssuedAt(new Date())
				// 过期时间，我们设置为 五分钟
				.setExpiration(new Date(System.currentTimeMillis() + 5 * 60 * 1000))
				// 签名，通过密钥保证安全性
				.signWith(SignatureAlgorithm.HS512, secret).compact();
	}

	public static AuthUser parseToken(String token) {
		Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		String username = claims.getSubject();
		String roles = (String) claims.get("roles");

		// 因为生成的时候没有放入密码，所以不需要密码
		return new AuthUser(username, null, Arrays.stream(roles.split(",")).map(name -> {
			Role role = new Role();
			role.setRoleName(name);
			return role;
		}).collect(Collectors.toList()));
	}

	/**
	 * 
	 *	@param args
	 */
	public static void main(String[] args) {
		List<Role> roles = new ArrayList<Role>();
		Role roleSysAdmin = new Role();
		roleSysAdmin.setId(1000);
		roleSysAdmin.setRoleName("SysAdmin");

		Role roleNon = new Role();
		roleNon.setId(1001);
		roleNon.setRoleName("roleNon");

		roles.add(roleSysAdmin);
		roles.add(roleNon);
		for(int i=0;i<1000;i++) {
			Role roleTmp = new Role();
			roleTmp.setRoleName("ROLE_"+System.currentTimeMillis());
			roles.add(roleTmp);
		}

		String token = generateToken("xujinhui", roles);
		System.out.println(token);
		AuthUser authUser = parseToken("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiU3lzQWRtaW4scm9sZU5vbiIsImV4cCI6MTU3NTgwODE4MSwiaWF0IjoxNTc1ODA3ODgxfQ.Ihp4K6LnpkQf9ThK3WZlU-32tvuFTEVdQYGsFFY33jCj9iH4axm6db2Q24wf_rXfjS1z7nLwF6krdcRr4wGYPA");
		System.out.println(authUser.toString());
	}
}

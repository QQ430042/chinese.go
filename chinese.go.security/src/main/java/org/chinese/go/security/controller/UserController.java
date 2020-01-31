//package org.chinese.go.security.controller;
//
//
//import org.chinese.go.ResultVO;
//import org.chinese.go.security.JwtUtil;
//import org.chinese.go.security.config.Role;
//import org.chinese.go.security.config.User;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//
//import java.util.Collections;
//import java.util.List;
//
///**
// * 
// *	TODO [类型说明]
// *
// * @author 2430042@qq.com
// * @createDate 2020年1月5日
// * @version 2.x.x.RELEASE
// * @Project security-jwt-restful
// *
// * @copyright www.chinesego.org
// */
//@RestController
//@RequestMapping
//public class UserController {
//    @Resource
//    private UserRepository userRepository;
//    @Resource
//    private RoleRepository roleRepository;
//
//    @GetMapping("/token")
//    public ResultVO login(String username, String password,HttpServletResponse response) {
//        User user = userRepository.findByUsername(username);
//
//        if (user == null || !user.getPassword().equals(password)) {
//            ResultVO<Object> result = new ResultVO<>();
//            result.setCode(10);
//            result.setMsg("用户名或密码错误");
//            return result;
//        }
//
//        ResultVO<Object> success = new ResultVO<>();
//        //用户名密码正确，生成token给客户端
//        success.setCode(200);
//        List<Role> roles = Collections.singletonList(roleRepository.findById(user.getId()).get());
//        String token = JwtUtil.generateToken(username, roles);
//        success.setData(token);
//        Cookie cookie=new Cookie("chinesego-token",token);
//        response.addCookie(cookie);
//
//        return success;
//    }
//}

package org.chinese.go.security.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.chinese.go.ResultVO;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author jsbintask@foxmail.com
 * @date 2019/1/21 11:39
 */
@Component
public class TokenExceptionHandler implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        // 直接返回 json错误
        ResultVO<Object> result = new ResultVO<>();
        //403，标识没有token
        result.setCode(403);
        result.setMsg("Invalid request, no valid token !");

        ObjectMapper objectMapper = new ObjectMapper();

        response.getWriter().write(objectMapper.writeValueAsString(result));
        response.setStatus(403);
    }
}

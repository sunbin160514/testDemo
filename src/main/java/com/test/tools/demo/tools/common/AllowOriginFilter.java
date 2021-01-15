package com.test.tools.demo.tools.common;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
@WebFilter(urlPatterns = "/*") //这里的“/*” 表示的是需要拦截的请求路径
public class AllowOriginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException { }
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//        HttpServletResponse httpResponse = (HttpServletResponse)servletResponse;
//        httpResponse.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
//        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
//        httpResponse.addHeader("Access-Control-Allow-Origin", "http://127.0.0.1:8080");
//        filterChain.doFilter(servletRequest, httpResponse);

        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request=(HttpServletRequest)req;
        response.setHeader("Access-Control-Allow-Origin", "*"); // 设置允许所有跨域访问
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,PUT,OPTIONS,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin,X-Requested-With,Content-Type,Accept,Authorization,token");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(req,res);
    }
    @Override
    public void destroy() { }
}

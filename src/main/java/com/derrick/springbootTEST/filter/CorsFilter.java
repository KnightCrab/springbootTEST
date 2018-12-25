package com.derrick.springbootTEST.filter;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        System.out.println("TestFilter23333333333333333333333332");
        String strUri = request.getRequestURI();

//        if(strUri.indexOf("login.do") > -1 ) {
            response.setHeader("Access-Control-Allow-Origin", "*");
//        };

        filterChain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}

package com.example;

import jakarta.servlet.*;

import java.io.IOException;

public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilter init");
    }

    @Override
    public void destroy() {
        System.out.println("UserFilter destroy");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String username = servletRequest.getParameter("username");

        if (username == null || username.length() < 5) {
            servletRequest.getRequestDispatcher("/home").forward(servletRequest, servletResponse);
        } else {
            servletRequest.getRequestDispatcher("/user").forward(servletRequest, servletResponse);
        }
    }
}

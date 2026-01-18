package com.raj.learningSpringBoot.middleware;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside the filter body");
    }

    @Override
    public void destroy() {
        System.out.println("destroying the filter.");
        Filter.super.destroy();
    }
}

package com.gzh.youth.sys;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("过滤器销毁");
		
	}

	@Override
	public void doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse,
			FilterChain paramFilterChain) throws IOException, ServletException {
		   System.out.println("执行过滤操作");
		   paramFilterChain.doFilter(paramServletRequest, paramServletResponse);
		
	}

	@Override
	public void init(FilterConfig paramFilterConfig) throws ServletException {
		  System.out.println("过滤器初始化");
		
	}

}

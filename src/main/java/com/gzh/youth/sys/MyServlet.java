package com.gzh.youth.sys;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义servlet

 * @ClassName: MyServlet

 * @Description: TODO

 * @author: zhonghui.geng

 * @date: 2017年1月3日 下午3:05:55
 */
@WebServlet(urlPatterns="/myservlet")
public class MyServlet extends HttpServlet{

	private static final long serialVersionUID = -4597327394081964915L;
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
     doPost(req, resp);
 }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
		super.doPost(req, resp);
	}
    
}

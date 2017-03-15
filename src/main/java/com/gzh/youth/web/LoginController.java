package com.gzh.youth.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gzh.youth.model.Value;
import com.gzh.youth.service.UserService;


@RestController
@RequestMapping("/")
@EnableAutoConfiguration
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private UserService userService;


	@RequestMapping("/login")
	public Value getUserPage(@RequestParam("username") String username,@RequestParam("pwd") String pwd,HttpServletRequest request)
	{
		boolean f  = userService.login(username,pwd);
		request.getSession().setAttribute("cur_user",f);
		Value v = new Value();
		v.setData(f);
		return v;
	}

}

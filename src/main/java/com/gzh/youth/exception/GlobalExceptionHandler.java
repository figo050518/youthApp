package com.gzh.youth.exception;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gzh.youth.model.Value;
/**
 * 
@ControllerAdvice的作用是将拥有该注解的内部所有含有@ExceptionHandler，@initBinder,@ModelAttribute 三个注解映射到所有含有requestMapping的地方
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Value defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    	Value v= new Value();
    	v.setCode(0000);
    	v.setMessage("系统异常，请联系管理员");
    	v.setResult(false);
        return v;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Value jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
    	Value v= new Value();
    	v.setCode(e.getCode());
    	v.setMessage(e.getMessage());
    	v.setResult(false);
        return v;
    }

}


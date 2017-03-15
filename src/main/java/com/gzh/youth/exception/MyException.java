package com.gzh.youth.exception;

import com.gzh.youth.util.PropertyUtil;

/**

 * @ClassName: MyException

 * @Description: TODO

 * @author: zhonghui.geng

 * @date: 2016年11月25日 上午9:35:00

 */
public class MyException extends Exception {
	private static final long serialVersionUID = -621010413240370120L;

	public static final Integer TEST_ERROR =100;

	public static final Integer NEED_LOGIN=101;
	private String message;
	
	private Integer code;
	
	public MyException(String message) {
        super(message);
    }

	
	public MyException( Integer code,String message) {
		super();
		this.message = message;
		this.code = code;
	}


	public static String getMessage(Integer testError) {
		return PropertyUtil.getProperty(String.valueOf(testError));
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}
	
}

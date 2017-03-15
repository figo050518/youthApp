package com.gzh.youth.model;

import com.gzh.youth.exception.MyException;

/**
 * 结果返回value

 * @ClassName: Value

 * @Description: TODO

 * @author: zhonghui.geng

 * @date: 2016年11月25日 上午9:05:13
 */
public class Value {

	private String message;
	
	private boolean result;
	
	private Integer code =0;
	
	private Object data;

	public Value(MyException ex) {
		this.message = ex.getMessage();
		this.code =ex.getCode();
	}

	public Value() {

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	
	
}

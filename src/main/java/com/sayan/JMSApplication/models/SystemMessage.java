package com.sayan.JMSApplication.models;

import java.io.Serializable;

public class SystemMessage implements Serializable {

	/**
	 * @author Cadris
	 */
	private static final long serialVersionUID = 1L;
	
	private String source;
	private String message;
	public String getSource() {
		return source;
	}
	public String getMessage() {
		return message;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "SystemMessage [source=" + source + ", message=" + message + "]";
	}
	
	

}

package com.mvc.aop;

public interface Inten {

	public int update() throws Exception;

	int update(String name, String email, String pass) throws Exception;
}

package com.mvc.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeService implements MethodBeforeAdvice
{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("     BEFORE Invoking....."+method.getName()+"()");
	}

}

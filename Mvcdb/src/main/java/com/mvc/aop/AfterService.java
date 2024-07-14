package com.mvc.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterService implements AfterReturningAdvice
{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("     AFTER Invoking....."+method.getName()+"()");
		
	}

}
package com.mvc.aop;

import org.springframework.aop.ThrowsAdvice;

public class ServiceError implements ThrowsAdvice
{
public void afterThrowing(Exception e){
		System.out.println("    ERROR: "+e);
}
}

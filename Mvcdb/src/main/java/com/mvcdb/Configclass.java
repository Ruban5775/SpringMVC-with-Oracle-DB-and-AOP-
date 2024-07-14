package com.mvcdb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.mvcdb.controller"})
public class Configclass {
	
	@Bean
	public InternalResourceViewResolver config() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		
		vr.setPrefix("WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}

}

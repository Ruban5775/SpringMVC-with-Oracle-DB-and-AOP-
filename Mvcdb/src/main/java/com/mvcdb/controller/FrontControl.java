package com.mvcdb.controller;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.aop.Inten;

@Controller
public class FrontControl {
	

	ApplicationContext ctx;
	@RequestMapping("Register")
	public ModelAndView process(@RequestParam("tname") String name, @RequestParam("temail") String mail, @RequestParam("tpass") String pass) throws Exception {
		
		 ctx = new ClassPathXmlApplicationContext("dbdetails.xml");
		
		Inten qry = (Inten) ctx.getBean("aop");
		
		int val = qry.update(name, mail, pass);
		
		qry.update();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",val);
		mv.setViewName("Result");
		
		return mv;
	}
}

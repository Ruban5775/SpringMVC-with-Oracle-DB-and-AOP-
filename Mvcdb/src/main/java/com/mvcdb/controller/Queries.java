package com.mvcdb.controller;




import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc.aop.Inten;

public class Queries implements Inten {
	

	
	
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int update(String name, String email, String pass)  {
		
		String query="INSERT INTO SPRINGDATA VALUES(?,?,?)";
	    return jdbcTemplate.update(query, new Object[] {name,email,pass}); 
	}


	@Override
	public int update() throws Exception {
		System.out.println("Query Update Method");
//		throw new Exception();
		return 0;
	}


	

}

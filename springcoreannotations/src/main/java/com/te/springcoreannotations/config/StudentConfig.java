package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.te.springcoreannotations.bean.Library;
import com.te.springcoreannotations.bean.StudentBean;


@Configuration
public class StudentConfig 
{
	@Bean(name = "one")
	@Scope("prototype")
	public StudentBean getStudentBean() {
		return new StudentBean();
	}
	
	@Bean(name = "two")
	@Primary
	public StudentBean getStuObject() {
		return new StudentBean(10, "Shashank", new Library());
	}
	
	@Bean(name = "three")
//	@Primary
	public StudentBean getStudentProperty() {
		StudentBean stubean = new StudentBean();
		stubean.setRollno(20);
		stubean.setName("Akash");
		return stubean;
	}
	

}

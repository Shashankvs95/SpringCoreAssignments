package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcoreannotations.bean.Library;
import com.te.springcoreannotations.bean.StudentBean;

@Configuration
@Import({LibraryConfig.class})
public class StudentConfiguration 
{
	@Bean
	public StudentBean getStudent() {
		StudentBean stubean = new StudentBean();
		stubean.setRollno(20);
		stubean.setName("Manoj");
		stubean.setLibrary(new Library());
		return stubean;
	}
}

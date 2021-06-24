package com.te.springcoreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.bean.StudentBean;
import com.te.springcoreannotations.config.StudentConfig;
import com.te.springcoreannotations.config.StudentConfiguration;

public class StudentTest1 
{
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
		
		StudentBean stuBean = context.getBean(StudentBean.class);
		
		
		System.out.println(stuBean.getRollno());
		System.out.println(stuBean.getName());
		System.out.println(stuBean.getLibrary().getLid());
		System.out.println(stuBean.getLibrary().getBookname());
	}
}

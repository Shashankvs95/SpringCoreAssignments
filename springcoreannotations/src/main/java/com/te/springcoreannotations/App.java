package com.te.springcoreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.bean.StudentBean;
import com.te.springcoreannotations.config.StudentConfig;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
    	
    	StudentBean stubean = context.getBean("one", StudentBean.class);
    	System.out.println(stubean.getRollno());
    	System.out.println(stubean.getName());
    	
    	System.out.println("------------");
    	
    	StudentBean stubean2 = context.getBean("two", StudentBean.class);
    	System.out.println(stubean2.getRollno());
    	System.out.println(stubean2.getName());
    	
    	System.out.println("------------");
    	
    	StudentBean stubean3 = context.getBean("three", StudentBean.class);
    	System.out.println(stubean3.getRollno());
    	System.out.println(stubean3.getName());
    	
    	System.out.println("------------");
    	
    }
}

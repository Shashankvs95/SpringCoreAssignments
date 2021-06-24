package com.te.springcoreannotations;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.bean.StudentBean;
import com.te.springcoreannotations.config.StudentConfig;

public class StudentTest 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		StudentBean stuOne = context.getBean(StudentBean.class);
		
		System.out.println(" Enter the student rollno: ");
		stuOne.setRollno(Integer.parseInt(sc.nextLine()));
		
		System.out.println(" Enter the student name: ");
		stuOne.setName(sc.nextLine());
		
		System.out.println(" Student object one : "+stuOne);
		
		System.out.println("------------------------------");
		
		StudentBean stuTwo = context.getBean(StudentBean.class);
		
		System.out.println(" Enter the student rollno: ");
		stuOne.setRollno(Integer.parseInt(sc.nextLine()));
		
		System.out.println(" Enter the student name: ");
		stuOne.setName(sc.nextLine());
		
		System.out.println(" Student object two : "+stuTwo);
		
		System.out.println("------------------------------");
		
		System.out.println(" Student object one : "+stuOne);
		
		System.out.println(stuOne);
		
		
		
		
		
	}
}

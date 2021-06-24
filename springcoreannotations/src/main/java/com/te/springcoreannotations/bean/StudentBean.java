package com.te.springcoreannotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class StudentBean implements Serializable 
{
	private int rollno;
	
	private String name;
	
	@Autowired(required = false)
	@Qualifier("Math")
	private Library library;
	
	
	
	public StudentBean() {}
	
	
}

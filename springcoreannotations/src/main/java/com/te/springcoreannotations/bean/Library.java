package com.te.springcoreannotations.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Library {

	private int lid;
	
	private String Bookname;
	
	public Library() {}
}

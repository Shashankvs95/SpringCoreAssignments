package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.bean.Library;

@Configuration
public class LibraryConfig 
{
	@Bean(name = "Geography")
	public Library getLibrary() {
		return new Library(15, "Seven Wonders");
	}
	
	@Bean(name = "Science")
	public Library getLibrarySci() {
		return new Library(16, "Physics");
	}
	
	@Bean(name = "Math")
	public Library getLibraryMath() {
		return new Library(17, "calculus");
	}
}

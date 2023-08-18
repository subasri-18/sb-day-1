package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Apicontroller2 {
	@Value("${var}")
	private String studentName;
	@GetMapping("d")
	public String display()
	{
		return "Welcome "+studentName+"!";
	}
	
	

}

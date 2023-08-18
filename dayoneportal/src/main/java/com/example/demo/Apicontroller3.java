package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller3 {
	@Value("${sar}")
	private String name;
	@GetMapping("displ")
	
		public String display()
		{
			return "My favorite color is "+name;
		}
	

}

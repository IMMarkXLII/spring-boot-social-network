package com.caveofprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SocialNetworkApp {

	public static void main(String[] args) {
		
		SpringApplication.run(SocialNetworkApp.class, args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello World!";
	}
}

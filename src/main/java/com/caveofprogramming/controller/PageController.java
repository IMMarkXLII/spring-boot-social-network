package com.caveofprogramming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/")
	String hello() {
		return "home";
	}
	
	@RequestMapping("/about")
	String about() {
		return "about";
	}
}

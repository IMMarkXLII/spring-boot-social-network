package com.caveofprogramming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/")
	String hello() {
		return "app.homepage";
	}
	
	@RequestMapping("/about")
	String about() {
		return "app.about";
	}
	
	@RequestMapping(value="/addStatus")
	String addStatus() {
		return "app.addStatus";
	}
}

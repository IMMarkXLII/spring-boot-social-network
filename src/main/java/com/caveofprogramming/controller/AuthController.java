package com.caveofprogramming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
	@RequestMapping(value="/admin")
	String admin() {
		return "admin";
	}
}

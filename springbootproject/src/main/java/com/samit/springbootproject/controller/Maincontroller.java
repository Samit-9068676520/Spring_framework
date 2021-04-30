package com.samit.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller {
	@RequestMapping("/")
	public String home() {
		System.out.println("This is home page");
		return "home";
	}
}

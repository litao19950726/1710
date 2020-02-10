package com.bawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloMaven {

	@RequestMapping("maven")
	public String hello() {
		
		return "hello";
		
	}
}

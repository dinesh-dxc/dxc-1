package com.dxc.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to SpringBoot Programming..";
	}
	
	@RequestMapping("/company")
	public String company() {
		return "Its for DXC Client...";
	}
	@RequestMapping("/test")
	public String exam() {
		return "Tomorrow will be exam from Morning to Evening...";
	}
}

package com.dxc.welcome;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/prakash")
	public String prakash() {
		return "prakash";
	}
	
	@RequestMapping("/sanil")
	public String sanil() {
		return "sanil";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("loginvalidate")
	public String loginValidate(Map<String, Object> model, HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if (user.equals("Sanil") && pwd.equals("Sanil")) {
			return "welcome";
		} else {
			model.put("errorMsg", "Invalid Credentials...");
			return "login";
		}
	}
	
	@RequestMapping("/calcresult")
	public String calcresult(Map<String, Object> model, HttpServletRequest req) {
		int a,b,c;
		a=Integer.parseInt(req.getParameter("firstNo"));
		b=Integer.parseInt(req.getParameter("secondNo"));
		c=a+b;
		String res="";
		res+=c;
		model.put("res", res);
		return "calcresult";
	}
	@RequestMapping("/calc")
	public String calc() {
		return "calc";
	}
	
	@RequestMapping("/name") 
	public String name(){
		return "name";
	}
	@RequestMapping("/deteails")
	public String showName(Map<String, Object> model, HttpServletRequest req) {
		String sname = req.getParameter("sname");
		model.put("sname", sname);
		return "details";
	}
	@RequestMapping("/madhura") 
	public String madhura(){
		return "madhura";
	}
	
	@RequestMapping("/greeting")
	public String greet(Map<String, Object> model) {
		Date dt = new Date();
		if (dt.getHours() >= 12) {
			model.put("message", "Good Afternoon...");
		} else {
			model.put("message", "Good Morning...");
		}
		return "greeting";
	}
}

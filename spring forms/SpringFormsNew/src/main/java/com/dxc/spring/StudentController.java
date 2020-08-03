package com.dxc.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/student")  
@Controller
public class StudentController {

	@RequestMapping("/registerForm")  
	public String registerStudent(Model model) {
		Student student = new Student();
		model.addAttribute(student);
		return "register-student";
	}
	
	@RequestMapping("/studentSubmit")
	public String submitForm(@ModelAttribute("student") Student s)  
	{  
	    return "confirmation-page";  
	}  

}

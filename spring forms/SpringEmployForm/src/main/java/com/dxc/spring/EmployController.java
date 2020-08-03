package com.dxc.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employ")
@Controller
public class EmployController {

	@RequestMapping("/addEmploy")
	public String addEmploy(Model model) {
		Employ employ = new Employ();
		model.addAttribute(employ);
		return "add-employ";
	}
	
	@RequestMapping("/employSubmit")
	public String submitEmploy(@ModelAttribute("employ") Employ e) {
		return "employ-submit";
	}
}

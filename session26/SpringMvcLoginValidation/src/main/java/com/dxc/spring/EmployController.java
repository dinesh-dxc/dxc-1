package com.dxc.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employ")
@Controller
public class EmployController {

	@RequestMapping("/showemploy")
	public String showEmploy(Model m) {
		m.addAttribute("employ", new Employ());
		return "show-employ";
	}
	
	@RequestMapping("/employvalidation")
	public String validateEmploy(@Valid @ModelAttribute("employ") Employ e, BindingResult br)
	{

		if(br.hasErrors())
		{
			return "show-employ";
		}
		else
		{
		    return "employ-result";
		}
	}
}

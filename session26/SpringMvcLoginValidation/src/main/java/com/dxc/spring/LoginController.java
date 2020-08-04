package com.dxc.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/login")
@Controller
public class LoginController {

	@RequestMapping("/showpage")
	public String showPage(Model m) {
		m.addAttribute("login", new Login());
		return "login";
	}
	@RequestMapping("/loginvalidation")
	public String submitForm( @Valid @ModelAttribute("login") Login e, BindingResult br)
	{

		if(br.hasErrors())
		{
			return "login";
		}
		else
		{
		    return "result";
		}
	}
}

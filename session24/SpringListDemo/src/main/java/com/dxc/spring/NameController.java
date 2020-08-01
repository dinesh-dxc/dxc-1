package com.dxc.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {

	@RequestMapping("/show")
	public ModelAndView showName() {
		List<String> lstNames=new ArrayList<String>();
		lstNames.add("Snehal");
		lstNames.add("Sanil");
		lstNames.add("Prakash");
		lstNames.add("Harshitha");
		lstNames.add("Raj");
		return new ModelAndView("ShowPage","lists",lstNames);
	}
}

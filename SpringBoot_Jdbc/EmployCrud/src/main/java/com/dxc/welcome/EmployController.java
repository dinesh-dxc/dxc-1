package com.dxc.welcome;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployController {


	@Autowired
    public EmployDAO dao;
	
	@RequestMapping("/")
	public String sayHello() {
		return "index";
	}

	@RequestMapping("/getemploys")
    public String employInformation(Map<String, List<Employ>> model) {
        List<Employ> employs = dao.showEmploy(); 
        model.put("employs", employs);
        return "showemploy";
    }
}

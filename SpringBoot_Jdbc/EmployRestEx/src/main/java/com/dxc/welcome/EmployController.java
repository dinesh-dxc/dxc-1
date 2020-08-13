package com.dxc.welcome;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
    public EmployDAO dao;

    @RequestMapping("/getemploys")
    public List<Employ> employInformation() {
        List<Employ> employs = dao.showEmploys(); 
        return employs;
    }
}

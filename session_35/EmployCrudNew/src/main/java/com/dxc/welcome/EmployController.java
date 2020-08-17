package com.dxc.welcome;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping("/updateEmployRes")
	public String updateEmploy(Map<String, Object> model, HttpServletRequest req) {
		int empno, basic;
		String desig;
		empno = Integer.parseInt(req.getParameter("empno"));
		desig = req.getParameter("desig");
		basic= Integer.parseInt(req.getParameter("basic"));
		String result = dao.updateEmploy(empno, desig, basic);
		model.put("res", result);
		return "deleteResult";
	}
	
	@RequestMapping("/updateEmploy")
	public String updateEmploy() {
		return "updateEmploy";
	}
	
	@RequestMapping("/deleteResult")
	public String deleteEmploy(Map<String, Object> model, HttpServletRequest req) {
		Employ employ = new Employ();
		int empno = Integer.parseInt(req.getParameter("empno"));
		String res = dao.deleteEmploy(empno);
		model.put("res", res);
		return "deleteResult";
	}
	@RequestMapping("/deleteEmploy")
	public String deleteEmploy() {
		return "deleteEmploy";
	}
	@RequestMapping("employSearch")
	public String searchEmploy(Map<String, Employ> model,HttpServletRequest req) {
		Employ res = dao.searchEmploy(Integer.parseInt(req.getParameter("empno")));
		model.put("employ", res);
		return "showResult";
	}


	@RequestMapping("/searchEmploy")
	public String searchEmploy() {
		return "searchEmploy";
	}
	@RequestMapping("/addEmploy")
	public String addEmploy() {
		return "addEmploy";
	}
	
	@RequestMapping("/employAddRes")
	public String addEmployRes(Map<String, Object> model, HttpServletRequest req) {
		Employ employ = new Employ();
		int empno = Integer.parseInt(req.getParameter("empno"));
		BigDecimal eno = BigDecimal.valueOf(empno);
		employ.setEmpno(eno);
		employ.setName(req.getParameter("name"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		int bas = Integer.parseInt(req.getParameter("basic"));
		BigDecimal basic = BigDecimal.valueOf(bas);
		employ.setBasic(basic);
		String res = dao.addEmploy(employ);
		model.put("res", res);
		return "addResult";
	}
	
	@RequestMapping("/getemploys")
    public String employInformation(Map<String, List<Employ>> model) {
        List<Employ> employs = dao.showEmploy(); 
        model.put("employs", employs);
        return "showemploy";
    }

}

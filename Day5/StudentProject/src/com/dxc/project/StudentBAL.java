package com.dxc.project;

import java.util.List;

public class StudentBAL {

	static StringBuilder sb; 
	
	public boolean validStudent(Student student) {
		sb = new StringBuilder("");
		boolean isValid = true;
		if (student.getSno() <= 0) {
			sb.append("Student No Cannot Be Negative");
			isValid = false;
		}
		if (student.getName().length() <= 3) {
			sb.append("\nName Must contains min. 3 chars");
			isValid = false;
		}
		if (student.getCity().length() <= 3) {
			sb.append("\nCity Must Contains min. 3 chars");
			isValid = false;
		}
		if (student.getCgp() <= 0) {
			sb.append("\nCgp Cannot be zero or negative...");
			isValid = false;
		}
		return isValid;
	}
	
	public String addStudentBal(Student student) throws StudentException  {
		if (validStudent(student) == true) {
			StudentDAL dal = new StudentDAL();
			return dal.addStudentDal(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}
	
	public List<Student> showStudentBal() {
		StudentDAL dal = new StudentDAL();
		return dal.showStudentDal();
	}
	
	public Student searchStudentBal(int sno) {
		StudentDAL dal = new StudentDAL();
		return dal.searchStudentDal(sno);
	}
	
	public String updateStudentBal(Student student) throws StudentException {
		if (validStudent(student) == true) {
			StudentDAL dal = new StudentDAL();
			return dal.updateStudentDal(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}
	
	public String deleteStudentBal(int sno) {
		StudentDAL dal = new StudentDAL();
		return dal.deleteStudentDal(sno);
	}
}

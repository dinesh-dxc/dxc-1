package com.dxc.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDAL {

	static List<Student> studentList;
	
	static {
		studentList = new ArrayList<Student>();
	}
	
	public String addStudentDal(Student student) {
		studentList.add(student);
		return "Student Created Successfully...";
	}
	
	public List<Student> showStudentDal() {
		return studentList;
	}
	
	public Student searchStudentDal(int sno) {
		Student student = null;
		for (Student s : studentList) {
			if (s.getSno() == sno) {
				student = s;
			}
		}
		return student;
	}
	
	public String updateStudentDal(Student studentUpdated) {
		String result = "Record Not Found...";
		for (Student student : studentList) {
			if (student.getSno() == studentUpdated.getSno()) {
				student.setName(studentUpdated.getName());
				student.setCity(studentUpdated.getCity());
				student.setCgp(studentUpdated.getCgp());
				result = "Student Record Updated...";
			} 
		}
		return result;
	}
	
	public String deleteStudentDal(int sno) {
		Student studentFound = searchStudentDal(sno);
		if (studentFound != null) {
			studentList.remove(studentFound);
			return "Student Record Deleted...";
		} else {
			return "Student Record Not Found to Delete...";
		}
	}
	
	public String writeStudentFileDal() throws IOException {
		FileOutputStream fout=new FileOutputStream("e:/dxc/student.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(studentList);
		objout.close();
		fout.close();
		return "Student Records Stored in File Successfully...";
	}
	
	public String readStudentFileDal() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("e:/dxc/student.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		studentList = (List<Student>) objin.readObject();
		return "Student Records Retrieved from the file...";
	}
}

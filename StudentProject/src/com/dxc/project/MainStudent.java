package com.dxc.project;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
	static Scanner sc = new Scanner(System.in);
	static StudentBAL obj = new StudentBAL();
	public static void addStudent() throws StudentException {
		Student student = new Student();
		System.out.println("Enter Student No  ");
		student.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		student.setName(sc.nextLine());
		System.out.println("Enter City  ");
		student.setCity(sc.nextLine());
		System.out.println("Enter Cgp  ");
		student.setCgp(Double.parseDouble(sc.nextLine()));
		System.out.println(obj.addStudentBal(student));
	}
	public static void searchStudent() {
		int sno;
		System.out.println("Enter Student No  ");
		sno = Integer.parseInt(sc.nextLine());
		
		Student student = obj.searchStudentBal(sno);
		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("Student Record Not Found...");
		}
	}
	public static void showStudent() {
		List<Student> students = obj.showStudentBal();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public static void updateStudent() throws StudentException {
		Student student = new Student();
		System.out.println("Enter Student No  ");
		student.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		student.setName(sc.nextLine());
		System.out.println("Enter City  ");
		student.setCity(sc.nextLine());
		System.out.println("Enter Cgp  ");
		student.setCgp(Double.parseDouble(sc.nextLine()));	
		System.out.println(obj.updateStudentBal(student));
	}
	
	public static void writeStudentFile() throws IOException {
		System.out.println(obj.writeStudentFileDal());
	}
	
	public static void readStudentFile() throws ClassNotFoundException, IOException {
		System.out.println(obj.readStudentFileDal());
	}
	
	public static void deleteStudent() {
		int sno;
		System.out.println("Enter Student No  ");
		sno = Integer.parseInt(sc.nextLine());
		System.out.println(obj.deleteStudentBal(sno));
	}
	
	public static void main(String[] args) {
		int ch;
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Write Student File");
			System.out.println("7. Read Student File");
			System.out.println("8. Exit");
			System.out.println("Enter Ur Choice  ");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch) {
			case 1 :
				try {
					addStudent();
				} catch (StudentException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2 : 
				showStudent();
				break;
			case 3 : 
				searchStudent();
				break;
			case 4 : 
				try {
					updateStudent();
				} catch (StudentException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 5 : 
				deleteStudent();
				break;
			case 6 : 
				try {
					writeStudentFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 7 : 
				try {
					readStudentFile();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 8 : 
				return;
			}
		} while(ch!=8);

	}
}

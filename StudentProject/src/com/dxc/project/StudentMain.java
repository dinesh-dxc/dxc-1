package com.dxc.project;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void addStudent() throws StudentException {
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StudentNo  ");
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		objStudent.setName(sc.nextLine());
		System.out.println("Enter Student City  ");
		objStudent.setCity(sc.nextLine());
		System.out.println("Enter Cgp  ");
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		StudentBAL obj=new StudentBAL();
		System.out.println(obj.addStudentBal(objStudent));
	}
	
	public static void deleteStudent() {
		int sno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StudentNo  ");
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL();
		String res=obj.deleteStudentBal(sno);
		System.out.println(res);
	}
	public static void updateStudent() throws StudentException {
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StudentNo  ");
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		objStudent.setName(sc.nextLine());
		System.out.println("Enter Student City  ");
		objStudent.setCity(sc.nextLine());
		System.out.println("Enter Cgp  ");
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		StudentBAL obj=new StudentBAL();
		String res=obj.updateStudentBal(objStudent);
		System.out.println(res);
	}
	public static void showStudent() {
		StudentBAL obj=new StudentBAL();
		List<Student> lstStudent=obj.showStudentBal();
		for (Student student : lstStudent) {
			System.out.println(student);
		}
	}
	public static void searchStudent() {
		int sno;
		System.out.println("Enter Student No  ");
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL(); 
		Student objStudent=obj.searchStudentBal(sno);
		if(objStudent!=null) {
			System.out.println(objStudent);
		} else {
			System.out.println("Record not found...");
		}
	}

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
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
			ch=sc.nextInt();
			switch(ch) {
			case 1 : 
				try {
					addStudent();
				} catch (StudentException e) {
					System.err.println(e.getMessage());
					// TODO Auto-generated catch block
					//e.printStackTrace();
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
					//e.printStackTrace();
				}
				break;
			case 5 : 
				deleteStudent();
				break;
			case 6 : 
//				writeStudentFile();
				break;
			case 7 : 
	//			readStudentFile();
				break;
			case 8 : 
				return;
			default : 
				System.out.println("Invalid Choice");
			}
		} while(ch!=8);
	}

}

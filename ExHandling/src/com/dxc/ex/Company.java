package com.dxc.ex;

class InvalidDepartmentException extends Exception {
	InvalidDepartmentException(String error) {
		super(error);
	}
}

class InvalidBranchException extends Exception {
	InvalidBranchException(String error) {
		super(error);
	}
}
public class Company {
	public void check(String branch, String dept) throws InvalidBranchException, InvalidDepartmentException {
		String[] branches= {"bangalore", "pune", "mumbai"};
		String[] depts = {"java", "sql", "sap"};
		boolean flagBranch = false;
		boolean flagDept = false;
		for (String b : branches) {
			if (b.equals(branch.toLowerCase())) {
				flagBranch=true;
			}
		}
		for (String d : depts) {
			if(d.equals(dept.toLowerCase())) {
				flagDept=true;
			}
		}
		if (flagBranch==false) {
			throw new InvalidBranchException("Company don't have this branch...");
		} else if (flagDept == false) {
			throw new InvalidDepartmentException("Department does not exist in company...");
		} else {
			System.out.println("Branch " +branch+ " Dept  " +dept);
		}
	}
	public static void main(String[] args) {
		String branch="Mumbai";
		String dept = "Java";
		Company obj = new Company();
		try {
			obj.check(branch, dept);
		} catch (InvalidBranchException | InvalidDepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

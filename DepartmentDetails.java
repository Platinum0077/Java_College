/*4. Aim of the program - Define an interface Emploee with a method getDetails() to get emplyee details as Empid and Ename. Also define a derived interface Manager with a method getDeptDetails() to get department details such as Deptid and Deptname.Then define a class Head which implements Manager interface and also prints all details of the employee. Write the complete program to display all details of one head of the department.
            Input - Enter employee id - 123
              Enter employee name - Sidharth Ambani
              Enter department id - 06
              Enter department name -Marketing
              Output - Employee id - 123
                  Employee name - Sidharth Ambani
                  Department id - 06
                  Department name -Marketing*/

import java.util.Scanner;

interface Employee {
	void getDetails();
}

interface Manager extends Employee {
	void getDeptDetails();
}

class Head implements Manager {
	private String empId, empName, deptId, deptName;
	
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id :");
		empId = sc.nextLine();
		System.out.println("Enter employee name :");
		empName = sc.nextLine();
	}
	
	public void getDeptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department id :");
		deptId = sc.nextLine();
		System.out.println("Enter department name :"); 
		deptName = sc.nextLine();
	}
	
	public void displayDetails() {
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Department ID : " + deptId);
		System.out.println("Department Name : " + deptName);
	}
}

class DepartmentDetails {
	public static void main(String[] args) {
		Head head = new Head();
		head.getDetails();
		head.getDeptDetails();
		System.out.println("\nHead of Department Details : ");
		head.displayDetails();
	}
} 
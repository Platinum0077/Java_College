/*1.  Aim of the program -Illustrate the usage of abstract class with following Java classes –
l  An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract method course()
l A subclass ‘kiitian’ with course() method implementation
Write the driver class to print the all details of a kiitian object.
 
          Input - Rollno - 2205180
Registration no - 1234567890
          Output -Rollno - 2205180
Registration no - 1234567890
Course - B.Tech. (Computer Science & Engg)*/


import java.util.Scanner;

abstract class Student {
	int rollNo;
	long regNo;

	void getInput(int rollNo, long regNo) {
		this.rollNo = rollNo;
		this.regNo = regNo;
	}

	abstract void course();
}

class Kiitian extends Student {
	void course() {
		System.out.println("Course - B.Tech. (Computer Science & Engg)");
	}
}

class PrintDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Kiitian kiitian = new Kiitian();

		System.out.println("Enter roll no ");
		int rollNo = sc.nextInt();
		System.out.println("Enter registration no ");
		long regNo = sc.nextLong();
		
		kiitian.getInput(rollNo, regNo);

		System.out.println("\nRoll No - " + kiitian.rollNo);
		System.out.println("Registration No - " + kiitian.regNo);

		kiitian.course();
	}
}
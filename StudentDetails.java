/*WAP to input and display the details of n no. of students having roll, name, CGPA as data members. Also display the name of the student having lowest CGPA.*/

import java.util.Scanner;

class Student {
	int roll;
    	String name;
    	double cgpa;

    	Student(int roll, String name, double cgpa) {
        	this.roll = roll;
        	this.name = name;
        	this.cgpa = cgpa;
    	}

    	void displayDetails() {
		System.out.println("Roll No: " + roll);
        	System.out.println("Name: " + name);
        	System.out.println("CGPA: " + cgpa);
    	}
}

class StudentDetails {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of students: ");
        	int n = sc.nextInt();

        	Student[] students = new Student[n];

        	for (int i = 0; i < n; i++) {
            		System.out.println("Enter details for student " + (i + 1));
            		System.out.print("Roll No: ");
            		int roll = sc.nextInt();
            		sc.nextLine();
            		System.out.print("Name: ");
            		String name = sc.nextLine();
            		System.out.print("CGPA: ");
            		double cgpa = sc.nextDouble();

            		students[i] = new Student(roll, name, cgpa);
        	}

        	int lowestIndex = 0;
        	double lowestCGPA = students[0].cgpa;
        	for (int i = 1; i < n; i++) {
            		if (students[i].cgpa < lowestCGPA) {
                		lowestIndex = i;
                		lowestCGPA = students[i].cgpa;
            		}
        	}

        	System.out.println("\nStudent Details:");
        	for (Student student : students) {
            		student.displayDetails();
            		System.out.println();
        	}

        	System.out.println("\nStudent with the lowest CGPA:");
        	students[lowestIndex].displayDetails();
    	}
}

//Program to print corresponding grade for a given mark

import java.util.Scanner;
class Grade{
	public static void main(String[] args){
		int marks;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		marks = sc.nextInt();
		if(marks >= 90 && marks <= 100)
			grade = 'O'; 
		else if(marks >= 80 && marks <= 89)
			grade = 'E';
		else if(marks >= 70 && marks <= 79)
			grade = 'A'; 
		else if(marks >= 60 && marks <= 69)
			grade = 'B'; 
		else if(marks >= 50 && marks <= 59)
			grade = 'C'; 
		else
			grade = 'F';
		System.out.println("Grade = " + grade);
	}

}
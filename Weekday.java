//Program to print the weekday for a given day no of the current month using switch case

import java.util.Scanner;
class Weekday{
	public static void main(String[] args){
		int dayNo, choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number");
		dayNo = sc.nextInt();
		choice = dayNo % 7;
		switch(choice){
			case 0 : System.out.println("Sunday");
				 break;
			case 1 : System.out.println("Monday");
				 break;
			case 2 : System.out.println("Tuesday");
				 break;
			case 3 : System.out.println("Wednesday");
				 break;
			case 4 : System.out.println("Thursday");
				 break;
			case 5 : System.out.println("Friday");
				 break;
			case 6 : System.out.println("Saturday");
				 break;
			default : System.out.println("Please enter proper day number");
		}

	}
}
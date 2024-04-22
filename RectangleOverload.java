/*WAP in java using constructor overloading to calculate the area of a reactangle having data members as length and breadth. Use default constructor to initialize the data members to 0 & parameterized constructor to initialize the data members according to user input.*/

import java.util.Scanner;

class Rectangle {
	double length;
	double breadth;
	
	Rectangle() {
		length = 0;
		breadth = 0;
	}
	
	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double Area() {
		return length * breadth;
	}
}

class RectangleOverload {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your choice :\n1. Default(length = 0, breadth = 0)\n2. Enter dimensions");
        	int choice = sc.nextInt();

		switch(choice) {
			case 1:
				Rectangle rect1 = new Rectangle();
				System.out.println("Area of rectangle 1(default) = " + rect1.Area());
				break;
			case 2:
				System.out.println("Enter length: ");
                		double length = sc.nextDouble();
                		System.out.println("Enter breadth: ");
                		double breadth = sc.nextDouble();
				Rectangle rect2 = new Rectangle(length, breadth);
				System.out.println("Area of rectangle 2 = " + rect2.Area());
				break;
			default:
				System.out.println("Invalid choice !");
		}
	}
}
		
			
	
	
	



	
	
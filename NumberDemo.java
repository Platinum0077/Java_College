/*Write a java class that has a method called ProcessInput(). This method checks the number entered by the user. If the entered number is negative, then throw a user defined exception NegativeNumberException, otherwise it displays double value of the number*/

import java.util.Scanner;

class NegativeNumberException extends Exception {
	public NegativeNumberException(String message) {
		super(message);
	}
}

class NumberDemo {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		number = sc.nextInt();
		
		try {
			ProcessInput(number);
		}
		catch(NegativeNumberException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

	public static void ProcessInput (int number) throws NegativeNumberException {
		if(number < 0) {
			throw new NegativeNumberException ("Exception caught. Negative number is not allowed");
		}
		else {
			int result = number * 2;
			System.out.println("Double value of " + number + " is " + result);
		}
	}
}
//Handle an arithmetic exception using try, catch and finally blocks

import java.util.Scanner;

class ArithmeticExc {
	public static void main(String[] args) {
		int n, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		try {
			d = n / 0;
			System.out.println("This will not print");
		}
		catch (ArithmeticException e) {
			System.out.println("Exception caught. Division by 0 is not allowed.");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
}
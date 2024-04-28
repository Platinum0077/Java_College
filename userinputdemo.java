/*
	1. WAP to get user input from console using scanner 
*/
import java.util.Scanner;
class userinputdemo {
	public static void main(String[] args) {
		int a,b,c,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a+b+c;
		System.out.println("The sum of 3 numbers is = "+sum);
	}
}
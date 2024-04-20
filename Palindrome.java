//Program to check a user input number is palindrome or not

import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
		int n,m,rev=0,d;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = n;
		while(n != 0){
			d = n%10;
			rev = (rev*10)+d;
			n = n/10;
		}
		if(m == rev){
			System.out.println(m + " is palindrome");
		}
		else{
			System.out.println(m + " is not palindrome");
		}
	}
}
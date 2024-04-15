//Generate an ArrayIndexOutofBoundsException and handle it using catch statement

import java.util.Scanner;

class ArrayIndexExc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		try {
			for(int i = 0; i <= n; i++) {
				arr[i] = sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught. Array index is out of range.");
		}
	}
}
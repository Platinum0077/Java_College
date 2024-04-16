/*Multilevel inheritance with 3 Java classes - plate(length, width), box(length, width, height), woodbox(length, width, height, thick) where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user.*/


import java.util.Scanner;
class plate {
	int length, width;
	plate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		length = sc.nextInt();
		System.out.println("Enter width");
		width = sc.nextInt();
		System.out.println("Creating plate object");
	}
	void display() {
		System.out.println("Dimensions of plate object are : " + "length = " + length + " and width = " + width);
	}
}

class box extends plate {
	int height;
	box() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		length = sc.nextInt();
		System.out.println("Enter width");
		width = sc.nextInt();
		System.out.println("Enter height");
		height = sc.nextInt();
		System.out.println("Creating box object");
	}
}

class woodbox extends box {
	int thickness;
	woodbox() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		length = sc.nextInt();
		System.out.println("Enter width");
		width = sc.nextInt();
		System.out.println("Enter height");
		height = sc.nextInt();
		System.out.println("Enter thickness");
		thickness = sc.nextInt();
		System.out.println("Creating woodbox object");
	}
}

class DemoBox {
	public static void main(String[] args) {
		woodbox w = new woodbox();
		plate p = new plate();
	}
}


import java.util.Scanner;

class Account {
	long acc_no;
	double balance;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number");
		acc_no = sc.nextLong();
		System.out.println("Enter balance");
		balance = sc.nextDouble();
	}
	void disp() {
		System.out.println("Account No : " + acc_no);
		System.out.println("Balance : " + balance);
	}
}

class Person extends Account {
	String name;
	long aadhar_no;
	Person(String name, long aadhar_no) {
		this.name = name;
		this.aadhar_no = aadhar_no;
	}
	void disp() {
		System.out.println("\nName : " + name);
		System.out.println("Aadhar No : " + aadhar_no);
		System.out.println("Account No : " + acc_no);
		System.out.println("Balance : " + balance);
	}
}

class BankDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person [] = new Person[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter details of person " + (i+1));
			System.out.println("Enter name ");
			String name = sc.next();
			System.out.println("Enter aadhar no ");
			long aadhar_no = sc.nextLong();
			Person p = new Person(name, aadhar_no);
			p.input();
			person[i] = p;
		}
		for(Person p : person) {
			p.disp();
		}
	}
}
			
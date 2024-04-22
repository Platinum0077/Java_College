/*3. Aim of the program -Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class ‘Manager’ which uses this interface without implementing bonus() method. Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements bonus() method.  Write the complete program to find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by the user as per the following guidelines –
earnings           basic + DA (80% of basic) + HRA (15% of basic)
deduction PF       12% of basic
bonus              50% of basic
	Input -Basic salary - 50000
	Output -Earnings -  97500
	Deduction -6000
	Bonus - 25000*/


import java.util.Scanner;

interface Employee {
	double earnings(double basicSalary);
	double deductions(double basicSalary);
	double bonus(double basicSalary);
}

class Manager implements Employee {
	public double earnings(double basicSalary) {
		double DA = 0.8 * basicSalary;
		double HRA = 0.15 * basicSalary;
		return basicSalary + DA + HRA;
	}
	
	public double deductions(double basicSalary) {
		return 0.12 * basicSalary;
	}

	public double bonus(double basicSalary) {
        	return 0.0;
    }
}

class Substaff extends Manager {
	public double bonus(double basicSalary) {
		return 0.50 * basicSalary;
	}
}

class SalaryDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basic salary :");
		double basicSalary = sc.nextDouble();

		Substaff substaff = new Substaff();
		
		double earnings = substaff.earnings(basicSalary);
        	double deductions = substaff.deductions(basicSalary);
        	double bonus = substaff.bonus(basicSalary);
       
        	System.out.println("\nEarnings: " + earnings);
        	System.out.println("Deductions: " + deductions);
        	System.out.println("Bonus: " + bonus);
	}
}


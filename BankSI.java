interface PersonalLoan {
	float findSimpleInterest(float principal, int year);
}

class Bank1 implements PersonalLoan {
	static float interestRate = 0.10f;

    	Bank1() {
        	System.out.println("Welcome to Bank1");
    	}
    
    	public float findSimpleInterest(float principal, int year) {
        	return principal * interestRate * year;
    	}

    	void display() {
        	System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    	}
}

class Bank2 implements PersonalLoan {
	static float interestRate = 0.15f;

    	Bank2() {
        	System.out.println("Welcome to Bank2");
    	}

    	public float findSimpleInterest(float principal, int year) {
        	return principal * interestRate * year;
    	}

    	void display() {
        	System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    	}
}

class BankSI {
	public static void main(String[] args) {
       
        	Bank1 bank1 = new Bank1();
        	bank1.display();
        	float interest1 = bank1.findSimpleInterest(10000, 2);
        	System.out.println("Simple Interest for Bank1: " + interest1);

        	System.out.println();

        	Bank2 bank2 = new Bank2();
        	bank2.display();
        	float interest2 = bank2.findSimpleInterest(10000, 2);
        	System.out.println("Simple Interest for Bank2: " + interest2);
    	}
}




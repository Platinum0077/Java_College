/*Program to create user defined exceptions HrsException, MinException and SecException. Create a class Time which contains data members hours, minutes, seconds and a method to take a time from user which throws the user defined exceptions if hours (>24 & <0), minutes (>60 & <0), seconds (>60 & <0)*/

import java.util.Scanner;

class HrsException extends Exception {
	public HrsException(String message) {
		super(message);
	}
}

class MinException extends Exception {
	public MinException(String message) {
		super(message);
	}
}

class SecException extends Exception {
	public SecException(String message) {
		super(message);
	}
}

class Time {
	int hours;
	int minutes;
	int seconds;

	public void setTime () throws HrsException, MinException, SecException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter hours : ");
		hours = sc.nextInt();
		if(hours > 24 || hours < 0) {
			throw new HrsException("Hours should be between 0 and 24");
		}

		System.out.println("Enter minutes : ");
		minutes = sc.nextInt();
		if(minutes > 60 || minutes < 0) {
			throw new MinException("Minutes should be between 0 and 60");
		}

		System.out.println("Enter seconds : ");
		seconds = sc.nextInt();
		if(seconds > 60 || seconds < 0) {
			throw new SecException("Seconds should be between 0 and 60");
		}

	}
	
	public void displayTime() {
		System.out.println("Time -> " + hours + " : " + minutes + " : " + seconds);
	}
}

class TimeDemo {
	public static void main(String[] args) {
		Time time = new Time();
		
		try {
			time.setTime();
			time.displayTime();
		}
		catch(HrsException e) {
			System.out.println("Error : " + e.getMessage());
		}
		catch(MinException e) {
			System.out.println("Error : " + e.getMessage());
		}
		catch(SecException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
	
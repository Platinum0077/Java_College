/*
	2. WAP to get user input from console using by command line arguments
*/
class userinputcmdline {
	public static void main(String[] args) {
		int a,b,c,sum = 0;

		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		sum = a+b+c;
		System.out.println("The sum of 3 numbers is = "+sum);
	}
}
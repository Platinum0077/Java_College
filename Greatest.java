//Find largest among three numbers by command line arguments

class Greatest{
	public static void main(String[] args){
		int num1,num2,num3;
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		num3 = Integer.parseInt(args[2]);
		if(num1 > num2 && num1 > num3)
			System.out.println("Greatest number is " + num1);
		else if(num2 > num1 && num2 > num3)
			System.out.println("Greatest number is " + num2);
		else
			System.out.println("Greatest number is " + num3);
	}
}
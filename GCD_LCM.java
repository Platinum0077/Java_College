//To find GCD and LCM of two numbers

class GCD_LCM{
	public static void main(String[] args){
		int num1=48,num2=12,gcd=1,lcm;
		for(int i=1; i<=num1 && i<=num2; i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		System.out.println("GCD is " + gcd);
		lcm=(num1*num2)/gcd;
		System.out.println("LCM is " + lcm);
	}
}

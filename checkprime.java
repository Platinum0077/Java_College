//Check No is prime or not.

class checkprime {
	public static void main(String[] args) {
		int n=6, i=2, flag=0;
		while(i<=n/2){
			if(n%i == 0)
				flag++;
			i++;
		}
		if(flag == 0)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}
}
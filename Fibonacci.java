//Display Fibonacci Series till 50 terms

class Fibonacci {
	public static void main(String[] args){
		long a=0,b=1,i=3,c;
		System.out.println(a+"\n"+b);
		while(i<=50){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}

	}

}
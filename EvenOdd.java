//Program to take 10 numbers as input and check how many are odd and how many are even

class EvenOdd{
	public static void main(String[] args){
		int i,n,ce=0,co=0;
		for(i=0;i<10;i++){
			n=Integer.parseInt(args[i]);
			if(n%2==0)
				ce++;
			else
				co++;
		}
		System.out.println("Number of even numbers = " + ce);
		System.out.println("Number of odd numbers = " + co);
	}
}
			
//Display prime numbers from 1 to 100

class DisplayPrime {
	public static void main(String[] args){
		int flag,n,i;
		for(n=1;n<=100;n++){
			flag=0;
			i=2;
			while(i<=n/2){
				if(n%i==0)
					flag=1;
				i++;
			}
			if(flag==0)
				System.out.println(n);
		}
	}
}
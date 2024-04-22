//Display Prime between 1 to 100

class Prime1to100 {
	public static void main(String[] args) {
		int n=2;
		while(n<100){
			int i = 2 , flag = 0;
			while(i<=n/2){
				if(n%i == 0)
					flag++;
				i++;
			}
			if(flag == 0)
				System.out.println(n);
			n++;
		}
	}
}
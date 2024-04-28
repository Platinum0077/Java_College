/*
	3. WAP to get user input by InputStreamReader and BuffReader classes
*/
import java.io.*;
class userinputIODemo {
	public static void main(String[] args) throws Exception {
		int a,b,c,sum = 0;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		sum = a+b+c;
		System.out.println("The sum of 3 numbers is = "+sum);
	}
}
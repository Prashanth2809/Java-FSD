package typecasting;
import java.util.Scanner;
public class explicit {

	public static void main(String [] args) {
		double a=23.67;
		int b=(int)a;
		System.out.println(b);
		
		//int to string we use String.Valueof() method
		int num=200;
		String res= String.valueOf(num);
		System.out.println(num);
		
		
		//string to int we use Integer.ParseInt() method
		String val="202";
		int n= Integer.parseInt(val);
		System.out.println(num);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int v=sc.nextInt();
		char c=(char) v;
		
		System.out.println("Charactr value of given interger:"+c);
		
		
	}
}



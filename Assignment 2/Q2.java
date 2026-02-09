package pkg2_2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter two numbers:-");
		int a=in.nextInt();
		int b=in.nextInt();
		if(a<0||b<0)
		{
			System.out.print("Enter two positive numbers");
		}
		else
		{
			
				System.out.print("Power Calculator "+a+" "+b+" = "+(int)Math.pow(a, b));
			
		}
	}

}

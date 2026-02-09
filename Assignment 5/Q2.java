import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=in.nextInt();
		System.out.print("Enter second number:");
		int b=in.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<=(int)(Math.max(a,b))/2;i++)
		{
			if(a%i==0)
			{
				sum1=sum1+i;
			}
			if (b%i==0)
			{
				sum2=sum2+i;
			}
		}
		if(sum1==b && sum2==a)
		{
			System.out.print(a+" and "+b+" are amicable numbers. ");
		}
		else
		{
			System.out.print(a+" and "+b+" are not amicable numbers. ");
		}
	}
}
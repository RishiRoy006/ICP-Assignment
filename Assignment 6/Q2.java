import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Armstrong Numbers from 100 to 10000: ");
		for(int i=100;i<=10000;i++)
		{
			if(isArmstrong(i)==true)
			{
				System.out.println(i);
			}
		}
	}
	public static int countDigits(int n)
	{
		int c=0, n1 = n;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		return c;
	}
	public static int power(int a, int b)
	{
		return (int)(Math.pow(a,b));

	}
	public static boolean isArmstrong(int n) 
	{
		int sum=0;
		int k=n;
		while(k>0)
		{
			int d=k%10;
			sum=sum+power(d,countDigits(n));
			k=k/10;
		}
		if(sum==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

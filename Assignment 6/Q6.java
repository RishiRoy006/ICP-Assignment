import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int x=in.nextInt();
		System.out.print("Enter second number: ");
		int y=in.nextInt();
		System.out.println("Sum of proper divisors of "+x+" = "+sumOfDivisors(x));
		System.out.println("Sum of proper divisors of "+y+" = "+sumOfDivisors(y));
		if(isFriendlyPair(x,y)==true)
		{
			System.out.println(x+" and "+y+" are a Friendly Pair.");
		}
		else
			System.out.println(x+" and "+y+" are not a Friendly Pair.");
	}
	public static int sumOfDivisors(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static Boolean isFriendlyPair(int a, int b)
	{
		if(sumOfDivisors(a)/a==sumOfDivisors(b)/b) {
			return true;
		}
		else
			return false;
	}
}

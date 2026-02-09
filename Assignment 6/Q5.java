import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=in.nextInt();
		System.out.print("Collatz length: "+collatzLength(n));
	}
	public static int collatzLength(int n)
	{
		int c=0;
		while(n>1)
		{
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=3*n+1;
			}
			c++;
		}
		return c;
	}
}

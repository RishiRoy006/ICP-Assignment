import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value of m: ");
		int m=in.nextInt();
		System.out.print("Enter the value of n: ");
		int n=in.nextInt();
		for(int i=m;i<=n;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println("Factorial of "+i+" is: "+fact);
		}
	}
}

import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1=in.nextInt();
		System.out.print("Enter second number: ");
		int n2=in.nextInt();
		int ctr=0,maxctr=0,i;
		for(i=n1;i<=n2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) 
				{
					ctr++;
				}
			}
			if(ctr>=maxctr)
			{
				maxctr=ctr;
			}
		}
		System.out.println("The number with the most divisors is "+i);
		System.out.print("Number of divisors: "+maxctr);
	}

}

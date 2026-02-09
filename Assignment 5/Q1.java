import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int ctr=0;
		System.out.print("Enter a number: ");
		int num=in.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				ctr++;
			}
		}
		int k=num,rev=0;
		while(k>0)
		{
			int d=k%10;
			rev=rev*10+d;
			k=k/10;
		}
		int c=0;
		for(int i=2;i<rev;i++)
		{
			if(rev%i==0)
			{
				c++;
			}
		}
		if(ctr==0 && c==0)
		{
			System.out.print(num+"  is twisted prime.");
		}
		else
		{
			System.out.print(num+"  is not a twisted prime.");
		}
	}
}
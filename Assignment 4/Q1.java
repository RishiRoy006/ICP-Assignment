import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum=0,n;
		System.out.print("Enter a number: ");
		n=in.nextInt();
		int k=n;
		while(k>0)
		{
			int d=k%10;
			sum=sum+d;
			k=k/10;
		}
		if(sum%9==0)
		{
			System.out.print("The number "+n+" is divisible by 9.");
		}
		else 
		{
			System.out.print("The number "+n+" is not divisible by 9.");
		}
	}

}

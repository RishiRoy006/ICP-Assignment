import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,rev=0;
		System.out.print("Enter a number: ");
		n=in.nextInt();
		int k=n;
		while(k>0)
		{
			int d=k%10;
			rev=rev*10+d;
			k=k/10;
		}
		System.out.println("Reversed number: "+rev);
		if(rev==n)
		{
		System.out.print(+n+" is a palindrome.");
		}
		else
		{
			System.out.print(+n+" is not a palindrome.");
		}
		
	}
}
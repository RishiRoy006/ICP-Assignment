import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
System.out.print("Enter an integer: ");
int num=in.nextInt();
System.out.print("Largest digit: "+largestDigit(num));
	}
	public static int largestDigit(int n)
	{
		int maxDigit=0;
		while(n>0)
		{
			int d=n%10;
			if(d>maxDigit)
			{
				maxDigit=d;
			}
			n=n/10;
		}
		return maxDigit;
	}
}

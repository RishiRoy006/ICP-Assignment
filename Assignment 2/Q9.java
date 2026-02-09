import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int S=0;
		System.out.print("Enter a number between 0 and 1000:");
		int n=in.nextInt();
		while(n>0)
		{
			S=S+n%10;
			n=n/10;
		}
		System.out.print("The sum of the digits is: "+S);
	}

}

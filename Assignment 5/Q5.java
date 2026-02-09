import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the value of n: ");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j = 1 ; j <= i ; j++)
                sum += j;
		}
		System.out.print("The sum of the series is: "+sum);
	}

}

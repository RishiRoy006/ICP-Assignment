import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double sum=0.0;
		int n;
		System.out.print("Enter n: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+1/(Math.pow(i,2));
		}
		System.out.print("Sum = "+sum);
	}
}

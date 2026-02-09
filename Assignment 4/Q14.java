import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,S=0,P=1;
		System.out.print("Enter the value of N: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				S=S+i;
			}
			else
			{
				P=P*i;
			}
		}
		System.out.println("Sum of all even numbers = "+S);
		System.out.print("Product of all odd numbers = "+P);
	}

}

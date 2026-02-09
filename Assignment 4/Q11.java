import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,S=0;
		System.out.print("Enter a number: ");
		n=in.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				S=S+i;
			}
		}
		if(S==n)
		{
			System.out.print(+n+" is a perfect number.");
		}
		else
		{
			System.out.print(+n+" is not a perfect number.");
		}
	}

}

import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=in.nextInt();
		int k=n,S=0;
		while(k>0)
		{
			int d=k%10;
			S=S+d;
			k=k/10;
		}
		if(S%9==0)
		{
			System.out.print(+n+" is a Niven number.");
		}
		else
		{
			System.out.print(+n+" is a not Niven number.");
		}
	}
}

import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the rangNe (N): ");
		int n=in.nextInt();
		int S=0;
		for(int i=1;i<n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				S=S+i;
			}
		}
		System.out.print("The sum of all multiples of 3 or 5 below "+n+" is: "+S);
	}

}

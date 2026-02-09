import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum=0,a,b,c;
		System.out.print("Enter first number: ");
		a=in.nextInt();
		System.out.print("Enter second number: ");
		b=in.nextInt();
		System.out.print("Enter third number: ");
		c=in.nextInt();
		for(int i=a;i<=b;i+=c)
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.print("The sum of number displayed is "+sum);
	}
}

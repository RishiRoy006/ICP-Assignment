import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter first side: ");
		a=in.nextInt();
		System.out.print("Enter second side: ");
		b=in.nextInt();
		System.out.print("Enter third side: ");
		c=in.nextInt();
		if((a+b)>c && (b+c)>a && (c+a)>b) 
		{
		if(a==b && b==c)
		{
			System.out.print("The triangle is Equilateral.");
		}
		else if(a==b || b==c || c==a)
		{
			System.out.print("The triangle is Isosceles.");
		}
		else if(a!=b && b!=c && c!=a)
		{
			System.out.print("The triangle is Scalene.");
		}
		}
		else
		{
			System.out.print("The given sides do not form a valid triangle.");
		}
	}

}

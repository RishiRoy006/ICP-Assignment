import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		double s;
		System.out.print("Enter number of sides:");
		n=in.nextInt();
		System.out.print("Enter length of each side:  ");
		s=in.nextDouble();
		System.out.print("Area of the regular polygon: "+area(n,s));
	}
	public static double area(int n, double side)
	{
		return (n*Math.pow(side, 2)/(4*Math.tan(Math.PI/n)));
	}
}

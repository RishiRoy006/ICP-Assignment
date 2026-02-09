import java.util.Scanner;
public class Q4 {
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	double side;
	System.out.print("Enter the side:");
	side=in.nextDouble();
	System.out.print("The area of the hexagon is "+(3*Math.sqrt(3)*Math.pow(side,2))/2);
}
}

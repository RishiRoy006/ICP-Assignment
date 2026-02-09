import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double x1,x2,y1,y2;
		System.out.print("Enter x1 and y1: ");
		x1=in.nextDouble();
		y1=in.nextDouble();
		System.out.print("Enter x2 and y2: ");
		x2=in.nextDouble();
		y2=in.nextDouble();
		
		double distance=Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
		System.out.print("The distance between the two points is"+distance);

	}

}

import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		double x1=in.nextDouble();
		double y1=in.nextDouble();
		double x2=in.nextDouble();
		double y2=in.nextDouble();
		double x3=in.nextDouble();
		double y3=in.nextDouble();
		double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Calculate the semi-perimeter (s)
        double s = (side1 + side2 + side3) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.print("The area of the triangle is:"+area);
	}

}

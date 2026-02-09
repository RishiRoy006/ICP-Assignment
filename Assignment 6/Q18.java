import java.util.Scanner;
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("=== VOLUME CALCULATOR (Method Overloading) ===");
		System.out.println("1. Volume of Cube");
		System.out.println("2. Volume of Rectangular Prism (Cuboid)");
		System.out.println("3. Volume of Sphere");
		System.out.println("4. Volume of Cylinder");
		System.out.println("Exit");
		System.out.print("Enter your choice: ");
		int choice=in.nextInt();
		switch (choice)
		{
		case 1:
			System.out.print("Enter side:");
		int s=in.nextInt();
		System.out.println("Volume of Cube: "+volume((s)));
		break;
		case 2:
			System.out.print("Enter length:");
			int l=in.nextInt();
			System.out.print("Enter width:");
			int w=in.nextInt();
			System.out.print("Enter height:");
			int h=in.nextInt();
			System.out.println("Volume of Rectangular Prism: "+volume(l,w,h));
			break;
		case 3:
			System.out.print("Enter radius:");
			int r=in.nextInt();
			System.out.println("Volume of Sphere: "+volume(r));
			break;
		case 4:
			System.out.print("Enter radius:");
			int radius=in.nextInt();
			System.out.print("Enter height:");
			int height=in.nextInt();
			System.out.println("Volume of Cylinder: "+volume(radius,height));
		}
		}
	public static double volume(int side)
	{
		return Math.pow(side, 3);
	}
	public static double volume(double length, double width,
			double height)

	{
		return  length*width*height;
	}
	public static double volume(double radius)

	{
		return 4/3*Math.PI*Math.pow(radius, 3);
	}
	public static double volume(double radius, double height)
	{
		return Math.PI*Math.pow(radius,2)*height;
	}
}

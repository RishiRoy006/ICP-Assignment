import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		double radius,len,area,vol;
		System.out.print("Enter the radius and length of a cylinder:");
		radius=sc.nextDouble();
		len=sc.nextDouble();
		area=Math.PI*radius * radius;
		vol=area*len;
		System.out.println("The area is "+area);
		System.out.print("The volume is "+vol);
	}

}

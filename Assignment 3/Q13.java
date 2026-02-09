import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double x,y;
		System.out.print("Enter x-coordinate:");
		x=in.nextDouble();
		System.out.print("Enter y-coordinate:");
		y=in.nextDouble();
		if(x==0&&y>0)
		{
			System.out.print("("+x+","+y+") is on the Y-axis");
		}
		else if(x>0&&y==0)
		{
			System.out.print("("+x+","+y+") is on the X-axis");
		}
		else if(x>0&&y>0)
		{
			System.out.print("("+x+","+y+") is in quadrant I");
		}
		else if(x<0&&y>0)
		{
			System.out.print("("+x+","+y+") is in quadrant II");
		}
		else if(x<0&&y<0)
		{
			System.out.print("("+x+","+y+") is in quadrant III");
		}
		else if(x>0&&y<0)
		{
			System.out.print("("+x+","+y+") is in quadrant IV");
		}
	}

}

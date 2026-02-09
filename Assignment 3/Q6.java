import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double a,b,c,r1,r2,d;
		System.out.print("Enter a, b, c: ");
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		d=Math.pow(Math.pow(b, 2)-4*a *c,0.5);
		r1=(-b+d)/2*a;
		r2=(-b-d)/2*a;
		if(d>0)
		{
			System.out.print("The equation has two roots "+r1+"and "+r2);
		}
		else if(d==0)
		{
			r1=-b/(2*a);
			System.out.print("The equation has one root "+r1);
		}
		else
		{
			System.out.print("The equation has no real roots");
		}
	}

}

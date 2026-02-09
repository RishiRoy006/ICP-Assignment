import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x,y,ch;
		System.out.println("----- SIMPLE CALCULATOR -----");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Remainder");
		System.out.println("6. Square Root");
		System.out.println("7. Exit");
		System.out.print("Choose an option: ");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.print("Enter first number (x):");
			x=in.nextInt();
			System.out.print("Enter second number (y):");
			y=in.nextInt();
			System.out.print("Result (x+y) = "+additionSimple(x,y));
			break;
		}
		case 2:
		{
			System.out.print("Enter first number (x):");
			x=in.nextInt();
			System.out.print("Enter second number (y):");
			y=in.nextInt();
			System.out.print("Result (y-x) = "+subtractionSimple(x,y));
			break;
		}
		case 3:
		{
			System.out.print("Enter first number (x):");
			x=in.nextInt();
			System.out.print("Enter second number (y):");
			y=in.nextInt();
			System.out.print("Result (x*y) = "+multiplicationSimple(x,y));
			break;
		}
		case 4:
		{
			System.out.print("Enter first number (x):");
			x=in.nextInt();
			System.out.print("Enter second number (y):");
			y=in.nextInt();
			if(x==0)
			{
				System.out.println("Error! Division by zero is not allowed.");
			}
			else
				System.out.print("Result (y/x) = "+divisionSimple(x,y));
			break;
		}
		case 5:
		{
			System.out.print("Enter first number (n):");
			int n=in.nextInt();
			System.out.print("Enter second number (m):");
			int m=in.nextInt();
			System.out.print("Result (n % m) = "+remainderSimple(n,m));
			break;
		}
		case 6:
		{
			System.out.print("Enter number for square root:");
			int n=in.nextInt();
			if(n<0)
			{
				System.out.println("Error! Square root of a negative number is not allowed.");
			}
			System.out.print("Result = "+squareRootSimple(n));
			break;
		}
		case 7:
		{
			System.out.println("Exiting... Thank you!");
			break;
		}
		default:
			System.out.println("Invalid input");
		}
	}
	public static int additionSimple(int x, int y)
	{
		return x+y;
	}
	public static int subtractionSimple(int x, int y)
	{
		return (int)(Math.abs(y-x));
	}
	public static int multiplicationSimple(int x, int y)
	{
		return x*y;
	}
	public static double divisionSimple(int x, int y)
	{
			return (y/x);
	}
	public static int remainderSimple(int n, int m)
	{
		return n%m;
	}
	public static double squareRootSimple(int n)
	{
			return (Math.sqrt(n));
	}
	
}

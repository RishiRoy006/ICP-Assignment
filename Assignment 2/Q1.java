import java.util.Scanner;
public class Q1 {
	
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int tempInCel;
	double tempInFaren;
	System.out.print("56Enter a degree in Celsius:");
	tempInCel=in.nextInt();
	tempInFaren = (9.0 / 5) * tempInCel + 32; 
	System.out.println(+tempInCel+" Celsius is "+tempInFaren+" Fahrenheit");
}
}

import java.util.Scanner;
public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Input the first number:");
		int x=in.nextInt();
		System.out.print("Input the second number:");
		int y=in.nextInt();
		System.out.print("Input the third number:");
		int z=in.nextInt();
		if(consecutive(x,y,z)==true)
			System.out.println("The thre numbers are consecutive.");
		else
			System.out.println("The thre numbers are not consecutive.");
	}
public static boolean consecutive(int a,int b,int c)
{
	if((boolean)(Math.abs(b-a)==1 && Math.abs(c-b)==1))
{
	return true;
}
else
	return false;
}
}

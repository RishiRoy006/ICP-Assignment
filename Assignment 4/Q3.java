import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int num;
do {
	System.out.print("Enter a number (0 to stop): ");
	num=in.nextInt();
	if(num!=0)
	{
		if(num%2==0)
		{
			System.out.println(num+"is an even number.");
		}
		else
		{
			System.out.println(num+"is an odd number.");
		}
	}
}while(num!=0);
System.out.println("Program stopped.");
}
}
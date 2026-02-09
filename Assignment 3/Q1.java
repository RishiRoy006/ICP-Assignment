import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
System.out.println("Enter the age of the person:");
int age=in.nextInt();
if(age>=18)
{
	System.out.print("You are eligible to cast your vote");
}
else
{
	System.out.print("You are not eligible to cast your vote");
}
	}

}

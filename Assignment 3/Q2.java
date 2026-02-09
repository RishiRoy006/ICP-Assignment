import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
System.out.println("Enter the number of steps walked:");
int steps=in.nextInt();
if(steps>=10000)
{
	System.out.print("Good job! You are active today");
}
else
{
	System.out.print("You need to walk more for good health");
}
	}

}

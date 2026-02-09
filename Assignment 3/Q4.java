import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int num;
System.out.print("Enter user number:");
num=in.nextInt();
int guess=(int)((Math.random()*9)+1);
System.out.println("computer guesses: "+guess);
if(num==guess)
{
	System.out.print("You got it right");
}
else if(num==guess+1 || num==guess-1)
{
	System.out.print("Almost got it");
}
else
{
	System.out.print("You got it wrong");
}
	}

}

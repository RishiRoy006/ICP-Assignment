import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num=in.nextInt();
		if(isPalindrome(num)==true)
		System.out.println(num+" is a palindrome.");
		else
			System.out.println(num+" is not a palindrome.");
	}
	public static int reverse(int number)
	{
		int num=number;
		int rev=0;
		while(num>0)
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		return rev;
	}
	public static boolean isPalindrome(int number)
	{
		if(reverse(number)==number)
		{
			return true;
		}
		else
			return false;
	}
}

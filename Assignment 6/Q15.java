import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=in.nextLine();
		if(isPalindrome(s)==true)
		System.out.print(s+" is a palindrome");
		else
			System.out.print(s+" is not a palindrome");
	}
	public static boolean isPalindrome(String str)
	{
		String w="";
		for(int i=str.length()-1;i>=0;i--)
		{
			w=w+str.charAt(i);
		}
		if(w.equals(str))
		{
			return true;
		}
		else
			return false;
	}
}

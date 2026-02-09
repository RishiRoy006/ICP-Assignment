import java.util.Scanner;
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=in.nextLine();
		countCharacters(s);
	}
	public static void countCharacters(String str)
	{
		int up=0,low=0,special=0,digit=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isUpperCase(c))
			{
				up++;
			}
			else if(Character.isLowerCase(c))
			{
				low++;
			}
			else if(Character.isDigit(c))
			{
				digit++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Uppercase letters: "+up);
		System.out.println("Lowercase letters: "+low);
		System.out.println("Digits: "+digit);
		System.out.println("Special characters: "+special);
	}
}

import java.util.Scanner;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Input a string: ");
		String s=in.nextLine();
		System.out.print("The middle character in the string: "+getMiddleCharacter(s));
	}
	public static char getMiddleCharacter(String str) 
	{
		return str.charAt(str.length()/2);
	}
	}
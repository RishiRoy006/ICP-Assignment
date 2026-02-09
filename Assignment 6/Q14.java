 import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=in.nextLine();
		System.out.print("Converted string: "+toTitleCase(s));
	}
	public static String toTitleCase(String str)
	{
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
			{
				Character.toUpperCase(str.charAt(i+1));
			}
		}
		return str;
	}
}
//not executing
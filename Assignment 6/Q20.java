import java.util.Scanner;
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=in.nextLine();
		System.out.print("Number of spaces in the string: "+countSpaces(s));
	}
	public static int countSpaces(String str)
	{
		int ctr=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
			{
				ctr++;
			}
		}
		return ctr;
	}
}

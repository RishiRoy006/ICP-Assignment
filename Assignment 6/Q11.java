import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=in.nextLine();
		System.out.print("Enter a charater:");
		char c=in.next().charAt(0);
		System.out.print("The number of occurrences of '"+c+"' in "+s+" is "+count(s,c));
	}
	public static int count(String str, char a)
	{
		int ctr=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==a)
				ctr++;
		}
		return ctr;
	}
}

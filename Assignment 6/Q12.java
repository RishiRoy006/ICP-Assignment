import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=in.nextLine();
		System.out.print("The number of vowels in "+s+" is "+countVowels(s));
	}
	public static int countVowels(String str)
	{
		int ctr=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				ctr++;
		}
		return ctr;
	}
}

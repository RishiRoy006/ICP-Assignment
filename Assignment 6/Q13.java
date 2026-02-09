import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=in.nextLine();
		System.out.print("The number of words in the sentence is "+countWords(s));
	}
	public static int countWords(String str)
	{
		str=str+" ";
		String w="";
		int ctr=0;
		int x,p=0;
		while(p<str.length()) {
			x=str.indexOf(' ',p);
			w=str.substring(p,x);
			ctr++;
			p=x+1;
		}
		return ctr;
	}
}

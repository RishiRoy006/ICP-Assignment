import java.util.Scanner;
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=in.nextLine();
		System.out.println("Length of the string: "+(s.length()-1));
		System.out.println("First character: "+s.charAt(0));
		System.out.println("Last character: "+s.charAt(s.length()-1));
		System.out.println("String in uppercase: "+s.toUpperCase());
		System.out.println("String in lowercase: "+s.toLowerCase());
		System.out.println("Does the string contain \"Java\"? ");
		System.out.println("Does the string start with \"Hello\"? ");
		System.out.println("Does the string end with \"World\"? ");
		System.out.println("Trimmed string: "+s.trim());
		System.out.println("String after replacing 'a' with '@': "+s.replace('a','@'));
		System.out.println("Substring from index 2 to 7: "+s.substring(2,7));
	}
}

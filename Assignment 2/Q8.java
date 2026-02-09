import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter number of eggs:");
		int no=in.nextInt();
		int gross=no/144;
		int dozen=(no%144)/12;
		int left=(no%144)%12;
		System.out.print("Total number of eggs is "+gross+" gross, "+dozen+" dozen, and "+left+".");
	}

}

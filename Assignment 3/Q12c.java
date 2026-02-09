import java.util.Scanner;
public class Q12c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 System.out.print("Enter the value of a, b, c: ");
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int c = in.nextInt();
	        int largestTernary = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	        System.out.println("Largest number : " + largestTernary);

	}

}

import java.util.Scanner;
public class Q12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 System.out.print("Enter the value of a, b, c: ");
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int c = in.nextInt();
	        int largestLadder;
	        if (a >= b && a >= c) {
	            largestLadder = a;
	        } else if (b >= a && b >= c) {
	            largestLadder = b;
	        } else {
	            largestLadder = c;
	        }
	        System.out.println("Largest number : " + largestLadder);


	}
}
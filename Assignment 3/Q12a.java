import java.util.Scanner;
public class Q12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 System.out.print("Enter the value of a, b, c: ");
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int c = in.nextInt();
	        int largestNested;
	        if (a > b) {
	            if (a > c) {
	                largestNested = a;
	            } else {
	                largestNested = c;
	            }
	        } else {
	            if (b > c) {
	                largestNested = b;
	            } else {
	                largestNested = c;
	            }
	        }
	        System.out.println("Largest number : " + largestNested);

	}

}

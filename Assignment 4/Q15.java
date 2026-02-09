import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum1=0,sum2=0;
		 for(int i=1;i<=100;i++)
		 {
			 sum1=sum1+(int)Math.pow(i,2);
			 sum2=sum2+i;
		 }
		 sum2=sum2*sum2;
		 System.out.println("Sum of squares of first 100 natural numbers = "+sum1);
		 System.out.println("Square of the sum of first 100 natural numbers = "+sum2);
		 int diff=sum2-sum1;
		 System.out.print("Difference = "+diff);
	}
}

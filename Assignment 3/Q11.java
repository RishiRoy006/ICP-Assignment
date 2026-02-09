import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num=in.nextInt();
		boolean res1=num%5==0;
		boolean res2=num%6==0;
		System.out.println("Is " + num + " divisible by 5 and 6? " + (res1 && res2));
        System.out.println("Is " + num + " divisible by 5 or 6? " + (res1 || res2));
        System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + (res1 ^ res2));

		}

}

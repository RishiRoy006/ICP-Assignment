package pkg2_2;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.print("Enter the three numbers:");
int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();
int S=(int)(Math.min(a, Math.min(b,c)));
int L=(int)(Math.max(a, Math.max(b,c)));
int M=a+b+c-S-L;
System.out.print("Ascending Order:"+S+" "+M+" "+L);
	}

}

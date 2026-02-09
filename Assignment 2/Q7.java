package pkg2_2;
import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int s=0;
int firstDie=(int)(Math.random()*6);
int secondDie=(int)(Math.random()*6);
s=firstDie+secondDie;
System.out.println("First die: "+firstDie);
System.out.println("Second die: "+secondDie);
System.out.println("Sum: "+s);
	}
	}

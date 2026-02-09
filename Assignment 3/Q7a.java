import java.util.Scanner;
public class Q7a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.print("Enter a year: ");
int year = in.nextInt();
if (year % 4 == 0) {
    if (year % 100 == 0) {
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
    } else {
        System.out.println(year + " is a leap year.");
    }
} else {
    System.out.println(year + " is NOT a leap year.");
	}
}
}
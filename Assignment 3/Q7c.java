import java.util.Scanner;

public class Q7c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))? year + " is a leap year." : year + " is not a leap year.";
        System.out.println(result);
    }
}
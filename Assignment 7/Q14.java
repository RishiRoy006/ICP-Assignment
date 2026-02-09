import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
        int decimal = in.nextInt();
        String octal = decimalToOctal(decimal);
        System.out.println("Octal representation: " + octal);

	}
	public static String decimalToOctal(int decimal)
	{
		return Integer.toOctalString(decimal);

	}
}

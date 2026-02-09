import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base=in.nextInt();
		System.out.print("Enter the power: ");
		int power=in.nextInt();
		int prod=1;
		for(int i=1;i<=power;i++)
		{
			prod=prod*base;
		}
		System.out.print(+base+" to the power "+power+" is: "+prod);
	}

}

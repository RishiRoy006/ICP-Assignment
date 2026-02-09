import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double bsal,DA,HRA,Gsal;
		System.out.print("Enter basic salary:");
		bsal=in.nextDouble();
		DA=(40.0/100)*bsal;
		HRA=(20.0/100)*bsal;
		Gsal=DA+HRA;
		System.out.println("DA is "+DA);
		System.out.println("HRA is "+HRA);
		System.out.print("Gross salary is "+Gsal);
	}

}

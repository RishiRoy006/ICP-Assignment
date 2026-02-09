import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);	
System.out.println("Enter the number of units consumed:");
double units=in.nextDouble();
System.out.println("Do you want to pay your bill online? (Y/N):");
String choice=in.next();
double bill=0.0;
if(units>0 && units<=50)
{
	bill=units*3.0;
}
else if(units>50 && units<=200)
{
	bill=50*3.0+(units-50)*4.80;
}
else if(units>200 && units<=400)
{
	bill=50*3.0+150*4.80+(units-200)*5.80;
}
else if(units>400)
{
	bill=50*3.0+150*4.80+200*5.80+(units-400)*6.20;
}
else
{
	System.out.println("Invalid input");
}
if(choice.equals("Y"))
{
	double dis=0.03*units;
	System.out.println("You received a 3% online payment discount of Rs. "+dis);
	System.out.println("Total Electricity Bill: Rs. "+bill);
	System.out.println("Amount Payable: Rs. "+(bill-dis));
}
else if(choice.equals("N"))
{
		System.out.println("Total Electricity Bill: Rs. "+bill);
		System.out.println("Amount Payable: Rs. "+bill);
}
else
{
	System.out.println("Invalid Choice");
}
	}
}

import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int firstNo,secondNo,thirdNo;
System.out.print("Input first number:");
firstNo=in.nextInt();
System.out.print("Input second number:");
secondNo=in.nextInt();
System.out.print("Input third number:");
thirdNo=in.nextInt();
if(firstNo>secondNo && secondNo>thirdNo)
{
	System.out.print("Decreasing");
}
else if(firstNo<secondNo && secondNo<thirdNo)
{
	System.out.print("Increasing");
}
else if(firstNo==secondNo && secondNo==thirdNo)
{
	System.out.print("All three are equal");
}
else
{
	System.out.print("Neither Increasing nor decreasing");
}
	}

}

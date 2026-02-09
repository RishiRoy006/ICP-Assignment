import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int a,b;
System.out.print("Enter the first number: ");
a=in.nextInt();
System.out.print("Enter the second number: ");
b=in.nextInt();
System.out.print("Prime numbers between "+a+" and "+b+" are: ");
int ctr;
for(int i=a;i<=b;i++)
{
	ctr=0;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			ctr++;
		}
	}
	if(ctr==0)
	{
		System.out.print(i+" ");
	}
}
}
}

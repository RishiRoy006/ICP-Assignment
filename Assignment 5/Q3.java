import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	System.out.print("Enter a number");
	int num=in.nextInt();
	int k=num,sum=0;
	while(k>0)
	{
		int fact=1;
		int d=k%10;
		for(int i=1;i<=d;i++)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		k=k/10;
	}
	if(sum==num)
	{
		System.out.print(num+" is a Strong number.");
	}
	else
	{
		System.out.print(num+" is not a Strong number.");
	}
	}
}

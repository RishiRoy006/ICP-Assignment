import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int arr[] = null;
System.out.print("Enter the size of the array:");
int size=in.nextInt();
if(size<0)
System.out.println("Array size cannot be negative.");
System.out.print("Random values stored in the array: ");
for(int i=0;i<size;i++)
{
	   arr[i]=(((int)Math.random()*100)+1);
	   System.out.print(arr[i]+" ");
}
System.out.print("Sum of elements = "+findSum(arr));
System.out.print("Average of elements = "+findAverage(arr));
	}
	public static int findSum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static double findAverage(int[] arr)
	{
		double avg=0.0;
		avg=(double)findSum(arr)/(arr.length);
		return avg;
	}
}

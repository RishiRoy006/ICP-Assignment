import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[]=new int[10];
		readArray(arr);
		System.out.print("Enter the number to search: ");
		int key=in.nextInt();
		System.out.print("The number "+key+"appears "+countOccurrences(arr,key)+" time(s) in the array.");
	}
	public static void readArray(int[] arr)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 10 integers:");
		
		for(int i=0;i<10;i++)
		{
			arr[i]=in.nextInt();
		}
		
	}
	public static int countOccurrences(int[] arr, int key)
	{
		Scanner in=new Scanner(System.in);
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				count++;
			}
		}
		return count;
	}
}

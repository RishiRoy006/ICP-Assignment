  import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.print("Enter the size of the array:");
int size=in.nextInt();
int arr[]=new int[size];
System.out.print("Enter "+size+" values: ");
readArray(arr);
System.out.println("Maximum value:"+findMax(arr));
System.out.println("It occurs "+countOccurrences(arr,findMax(arr))+" time(s)");
System.out.println("First position of maximum: "+firstPositionOfMax(arr,findMax(arr)));
System.out.println("Minimum value:"+findMin(arr));
System.out.println("It occurs "+countOccurrences(arr,findMin(arr))+" time(s)");
System.out.println("Last position of minimum: "+lastPositionOfMin(arr,findMin(arr)));
	}
	public static void readArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			Scanner in=new Scanner(System.in);
			arr[i]=in.nextInt();
		}
	}
	public static int findMax(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			max=arr[i];
		}
		return max;
	}
	public static int findMin(int[] arr)
	{
		int min=999;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
	public static int countOccurrences(int[] arr, int value)
	{
		int ctr=0;
		for(int i=0;i<arr.length;i++)
		{
			if(value==arr[i])
				ctr++;
		}
		return ctr;
	}
	public static int firstPositionOfMax(int[] arr, int max)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				return i+1;
			}
		}
		return -1;
	}
	public static int lastPositionOfMin(int[] arr, int min)
	{
		int lastPos=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==min)
			{
				lastPos=i;
			}
		}
		return lastPos+1;
	}
}

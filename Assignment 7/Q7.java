import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[]=new int[10];
		readArray(arr);
		System.out.println("Array elements before clock-wise rotation:");
		printArray(arr);
		System.out.println("Array elements after clock-wise rotation:");
		rotateClockwise(arr);
	}
	public static void readArray(int[] arr)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void rotateClockwise(int[] arr)
	{
		if (arr == null || arr.length <= 1) {
	        return; 
	    }
		int last = arr[arr.length - 1];

	    for (int i = arr.length - 1; i > 0; i--) {
	        arr[i] = arr[i - 1];
	    }
	    arr[0] = last;
	    printArray(arr);
	}
}

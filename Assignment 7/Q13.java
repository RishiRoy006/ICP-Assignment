import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		fillArray(arr);
		System.out.println("Original array:");
		printArray(arr);
		System.out.println("Reversed array:");
		reverseArray(arr);
	}
		public static void fillArray(int[] arr)
		{
			Scanner in=new Scanner(System.in);
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
		}
		public static void reverseArray(int[] arr)
		{
			for(int i = arr.length - 1; i >= 0; i--)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	}

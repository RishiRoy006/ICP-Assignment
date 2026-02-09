import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.print("Second maximum: "+findSecondLargest(arr));
	}
		public static int findSecondLargest(int[] arr)
		{
			int max=0,secondMax=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max) 
				{
					secondMax=max;
					max=arr[i];
				}
			}
			return secondMax;
		}
	}


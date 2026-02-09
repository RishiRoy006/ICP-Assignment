import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.print("Enter ten numbers:");
		for(int i=0;i<10;i++)
		{
			arr[i]=in.nextInt();
		}
		 int[] distinct = eliminateDuplicates(arr);
		System.out.print("The distinct numbers are: "+eliminateDuplicates(arr));
		for(int i:distinct)
		{
			 System.out.print(i + " ");

		}
	}
	public static int[] eliminateDuplicates(int[] list)
	{
		int arr[] = new int[list.length],j = 0,count=0;
		while(j<list.length)
		{
		for(int i=0;i<list.length;i++)
		{
			int low=list[j];
			if(list[i]!=low)
			{
				arr[i]=low;
			}
	    }
		j++;
	}
		return arr;
}
}

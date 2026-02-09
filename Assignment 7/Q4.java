 import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double arr[]=new double[10];
		System.out.print("Enter ten numbers:");
		for(int i=0;i<10;i++)
		{
			arr[i]=in.nextDouble();
		}
		System.out.print("The minimum number is: "+min(arr));
	}
	public static double min(double[] array)
	{
		double min=999;
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i])
				min=array[i];
		}
		return min;
	}
}

import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double arr[]=new double[10];
		System.out.print("Enter ten numbers:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextDouble();
		}
		System.out.print("The maximum number is: "+max(arr));
	}
	public static double max(double[] array)
	{
		double max=-1;
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i])
				max=array[i];
		}
		return max;
	}
}

import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size=in.nextInt();
		int arr[] = new int[size];
		System.out.print("Array elements: ");
		fillArray(arr);
		printArray(arr);
		System.out.print("Number of prime numbers in the array: "+countPrimes(arr));
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
				System.out.print(arr[i]);
			}
		}
		public static boolean isPrime(int num)
		{
			for(int i=2;i<=(int)Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
			return true;
		}
		public static int countPrimes(int[] arr)
		{
			int ctr=0;
			for(int i=0;i<arr.length;i++)
			{
				if(isPrime(arr[i])==true)
				{
					ctr++;
				}
			}
			return ctr;
		}
	}


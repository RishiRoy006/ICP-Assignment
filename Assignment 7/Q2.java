import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counts[]=new int[101];
		readInput(counts);
		displayCounts(counts);
		}
	public static void readInput(int[] counts)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter integers between 1 and 100: ");
		int input;
		do
		{
			input=in.nextInt();
			if(input>=1 && input<=100) 
			{
				counts[input]++;
			}
		}while(input!=0);
		
	}
	public static void displayCounts(int[] counts)
	{
		for(int i=0;i<counts.length;i++)
		{
			if(counts[i]!=0)
			System.out.println(i+" occurs "+counts[i]+(counts[i]>1?" times":" time"));
		}
	}
}

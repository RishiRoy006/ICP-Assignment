import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Year \t Days");
		for(int i=2000;i<=2020;i++)
		{
			System.out.println(i+"\t"+numberOfDaysInAYear(i));
		}
	}
	public static int numberOfDaysInAYear(int year)
	{
		if(year%4==0)
		{
				return 366;
		}
		return 365;
	}
}

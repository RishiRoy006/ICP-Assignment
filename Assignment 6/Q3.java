import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=100;i++)
		{
			System.out.print(getPentagonalNumber(i)+" ");
		}
	}
	public static int getPentagonalNumber(int n)
	{
		return n*(3*n-1)/2;
	}

}

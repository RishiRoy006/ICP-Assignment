
public class P2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int sum=0;
		if(n>=1000 && n<=9999)
		{
			int firstDigit=n/1000;
			int lastDigit=n%10;
		 sum=firstDigit+lastDigit;
		}
		System.out.print("Sum of the first and last digit of "+n+" is: "+sum);
	}
}
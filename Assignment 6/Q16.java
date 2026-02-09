import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a password: ");
		String pass=in.nextLine();
		if(isValidPassword(pass)==true)
			System.out.print("Valid Password");
		else
			System.out.print("Invalid Password");
	}
	public static boolean isValidPassword(String password)
	{
		int ctr=0;
		if(password.length()>=8)
		{
			for(int i=0;i<password.length();i++)
			{
				char c=password.charAt(i);
				if(!Character.isLetterOrDigit(c))
					return false;
				if(Character.isDigit(c))
				{
					ctr++;
				}
			}
			if(ctr>=2)
				return true;
		}
		return false;
	}
}

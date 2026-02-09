import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int marks;
		System.out.print("Enter marks: ");
		marks=in.nextInt();
		
	char grade=' ';
	if(marks<0 || marks>100)
	{
		System.out.print("Invalid Marks! Please enter marks between 0 and 100.");
	}
	else
	{
		if(marks>=90 && marks<=100)
		{
			grade='O';
		}
		else if(marks>=80 && marks<90)
		{
			grade='A';
		}
		else if(marks>=70 && marks<80)
		{
			grade='B';
		}
		else if(marks>=60 && marks<70)
		{
			grade='C';
		}
		else if(marks>=50 && marks<60)
		{
			grade='D';
		}
		else if(marks>=40 && marks<50)
		{
			grade='E';
		}
		else if(marks<40)
		{
			grade='F';
		}
		System.out.print("Grade: "+grade);
	}
	}

}

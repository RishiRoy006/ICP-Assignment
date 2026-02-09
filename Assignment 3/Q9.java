import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int firstNo,secondNo;
char operator;
System.out.print("Enter first number:");
firstNo=in.nextInt();
System.out.print("Enter second number:");
secondNo=in.nextInt();
System.out.print("Enter operator (+, -, *, /):");
operator=in.next().charAt(0);
switch(operator)
{
case '+':
{
	int sum=0;
	sum=firstNo+secondNo;
	System.out.print("Result:"+sum);
	break;
}
case '-':
{
	int diff=0;
	diff=firstNo-secondNo;
	System.out.print("Result:"+diff);
	break;
}
case '*':
{
	int prod=1;
	prod=firstNo*secondNo;
	System.out.print("Result:"+prod);
	break;
}
case '/':
{
	int div=0;
	if(secondNo==0)
	{
		System.out.print("Error: Division by zero is not allowed!");
	}
	else
	{
		div=firstNo/secondNo;
		System.out.print("Result:"+div);
		
	}
	break;
}
default:
	{
		System.out.print("Invalid operator! Please use +, -, *, or /.");
    }
}
}

}


public class P2Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		boolean res=(a%b==0||b%a==0);
		System.out.println("Evenly Divides "+a+" "+b+" ---> "+res);
	}

}

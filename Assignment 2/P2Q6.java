
public class P2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int sum=a+b+c; 
		int small=(int)(Math.min(a, Math.min(b, c)));
		int large=(int)(Math.max(a, Math.max(b, c)));
		int middle=sum-(small+large);
		System.out.print("Ascending Order: "+small+" "+middle+" "+large);
	}

}


public class P2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=Float.parseFloat(args[0]);
		float b=Float.parseFloat(args[1]); 
		float c=Float.parseFloat(args[2]);
		boolean res=false;
		if((a>b&&b>c)||(a<b&&b<c))
		{
		res= true;
		}
		System.out.print("Strict Order Check "+a+" "+b+" "+c+" ---> "+res);
	}
}
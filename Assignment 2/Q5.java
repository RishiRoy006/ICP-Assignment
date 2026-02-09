package pkg2_2;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner in=new Scanner(System.in);
	     System.out.print("Enter the three numbers:");
	     float x=in.nextFloat();
	     float y=in.nextFloat();
	     float z=in.nextFloat();
	     if((x>y&&y>z)||(x<y&&y<z))
	     {
	    	 System.out.print("Strict Order Check "+x+" "+y+" "+z+" ----> true");
	     }
	     else
	     {
	    	 System.out.print("Strict Order Check "+x+" "+y+" "+z+" ----> false");
	     }
	}

}

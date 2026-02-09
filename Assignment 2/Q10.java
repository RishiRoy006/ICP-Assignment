import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
	System.out.print("Enter the distance in km=");
	int dis=in.nextInt();
	int met=dis*1000;
	double feet=dis*3280.8399;
	double inch=dis*39370.0787;
	int cm=dis*100000;
	System.out.println(dis+" km is "+met+" meters");
	System.out.println(dis+" km is "+feet+" feet");
	System.out.println(dis+" km is "+inch+" inch");
	System.out.println(dis+" km is "+cm+" centimeters");
	}
}

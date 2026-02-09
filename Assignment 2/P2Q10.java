
public class P2Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double a = Math.random();
	        double b = Math.random();
	        double c = Math.random();
	        double d = Math.random();
	        double e = Math.random();

	        // Print the random values
	        System.out.println("Random values:");
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);
	        System.out.println(e);

	        // Calculate average
	        double average = (a + b + c + d + e) / 5.0;

	        // Find minimum using nested Math.min()
	        double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));

	        // Find maximum using nested Math.max()
	        double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));

	        // Print results
	        System.out.println("\nAverage = " + average);
	        System.out.println("Minimum = " + min);
	        System.out.println("Maximum = " + max);
	}

}

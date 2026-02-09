import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter number of rows: ");
		        int N = sc.nextInt();
		        
		        for (int i = 1; i <= N; i++) {
		            StringBuilder row = new StringBuilder();
		            
		            for (int j = 1; j <= i; j++) {
		                for (int k = 1; k <= j; k++) {
		                    row.append(k);
		                }
		                for (int k = j - 1; k >= 1; k--) {
		                    row.append(k);
		                }
		            }
		            
		            // Print the row
		            System.out.println(row.toString());
		        }
		        
		    
	}

}

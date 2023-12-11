package jdbc_simple;
import java.util.*;
public class StarPrint {
/*
 * Abhinandan chouhan
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		/*
		 * take input from user store in variable n
		 */
		int n=sc.nextInt();
		/*
		 * n is number of row so start a loop for row
		 */
		for(int i=0;i<n;i++) {
			/*
			 * start loop for space
			 */
			for(int k=n-i;k>1;k--) {
				System.out.print(" ");
			}
			/*
			 * print star here...
			 */
					for(int j=0;j<=i;j++) {	
							System.out.print("*");	
			}
					for(int l=1;l<=n;l++) {
						System.out.print(" ");
					}
		
			System.out.println();
		}
	}

}

package jdbc_simple;
import java.util.*;
public class ArrayInteger {
/*
 * Abhinandan chouhan
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number you want to add:");
		int n=sc.nextInt();
		int array[]=new int[n];
		int num;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" number: ");
			num=sc.nextInt();
			array[i]=num;
			
		}
	System.out.print("The dublicate element is:");
		for(int j = 0; j < array.length; j++) {  
            for(int k = j + 1; k < array.length; k++) {  
                if(array[j] == array[k]) {
                	System.out.print(array[j]+",");
                }
                      
            }  
        } 

	}

}

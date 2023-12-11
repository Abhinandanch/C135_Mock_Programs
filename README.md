# C135_Mock_Programs
Qno 1. Given an array of integers, write a Java program to find and print all the duplicate elements.
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
output:-
Enter how many number you want to add:
6
Enter the 1 number: 
10
Enter the 2 number: 
20
Enter the 3 number: 
10
Enter the 4 number: 
20
Enter the 5 number: 
30
Enter the 6 number: 
40
The dublicate element is:10,20,

Qno 2. Write a Java function to check if two strings are anagrams of each other.
import java.util.*;

public class Anagram {
/*
 * Abhinandan chouhan
 */
	static void anag(String s1, String s2) {  
        String st = s1.replaceAll("\\s", "");  
        String st2 = s2.replaceAll("\\s", "");  
        boolean status = true;  
        if (st.length() != st2.length()) {  
            status = false;  
        } else {  
            char[] Array1 = st.toLowerCase().toCharArray();  
            char[] Array2 = st2.toLowerCase().toCharArray();  
            Arrays.sort(Array1);  
            Arrays.sort(Array2);  
            status = Arrays.equals(Array1, Array2);  
        }  
        if (status) {  
            System.out.println(st + " and " + st2 + " are anagrams");  
        } else {  
            System.out.println(st + " and " + st + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {  
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter first string: ");
    	String s1=sc.nextLine();
    	System.out.println("Enter first string: ");
    	String s2=sc.nextLine();
        anag(s1, s2);  
    }  

}
output:- Enter first string: 
abcdeeff
Enter first string: 
ffedecba
abcdeeff and ffedecba are anagrams

Qno 3. Write a Java program to print a right-angled triangle of stars. The number of rows should be taken as input.
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
output:-
Enter the number of rows: 
5
    *     
   **     
  ***     
 ****     
*****     


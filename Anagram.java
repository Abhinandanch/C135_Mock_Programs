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

package prep1;

import java.util.Arrays;

public class removecontinouslyrepeatingchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char S1[] = "geeksforgeeks".toCharArray(); 
		int n = S1.length;
		int j = 0,i=0;
		  for ( i = 1; i < n; i++)  
	        { 
	            // If current character S[i] 
	            // is different from S[j] 
	            if (S1[j] != S1[i]) 
	            { 
	                j++; 
	                S1[j] = S1[i]; 
	            } 
	            
	        } 
	        System.out.println(Arrays.copyOfRange(S1, 0, j + 1)); 
	}

}

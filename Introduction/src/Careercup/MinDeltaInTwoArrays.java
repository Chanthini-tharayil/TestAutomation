package Careercup;

import java.util.Arrays;

public class MinDeltaInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Input given array A 
        int A[] = {1, 2, 11, 5}; 
      
        // Input given array B 
        int B[] = {4, 12, 19, 23, 127, 235};
        Arrays.sort(A); 
        Arrays.sort(B); 
      
        int a = 0, b = 0; 
        int m = A.length; 
        int n = B.length; 
      
        // Initialize result as max value 
        int result = Integer.MAX_VALUE; 
     // System.out.println(result);
        // Scan Both Arrays upto  
        // sizeof of the Arrays 
        while (a < m && b < n) 
        { 
            if (Math.abs(A[a] - B[b]) < result) 
                result = Math.abs(A[a] - B[b]); 
      
            // Move Smaller Value 
            if (A[a] < B[b]) 
                a++; 
      
            else
                b++; 
        } 
        
        System.out.println(result);
          

	}

}

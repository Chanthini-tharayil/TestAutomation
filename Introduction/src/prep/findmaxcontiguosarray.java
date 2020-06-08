package prep;

import java.util.Arrays;

public class findmaxcontiguosarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 }; 
		  int size = a.length; 
	        int max_so_far = Integer.MIN_VALUE, max_ending_here=0;
	        for (int i = 0; i < size; i++) { 
	            max_ending_here = max_ending_here + a[i]; 
	            if (max_so_far < max_ending_here) 
	                max_so_far = max_ending_here; 
	            if (max_ending_here < 0) 
	                max_ending_here = 0; 
	        } 
	    //    System.out.println(max_so_far);
	        int product=1,max=0;
	        for (int i = 0; i < size; i++) {
	        	
	        	product=product*a[i];
	        	if(product>max)
	        		max=product;
	        	 if (product < 0) 
	        		 product = 1; 
	        	
	        }
	     //   System.out.println(max);
	        
	      Arrays.sort(a);
	      int i=0,j=a.length-1;
	      while(i<a.length &&j<a.length)
	      {
	    	  if(a[i]+a[j]==3)
	    	  {
	    		  System.out.println(a[i]+" "+a[j]);
	    		  i++;j--;
	    	  }
	    	  else if(a[i]+a[j]>3)
	    		  j--;
	    	  else if(a[i]+a[j]<3)
	    		  i++;
	      }
	     
	      
	        }

	}



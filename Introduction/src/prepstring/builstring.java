package prepstring;

public class builstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5, k = 2;
		 String res = ""; 
         
	        for (int i = 0; i < k; i++) 
	            res = res + (char)('a' + i); 
	      
	        // Fill remaining n-k letters by 
	        // repeating k letters again and  
	        // again. 
	        int count = 0; 
	          
	        for (int i = 0; i < n - k; i++) 
	        { 
	            res = res + (char)('a' + count); 
	            count++; 
	              
	            if (count == k) 
	                count = 0; 
	        } 
System.out.println(res);
	}

}

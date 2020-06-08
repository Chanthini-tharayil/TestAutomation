package prepstring;

import java.util.Arrays;

public class smallestwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String str="aba";
		//String pattern="tist";
		int k=2;
		 int res = 0; 
		  
	        int n = str.length(); 
	  
	        // To store count of characters from 'a' to 'z' 
	        int cnt[] = new int[26]; 
	        for(int i=0;i<n;i++)
	        {
	        	int dist_count=0;
	        	Arrays.fill(cnt, 0);
	        	for(int j=i;j<n;j++)
	        	{
	        		//System.out.println(str.charAt(j) - 'a');
	        		   if (cnt[str.charAt(j) - 'a'] == 0) 
	                       dist_count++; 
	     
	                   // Increment count of current character 
	                   cnt[str.charAt(j) - 'a']++; 
	     
	                   // If distinct character count becomes k, 
	                   // then increment result. 
	                   if (dist_count == k) 
	                       res++; 
	        	}
	        	
	        }

	}

}

package dataStructures;

import java.util.Arrays;

public class RepeatingcharNumber {
	static final int MAX_CHAR = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jithinj";
	/*	 int count[] = new int[MAX_CHAR]; 
		  
	        int len = str.length(); 
	  
	        // Initialize count array index 
	        for (int i = 0; i < len; i++) 
	            count[str.charAt(i)]++; 
		        // Create an array of given String size 
	        char ch[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
	            ch[i] = str.charAt(i); 
	            int find = 0; 
	            for (int j = 0; j <= i; j++) { 
	  
	                // If any matches found 
	                if (str.charAt(i) == ch[j])  
	                    find++;                 
	            } 
	  
	            if (find == 1)  
	                System.out.println("Number of Occurrence of " + 
	                 str.charAt(i) + " is:" + count[str.charAt(i)]);    	}*/
		char[] m = new char[6];
		m=str.toCharArray();
	//	for(int i=0;i<m.length;i++)
	//		System.out.println(m[i]);
		for(int i=0;i<m.length;i++)
		{
			int count=1;
			if(m[i]==' ')
				continue;
					
			for(int j=i+1;j<m.length;j++)
			{
				
				if(m[i]==m[j])
				{
					count++;
					m[j]=' ';
				
			}
				
		}
			System.out.println("count of "+m[i]+" is "+count);
			

	}
		
		
	}
}

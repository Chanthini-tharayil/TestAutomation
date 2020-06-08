package prepstring;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class sortarrayincreasingorderoflength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"GeeksforGeeeks", "from", "I", "am"};
	/*	LinkedHashMap<String,Integer> m=new LinkedHashMap<String,Integer>();
		LinkedHashMap<String,Integer> k=new LinkedHashMap<String,Integer>();
		for(int i=0;i<s.length;i++)
		{
			m.put(s[i], s[i].length());
		}
		
		m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEachOrdered(x ->k.put(x.getKey(), x.getValue()));
	//	System.out.println(k);
		int i=0;
		for(Map.Entry<String, Integer> entry : k.entrySet())
			{
			//System.out.println(entry.getKey());
			s[i]=entry.getKey();
			i++;
			}
		for(int l=0;l<s.length;l++)
			System.out.println(s[l]);*/
		
		  for (int i=1 ;i<s.length; i++) 
		    { 
		        String temp = s[i]; 
		  
		        // Insert s[j] at its correct position 
		        int j = i - 1; 
		        while (j >= 0 && temp.length() < s[j].length()) 
		        { 
		            s[j+1] = s[j]; 
		            j--; 
		        } 
		        s[j+1] = temp; 
		    } 

	}

}

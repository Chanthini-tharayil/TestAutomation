package prepstring1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class kchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xyyx"; 
		char[] s1=null,s2=null;
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		for (int i = 0; i < s.length(); i++)  
		{
	           for (int j = i+1; j <= s.length(); j++) 
	           {
	           s1= s.substring(i, j).toCharArray();
	           
	           Arrays.sort(s1);
	           String t = new String(s1);
	           if(!m.containsKey(t))
	           {
	        	   m.put(t, 1);
	           }
	           else
	           {
	        	   m.put(t, m.get(t)+1);
	           }
		}
	           }
		System.out.println(m);
		Object[] key=m.values().toArray(); 
		int count=0;
		for(int i=0;i<key.length;i++)
		{
			if((int)key[i]==2)
				count++;
		}
		System.out.println(count);
	}

}

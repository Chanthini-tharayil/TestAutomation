package prepstring1;

import java.util.LinkedHashMap;
import java.util.Map;

public class distinctchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Geeks for Geeks";
	/*	LinkedHashMap<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<t.length();i++)
		{
			if(!m.containsKey(t.charAt(i)))
				m.put(t.charAt(i), 1);
			else
				m.put(t.charAt(i), m.get(t.charAt(i))+1);
		}
		for(Map.Entry<Character,Integer> entry:m.entrySet())
		{
			if(entry.getValue()==1)
				System.out.println(entry.getKey());
		}*/
		int[] count = new int[256]; 
	       
        /* Count array with frequency of characters */
        int i; 
        for (i = 0; i < str.length(); i++) 
            if(str.charAt(i)!=' ') 
            {
                count[(int)str.charAt(i)]++; 
                System.out.println((int)str.charAt(i));
            }
        int n = i; 
       
        // Print characters having count more than 0 
        for (i = 0; i < n; i++) 
            if (count[(int)str.charAt(i)] == 1) 
                System.out.print(str.charAt(i)); 
		

	}

}

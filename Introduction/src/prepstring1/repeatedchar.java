package prepstring1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class repeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="geeksforgeeks";
 LinkedHashMap<Character,Integer> m= new LinkedHashMap<Character,Integer>();
 for(int i=0;i<s.length();i++)
 {
	 if(!m.containsKey(s.charAt(i)))
		 m.put(s.charAt(i), 1);
	 else
		 m.put(s.charAt(i), m.get(s.charAt(i))+1);
 }
 for(Map.Entry<Character, Integer> entry: m.entrySet())
 {
	 if(entry.getValue()>0)
	 {
		 System.out.println(entry.getKey());
		 break;
	 }
 }
 

	}

}

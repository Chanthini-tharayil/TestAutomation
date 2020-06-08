package prepstring1;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstnonrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="geeksforgeeks";
		LinkedHashMap<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<t.length();i++)
		{
			if(!m.containsKey(t.charAt(i)))
				m.put(t.charAt(i), 1);
			else
				m.put(t.charAt(i), m.get(t.charAt(i))+1);
		}
		for(Map.Entry<Character, Integer> entry: m.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}

package prepstring1;

import java.util.LinkedHashMap;
import java.util.Map;

public class secondmostrepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"aaa", "bbb", "ccc", "bbb", 
		         "aaa", "aaa"};
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		LinkedHashMap<String,Integer> m = new LinkedHashMap<String,Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(!m.containsKey(s[i]))
				m.put(s[i], 1);
			else
				m.put(s[i], m.get(s[i])+1);
		}
		System.out.println(m);
		for(Map.Entry<String, Integer> entry: m.entrySet())
		{
			if(first<entry.getValue())
			{
				second=first;
				first=entry.getValue();
			}
			if(entry.getValue()>second && entry.getValue()!=first)
				second=entry.getValue();
		}
		System.out.println(first);
		for(Map.Entry<String, Integer> entry: m.entrySet())
		{
			if(entry.getValue()==second)
				System.out.println(entry.getKey());
		}
	}

}

package prepstring;

import java.util.LinkedHashMap;
import java.util.Map;

public class maxconsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeekk";
		LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!m.containsKey(s.charAt(i)))
			{
				m.put(s.charAt(i),1);
			}
			else
			{
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}
		}
		int max=Integer.MIN_VALUE;
		for(Map.Entry<Character, Integer> entry: m.entrySet())
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
			}
		}
		for(Map.Entry<Character, Integer> entry: m.entrySet())
		{
			if(entry.getValue()==max)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}

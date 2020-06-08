package prepstring;

import java.util.HashMap;
import java.util.Map;

public class mostrepeatedword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"geeks", "for", "geeks", "a", 
                "portal", "to", "learn", "can",
                "be", "computer", "science", 
                 "zoom", "yup", "fire", "in", 
                 "be", "data", "geeks"};
		int max=Integer.MIN_VALUE,max1=0;
		HashMap<String, Integer> m= new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(!m.containsKey(s[i]))
			{
				m.put(s[i], 1);
			}
			else
				m.put(s[i], m.get(s[i])+1);
		}
for(Map.Entry<String, Integer> entry: m.entrySet())
{
	if(entry.getValue()>max)
	{
		max=entry.getValue();
	}
	
}
for(Map.Entry<String, Integer> entry: m.entrySet())
{
	if(max==entry.getValue())
	{
		System.out.println(entry.getKey());
	}
	
}
	}

}

package prepstring1;

import java.util.HashMap;
import java.util.Map;

public class pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String p="geeksofffgeeks";
int count=0;
HashMap<Character,Integer> m = new HashMap<Character,Integer>();
for(int i=0;i<p.length();i++)
{
	if(!m.containsKey(p.charAt(i)))
	{
		m.put(p.charAt(i), 1);
	}
	else
	{
		m.put(p.charAt(i), m.get(p.charAt(i))+1);
	}
}
for(Map.Entry<Character, Integer> entry:m.entrySet())
{
	if(entry.getValue()%2==1)
		count++;
}
if(count==1)
	System.out.println("Yes");
else
	System.out.println("No");
	}

}

package prepstring;

import java.util.HashMap;
import java.util.Map;

public class mininsertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeksl";
		int count=0;
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!m.containsKey(s.charAt(i)))
			{
				m.put(s.charAt(i), 1);
			}
			else
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
		}
		System.out.println(m);
		for(Map.Entry<Character,Integer> entry:m.entrySet())
		{
			if(entry.getValue()%2==1)
				count++;
			
		}
		System.out.println(count-1);

	}

}

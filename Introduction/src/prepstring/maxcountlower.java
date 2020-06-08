package prepstring;

import java.util.LinkedHashMap;
import java.util.Map;

public class maxcountlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbdce";
	/*	LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!m.containsKey(s.charAt(i)))
				m.put(s.charAt(i), 1);
				else
					m.put(s.charAt(i), m.get(s.charAt(i))+1);
		}
		for(Map.Entry<Character, Integer> entry :m.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}*/
		int[] k= new int[256];
		for(int i=0;i<s.length();i++)
		{
			k[s.charAt(i)]++;
		}
		int index=0;
		for(int i=0;i<s.length();i++)
		{
			if(k[s.charAt(i)]==1)
			{
				index=i;
				break;
			}
		}
		System.out.println(s.charAt(index));
		
		
	

	}

}

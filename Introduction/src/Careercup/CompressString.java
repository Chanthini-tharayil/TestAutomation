package Careercup;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class CompressString {

	public static void main(String[] args) {
		
    String test="aabbccc";
	char[] c= test.toCharArray();
	HashMap<Character,Integer> m =new HashMap();

	for(char i: c)
	{
		if(!m.containsKey(i))
		{
			m.put(i, 1);
		}
		else
		{
			m.put(i, m.get(i)+1);
		}
	
	}
	System.out.println("Compressed:");
	for(Map.Entry<Character, Integer> i :m.entrySet())
	{
		System.out.println(i.getKey()+""+i.getValue());
	}
	System.out.println("Decompressed");
	for(Map.Entry<Character, Integer> i :m.entrySet())
	{
		int count=i.getValue();
		while(count>=1)
		{
			System.out.println(i.getKey());
			count--;
		}
	}
    
	}

}
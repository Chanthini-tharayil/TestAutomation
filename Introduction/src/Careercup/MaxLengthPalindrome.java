package Careercup;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		"aabcbcbdcc" you can remove and shuffle characters, 
		find the maximum length of string which forms palindrome.
		like "ccabdbacc"*/
		
		String t="aabcbcbdcc";
		HashMap<Character,Integer> m =new HashMap();
		for(int i=0;i<t.length();i++)
		{ 
			if(!m.containsKey(t.charAt(i)))
			m.put(t.charAt(i), 1);
			else
			m.put(t.charAt(i), m.get(t.charAt(i))+1);
				
		}
		int count=0;int len=0;
		System.out.println(m);
		for(Map.Entry<Character, Integer> j :m.entrySet())
		{
			int k=j.getValue();
			if(k%2==0)
			{
				len=len+j.getValue();
			}
			else 
				len=len+(j.getValue()-1);
			
		}
		System.out.println(len+1);
		
	}

}

package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
	public static HashMap<String,Integer>  getfreq(String[] str)
	{
		HashMap<String,Integer> freq=new HashMap<String,Integer>();
		for(String word: str)
		
		{
			if(!freq.containsKey(word))
				freq.put(word,0);
		   freq.put(word,freq.get(word)+1);
		}
		return freq;
		
	}
	public static boolean hasEnoughStrings(HashMap<String, Integer> magfreq, HashMap<String, Integer> notefreq) {
		for(Map.Entry<String, Integer> entry: notefreq.entrySet())
		{
			String word=entry.getKey();
			if(!magfreq.containsKey(word)||magfreq.get(word)<entry.getValue())
			{
				return false;
			}
		}
		return true;
	}
	public static boolean canBuild(String[] magazine, String[] note)
	{
		HashMap<String,Integer> magfreq=getfreq(magazine);
		HashMap<String,Integer> notefreq=getfreq(note);
		return hasEnoughStrings(magfreq,notefreq);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] magazine= {"hello","World","Blah"};
    String[] note= {"hello","World","Bleh"};
    System.out.println(canBuild(magazine,note));
     
	}

}

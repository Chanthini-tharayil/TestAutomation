package dataStructures;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// FIRST METHOD
		String str="taste";
		String str1="astte";
		char[] c=str.toCharArray();
		char[] c1=str1.toCharArray();
		Arrays.sort(c);Arrays.sort(c1);
		Boolean B=Arrays.equals(c, c1);
		if(B.booleanValue())
			System.out.println("true");
		else
			System.out.println("false");
	}
		
	//SECOND METHOD
	
	 public boolean isAnagram1(String text1, String text2) {

	        // Map 1
	        HashMap<String, Integer> map1 = map(text1);

	        // Map 2
	        HashMap<String, Integer> map2 = map(text2);

	        // Compare letters and frequency of characters in Maps
	        return map1.equals(map2);
	    }

	    private HashMap<String, Integer> map(String text) {
	        HashMap<String, Integer> map = new HashMap<String, Integer>();

	        char[] chars = text.toCharArray();

	        // Loop through and build the map one letter at a time...
	        for (int i=0; i < chars.length; i++) {
	            String letter = String.valueOf(chars[i]);

	            // if we already have, just increment
	            if (map.containsKey(letter)) {
	                Integer currentCount = map.get(letter);
	                map.put(letter, currentCount + 1);
	            } else { // else add
	                map.put(letter, 1);
	            }
	        }

	        return map;
	    }
			
		

}

package prepstring1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class wordssamecharset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String words[] = { "may", "student", "students", "dog",
        "studentssess", "god", "cat", "act",
        "tab", "bat", "flow", "wolf", "lambs",
        "amy", "yam", "balms", "looped", 
        "poodle"};
HashMap<String, ArrayList<Integer>> Hash = new HashMap<>(); 
for (int i=0; i<words.length; i++) 
{ 
    String key = getKey(words[i]); 
      
    // if the key is already in the map 
    // then get its corresponding value 
    // and update the list and put it in the map 
    if(Hash.containsKey(key)) 
    { 
        ArrayList<Integer> get_al = Hash.get(key); 
        get_al.add(i); 
        Hash.put(key, get_al); 
    } 
      
    // if key is not present in the map 
    // then create a new list and add 
    // both key and the list 
    else
    { 
        ArrayList<Integer> new_al = new ArrayList<>(); 
        new_al.add(i); 
        Hash.put(key, new_al); 
    } 
} 
System.out.println(Hash);

// print all words that have the same unique character set 
for (Map.Entry<String, ArrayList<Integer>> it : Hash.entrySet()) 
{ 
    ArrayList<Integer> get =it.getValue(); 
    for (Integer v:get) 
        System.out.print( words[v] + ", "); 
    System.out.println(); 
} 
	}
	  static final int MAX_CHAR = 26; 
      
	    // Generates a key from given string. The key 
	    // contains all unique characters of given string 
	    // in sorted order consisting of only distinct elements. 
	    static String getKey(String str) 
	    { 
	        boolean[] visited = new boolean[MAX_CHAR]; 
	        Arrays.fill(visited, false); 
	       
	        // store all unique characters of current 
	        // word in key 
	        for (int j = 0; j < str.length(); j++) 
	            visited[str.charAt(j) - 'a'] = true ; 
	        String key = ""; 
	        for (int j=0; j < MAX_CHAR; j++) 
	            if (visited[j]) 
	                key = key + (char)('a'+j); 
	        return key; 
	    } 

}

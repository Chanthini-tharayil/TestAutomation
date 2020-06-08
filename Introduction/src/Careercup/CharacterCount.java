package Careercup;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program to diplay a character occurred maximum times and if 
 * two charaters occurring same no of times then display 1st character in string.
"HELLO WORLD!" display L
"HO HELLO!" display H (H, L and O appeared 2 times but H is in 1st in string)
*/
	String t="HELLO WOORLD!";
    HashMap<Character,Integer> m =new HashMap();
    for(int i=0;i<t.length();i++)
    {
    	if(!m.containsKey(t.charAt(i)))
    	m.put(t.charAt(i), 1);
    	else
    		m.put(t.charAt(i), m.get(t.charAt(i))+1);
    }
    int maxList = Collections.max(m.values()); 
/*  for(Map.Entry<Character, Integer> d : m.entrySet())
  {
	  if(d.getValue().equals(maxList))
	  {
		  System.out.println(d.getKey());
	  }
  }*/
    
    int tempNum = 0;
    char tempChar = 'a';
    for (Character temp:m.keySet()){
        if (m.get(temp) >= tempNum){
            tempNum = m.get(temp);
            tempChar = temp;
        }
    }
    System.out.println(tempChar + " - " + tempNum);

	
	}

}

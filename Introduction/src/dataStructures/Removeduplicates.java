package dataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// STUDY THE ONE WITH LINKEDLIST 
    String str="aabbcb";
    
    /***************************************************
     * Method using loop
     /***************************************/
    int count=1;
    String test="";
    for(int i=0;i<str.length();i++)
    {
    	char ch=str.charAt(i);
    	for(int j=i+1;j<str.length();j++)
    	{
    		if(str.charAt(i)==str.charAt(j))
    		{    			
    			test+= str.charAt(i);
    			str=str.replace(ch, ' ');	
    		}    
    		else 
    			test+= str.charAt(i);
    			
    		
    	}
    	
    }
  //  System.out.println(test);
    
     str="aabbcb";
    
    HashSet<Character> m = new HashSet<Character>();
    for(int i=0;i<str.length();i++)
    {
    	m.add(str.charAt(i));
    }
  Iterator i = m.iterator();
  while(i.hasNext())
  {
	  System.out.println(i.next());
  }
    
    
    //*************************************************
    //USING LINKED HASHSET
    //***********************************************
 
    /*LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
    for(int i=0;i<str.length();i++) 
        lhs.add(str.charAt(i)); 
      
    // print string after deleting duplicate elements 
    for(Character ch : lhs) 
        System.out.print(ch); */
    
	}
}
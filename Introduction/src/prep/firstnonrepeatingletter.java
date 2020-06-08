package prep;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class firstnonrepeatingletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="amazon is the best company to work for";
          //  HashSet<Character> m = new HashSet<Character>();
            LinkedHashMap<Character,Integer> k= new LinkedHashMap<Character,Integer>();
            for(int i=0;i<str.length();i++)
            {
            	if(!k.containsKey(str.charAt(i)))
            	{
            		k.put(str.charAt(i), 1);
            	}
            	else
            	{
            		k.put(str.charAt(i), k.get(str.charAt(i))+1);
            	}
            }
            for(Map.Entry<Character,Integer> l: k.entrySet() )
            {
            	if(l.getValue()==1)
            	{
            		System.out.println(l.getKey());
            		break;
            	}
            }

	}

}

package prep;

import java.util.HashMap;
import java.util.Map;

public class validinvalidarithmeticexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String test ="(())()(())";
   HashMap<Character, Integer> h= new HashMap<Character,Integer>();
   for(int i=0;i<test.length();i++)
   {
	   if(!h.containsKey(test.charAt(i)))
		   h.put(test.charAt(i), 1);
	   else
		   h.put(test.charAt(i), h.get(test.charAt(i))+1);
	 
   }
   int firstcount=0,secondcount=0;
   for(Map.Entry<Character,Integer> m : h.entrySet() )
   {
	   if(m.getKey()=='(')
	   {
		   firstcount=m.getValue();
	   }
	   else if(m.getKey()==')')
		   secondcount=m.getValue();
   }
   if(firstcount==secondcount)
	   System.out.println("valid expression");
   else
	   System.out.println("Invalid Expression");
   
	}

}

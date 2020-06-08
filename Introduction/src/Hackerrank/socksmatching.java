package Hackerrank;

import java.util.HashMap;
import java.util.Map;

public class socksmatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t= {10 ,20 ,20 ,10 ,10, 30 ,50,10, 20};
		int pair=1,count=0;
	   HashMap<Integer,Integer> M = new HashMap();
	   for( int i :t)
	   {
		   if(!M.containsKey(i))
		   {
			   M.put(i, 1);
		   }
		   else
		   {
			   M.put(i, M.get(i)+1);
			   if(M.get(i)%2==0)
			   {
				   count++;
			   }
		   }
	   }
	   for(Map.Entry<Integer, Integer> entry: M.entrySet())
	   {
		   System.out.println(entry.getKey()+" "+entry.getValue());
		   if(entry.getValue()%2==0)
		   {
		//	   count++;
		   }
		   
	   }
		System.out.println(count);

	}

}

package prep;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class sortanarraytoabsolutedifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,ArrayList<Integer>> m=new TreeMap<Integer,ArrayList<Integer>>();
		int[] a= {-1, 2, 1, -4, -5, 6, -8, 8} ;
		int diff=0,x=7;
		for(int i=0;i<a.length;i++)
		{
			diff=Math.abs(x-a[i]);
			if(!m.containsKey(diff))
			{
				 ArrayList<Integer> al = new ArrayList<>(); 
                 al.add(a[i]); 
                 m.put(diff,al);
			}
			else
			{
				ArrayList<Integer> al=m.get(diff);
				al.add(a[i]);
				m.put(diff, al);
			}
		}
		  int index = 0; 
          for (Map.Entry entry : m.entrySet())  
          { 
        	 
              ArrayList<Integer> al = m.get(entry.getKey()); 
              for (int i = 0; i < al.size(); i++) 
                      a[index++] = al.get(i);  
          } 
          for (int i = 0; i < a.length; i++) 
              System.out.print(a[i] + " "); 
              
	}

}

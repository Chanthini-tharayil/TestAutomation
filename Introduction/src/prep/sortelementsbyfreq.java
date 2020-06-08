package prep;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class sortelementsbyfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 5, 2, 8, 5, 6, 8, 8};
		LinkedHashMap<Integer,Integer> m = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!m.containsKey(a[i]))
			{
				m.put(a[i], 1);
			}
			else
			{
				m.put(a[i], m.get(a[i])+1);
			}
		}
		
		/*List<Map.Entry<Integer, Integer> > list = 
	               new LinkedList<Map.Entry<Integer, Integer> >(m.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
	            public int compare(Map.Entry<Integer, Integer> o1,  
	                               Map.Entry<Integer, Integer> o2) 
	            { 
	               return  (o1.getValue()).compareTo(o2.getValue()); 
	            }});
	        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
	        for (Map.Entry<Integer, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) { 
	            System.out.println(entry.getKey()+" "+entry.getValue()); 
	        } */
		LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
		 
		m.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
	           
		 for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) { 
	            System.out.println(entry.getKey()+" "+entry.getValue()); 
	        }
	}

}

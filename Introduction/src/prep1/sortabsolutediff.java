package prep1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortabsolutediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 5, 3, 9, 2};
		int x = 7;
		LinkedHashMap<Integer,Integer> m = new LinkedHashMap<Integer,Integer>();
		LinkedHashMap<Integer,Integer> s = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			m.put(a[i], Math.abs(x-a[i]));
		}
		m.entrySet().
		stream().
		sorted(Map.Entry.comparingByValue()).
		forEachOrdered(y -> s.put(y.getKey(), y.getValue()));
		System.out.println(s);

	}

}
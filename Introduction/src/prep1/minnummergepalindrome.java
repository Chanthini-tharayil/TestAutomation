package prep1;

import java.util.HashMap;
import java.util.Map;

public class minnummergepalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 4, 5,5, 1};
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!m.containsKey(a[i]))
				m.put(a[i], 1);
			else
				m.put(a[i], m.get(a[i])+1);
		}
		int count=0;
		for(Map.Entry<Integer, Integer> entry: m.entrySet())
		{
			if(entry.getValue()%2==0)
				continue;
			else
				count++;
		}
		System.out.println(count-1);

	}

}

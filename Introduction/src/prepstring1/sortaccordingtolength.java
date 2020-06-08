package prepstring1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class sortaccordingtolength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"GeeksforGeeeks", "I", "from", "am"};
		LinkedHashMap<String,Integer> m=new LinkedHashMap<String,Integer>();
		LinkedHashMap<String,Integer> t=new LinkedHashMap<String,Integer>();
		for(int i=0;i<a.length;i++)
		{
			m.put(a[i], a[i].length());
		}
		System.out.println(m);
		m.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByValue())
	    .forEachOrdered(x -> t.put(x.getKey(), x.getValue()));
		System.out.println(t);

	}

}

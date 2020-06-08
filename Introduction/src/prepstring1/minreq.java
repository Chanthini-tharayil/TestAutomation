package prepstring1;

import java.util.HashSet;

public class minreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s1 = "aac",
			       s2 = "aad";
		HashSet<Character> m = new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
			m.add(s1.charAt(i));
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			if(!m.contains(s2.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}

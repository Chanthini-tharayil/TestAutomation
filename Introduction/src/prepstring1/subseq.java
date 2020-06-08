package prepstring1;

import java.util.LinkedHashSet;

public class subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GeeksforGeeks";
		String s1="Gks";
		StringBuilder s2= new StringBuilder();
		int count=0;
		LinkedHashSet<Character> m=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			m.add(s1.charAt(i));
		}
		for(int i=0;i<s.length();i++)
		{
			if(m.contains(s.charAt(i)))
				s2.append(s.charAt(i));
			if(s2.toString().equals(s1))
			{
				count++;
			s2.delete(0, s2.length());
			}
		}
		System.out.println(count);

	}

}

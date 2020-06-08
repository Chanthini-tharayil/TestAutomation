package prepstring;

import java.util.HashSet;

public class printcommonchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="characters";
		String s1="alphabets";
		HashSet<Character> m=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
			m.add(s.charAt(i));
		for(int i=0;i<s1.length();i++)
		{
			if(m.contains(s1.charAt(i)))
				System.out.println(s1.charAt(i));
		}
		

	}

}

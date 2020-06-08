package prepstring1;

import java.util.Arrays;
import java.util.HashSet;

public class commonchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="characters";
		String t= "alphabets";
		int p[]=new int[26];
		Arrays.fill(p, 0);
		for(int i=0;i<s.length();i++)
			p[s.charAt(i)-'a']=1;
		for(int i=0;i<t.length();i++)
		{
			if(p[t.charAt(i)-'a']==1 || p[t.charAt(i)-'a']==-1)
				p[t.charAt(i)-'a']=-1;	
			else
				p[t.charAt(i)-'a']=2;
		}
		for(int i=0;i<p.length;i++)
		{
			if(p[i]==2 || p[i]==1)
				System.out.println((char)(i+'a'));
		}

	}

}

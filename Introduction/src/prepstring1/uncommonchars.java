package prepstring1;

import java.util.Arrays;

public class uncommonchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "characters", str2 = "alphabets";
		int[] c= new int [26];
		int[] d= new int[26];
		Arrays.fill(c, 0);
		Arrays.fill(d, 0);
		for(int i=0;i<str1.length();i++)
		{
			c[str1.charAt(i)-'a']++;
		}
		for(int i=0;i<str2.length();i++)
		{
			d[str2.charAt(i)-'a']++;
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=d[i])
				System.out.println((char)(i+'a'));
		}
		
		
	}

}

package prepstring1;

import java.util.Arrays;

public class commoncharact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeks";
		String s1="forgeeks";
		int[] c=new int[26];
		Arrays.fill(c, 0);
		int[] d=new int[26];
		Arrays.fill(d, 0);
		for(int i=0;i<s.length();i++)
		{
			c[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s1.length();i++)
		{
			d[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==d[i]&&c[i]>0 && d[i]>0)
				 for(int j = 0 ; j < Math.min(c[i] , d[i]) ; j++) 
		            { 
				System.out.println((char)(i+'a'));
		            }
		}

	}

}

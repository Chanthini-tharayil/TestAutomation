package prepstring1;

import java.util.Arrays;

public class descendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="alkasingh";
		int[] a=new int[26];
		Arrays.fill(a, 0);
		for(int i=0;i<t.length();i++)
			a[t.charAt(i)-'a']++;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]>0)
			System.out.println((char)(i+'a'));
		}

	}

}

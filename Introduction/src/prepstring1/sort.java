package prepstring1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] s=	{"geeks", "for", "geeks", "quiz"};
	String[] s1=null;
	int[] a= new int[26];
	Arrays.fill(a, 0);
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i].charAt(0));
		a[s[i].charAt(0)-'a']++;
		
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>0)
		System.out.println((char)(i+'a'));
	}
	int j=0,c=0;
	for(int i=0;i<a.length;i++)
	{
		System.out.println(s[i].charAt(0)+" "+(char)(i+'a'));
		if(a[i]>0 && s[i].charAt(0)==(char)(i+'a'))
		{
			while(a[i]<0)
			{
				s1[j]=s[i];
				j++;
				a[i]--;
			}
		}
	}
	

		}

	}



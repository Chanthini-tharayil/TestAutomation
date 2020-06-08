package prepstring;

import java.util.Arrays;

public class commonalphabetsinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="characters";
String s1="alphabets";
int[] a =new int[26];
Arrays.fill(a, 0);
for(int i=0;i<s.length();i++)
{
	
	if(a[s.charAt(i)-'a']==0)
		a[s.charAt(i)-'a']=1;
}
for(int i=0;i<s1.length()-1;i++)
{
	if(a[s1.charAt(i)-'a']!=1&&a[s1.charAt(i)-'a']==0)
		a[s1.charAt(i)-'a']=-1;
	
}
for(int i=0;i<a.length;i++)
{
	if(a[i]==-1)
		System.out.println((char)(i+'a'));
}
	}

}

package prep;

import java.util.Arrays;

public class bigestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={54, 546, 548, 60};
StringBuilder s=new StringBuilder();
for(int i=0;i<a.length;i++)
	s.append(a[i]);
System.out.println(s.toString());
String s1=s.toString();
char[] b=new char[s1.length()];
for(int i=0;i<s1.length();i++)
{
b[i]	=s1.charAt(i);
}
Arrays.sort(b);
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
	}

}

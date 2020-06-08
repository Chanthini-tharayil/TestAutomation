package prepstring;

import java.util.Arrays;
import java.util.Stack;

public class removeminstringtoformanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abcdeh       //aeh
	String	str1 = "bcadeh", str2 = "hea";
Stack<Character> m=new Stack<Character>();
for(int i=0;i<str2.length();i++)
{
	m.push(str2.charAt(i));
}
int count=0;
for(int i=0;i<str1.length();i++)
{
	if(!m.contains(str1.charAt(i)))
		count++;
}
System.out.println(count);
}
	}



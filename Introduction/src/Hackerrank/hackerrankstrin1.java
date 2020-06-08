package Hackerrank;

import java.util.HashMap;
import java.util.HashSet;

public class hackerrankstrin1 {
	public static void main(String[] args) {
	String test1="hhaacckkekraraannk";
	String test="hackerrank";
	StringBuilder s1= new StringBuilder();
	
	int index=0;
	for(int i=0;i<test.length();i++)
	{
		for(int j=index;j<test1.length();j++)
		{
			if(test.charAt(i)==test1.charAt(j))
			{
				s1.append(test1.charAt(j));
				index=j;
				break;
				
			}
		}
	}
	
	if(s1.toString().equals(test))
	{
		System.out.println("YES");
	}
	else
		System.out.println("NO");
	}
	
}

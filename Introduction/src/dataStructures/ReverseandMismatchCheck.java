package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReverseandMismatchCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="taste";
		int len=str.length();
		int count=0;
		String str1="";
		System.out.println(str);
		for(int i=len-1;i>=0;i--)
		{
			str1+=str.charAt(i);
			
		
		}
		System.out.println(str1);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==str1.charAt(i))
				continue;
			else
				count++;
				
		}
		System.out.println(count);
	 

}
	
}

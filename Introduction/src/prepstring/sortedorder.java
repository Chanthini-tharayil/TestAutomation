package prepstring;

import java.util.Iterator;
import java.util.PriorityQueue;

public class sortedorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dabea";
		char[] c= s.toCharArray();
		char temp=' ';int j=0;
	for(int i=1;i<s.length();i++)
	{
		temp=c[i];
		j=i-1;
		while(j>=0 && temp<c[j])
		{
			c[j+1]=c[j];
			j--;
		}
		c[j+1]=temp;
	}
	for(int i=0;i<c.length;i++)
		System.out.println(c[i]);

	}

}

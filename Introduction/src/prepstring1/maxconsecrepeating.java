package prepstring1;

import java.util.Arrays;

public class maxconsecrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[256];
		Arrays.fill(a,0);
		int count=0;
		char c=' ';
		String s="aaaabbcbbb";
		int max=Integer.MIN_VALUE;
		for(int i=1;i<s.length();i++)
		{
			if( s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			else
				count=0;
			if(max<count)
			{
				max=count;
				c=s.charAt(i);
			}
		}
		
		System.out.println(c);

	}

}

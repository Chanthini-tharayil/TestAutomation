package prepstring1;

import java.util.Arrays;

public class bothhalvessamechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccab";
		int[] a=new int[26];
		Arrays.fill(a, 0);
		for(int i=0;i<s.length()/2;i++)
			a[s.charAt(i)-'a']++;
		for(int i=s.length()/2;i<s.length();i++)
			a[s.charAt(i)-'a']--;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println("not same");
				break;
			}
			
		}

	}

}

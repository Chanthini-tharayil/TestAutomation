package prepstring1;

import java.util.Arrays;

public class Snippet {
	public static void main(String[] args) {
		String ch = "aabbcc"; 
        int k = 2; 
        int cnt[] = new int[26]; 
        int count=0,count1=0;
        for(int i=0;i<ch.length();i++)
        {
        	
        	for(int j=i;j<ch.length();j++)
        	{
        		
        	cnt[ch.charAt(j)-'a']++;       		
        			
        		
        	}
        }
        for(int i=0;i<cnt.length;i++)
        {
        if(cnt[i]==k)
        	count++;
        }
        System.out.println(count);
	}
}


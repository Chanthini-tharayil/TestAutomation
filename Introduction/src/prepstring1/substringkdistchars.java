package prepstring1;

import java.util.Arrays;

public class substringkdistchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch = "abcbaa"; 
        int k = 3; 
        int cnt[] = new int[26]; 
        int count=0,count1=0;
        for(int i=0;i<ch.length();i++)
        {
        	count=0;
    		Arrays.fill(cnt, 0);
        	for(int j=i;j<ch.length();j++)
        	{
        		
        		if(cnt[ch.charAt(j)-'a']==0)
        			count++;
        		cnt[ch.charAt(j)-'a']++;
        		if(count==k)
        			count1++;
        			
        		
        	}
        }
        System.out.println(count1);

	}

}

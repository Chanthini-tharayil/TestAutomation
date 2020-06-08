package prep;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class mergesortedarray {

	//find palindrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=58888;
		int b=a;
		int reverse=0,lastdigit=0;
		LinkedHashMap<Integer,Integer> i= new LinkedHashMap<Integer,Integer>();
		StringBuilder s= new StringBuilder();
		while(a!=0)
		{
			lastdigit=a%10;
			reverse=reverse*10+lastdigit;
			a=a/10;
			
		}
		a=b;
		if(b==reverse)
		{
			System.out.println("palindrome");
		}
		else
		{
			while(a!=0)
			{
				lastdigit=a%10;
				if(!i.containsKey(lastdigit))
					i.put(lastdigit, 1);
				else
					i.put(lastdigit, i.get(lastdigit)+1);
				a=a/10;
				
			}
			for(Map.Entry<Integer, Integer> j: i.entrySet())
			{
				System.out.println(j.getKey()+" "+j.getValue());
			}
			int count=0,count1=0;
			for(Map.Entry<Integer, Integer> j: i.entrySet())
			{
				 if(j.getValue()==1)
					count1++;
				 
			}
		//	System.out.println(count+" "+count1);
			for(Map.Entry<Integer, Integer> j: i.entrySet())
			{
				if(j.getValue()%2!=0 && count1>1)
				{
					System.out.println("cannot construct palindrome");
					break;
				}
				else if(j.getValue()%2==0 )
				{
					for(int k=0;k<j.getValue();k++)
					s.append(j.getKey());
				}
				
			}
			for(Map.Entry<Integer, Integer> j: i.entrySet())
			{
				if(j.getValue()%2!=0 && j.getValue()==1 && count1==1)
				s.insert(s.length()/2, j.getKey());
			}
			
		}
	
		
		System.out.println(s.toString());
		}
		
		
		
		
	}



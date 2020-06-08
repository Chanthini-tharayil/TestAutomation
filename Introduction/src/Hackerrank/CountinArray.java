package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(6);a.add(8);a.add(12);
		b.add(7);b.add(9);b.add(15);
		int count=0,count1=0;;
		//list.add(count);list.add(count1);
		if(a.size()==b.size())
		{
		        for(int i=0;i<a.size();i++)
		        {
		            if(a.get(i)<b.get(i))
		            {
		                
		                count++;
		            }
		        }
		        
		         for(int i=0;i<a.size();i++)
		        {
		            if(a.get(i)>b.get(i))
		            {
		                
		              count1++;
		            }
		        }
		}
		if(count>count1)
		{list.add(count);list.add(count1);}
		else
		{list.add(count1);list.add(count);}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}

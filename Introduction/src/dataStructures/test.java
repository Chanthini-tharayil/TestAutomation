package dataStructures;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);numbers.add(20);numbers.add(2);numbers.add(1);
		int k=2;
		 int count=0;
		 StringBuilder s=new StringBuilder();
		    for(int i: numbers)
		    count++;
		    int i=0,j=0,m=0;
		    String test="";
		    if(count%2!=0)
		    {
		        test="No";
		    }
		    else
		    {
		    while(i<count &&j<count)
		    {
		        j=i;
		        while(m<k)
		        {
		            
		           System.out.println(numbers.get(j));
		            j++;
		            m++;
		        }
		        System.out.println("-------------");
		        
		        i=i+k;
		       // j=i;
		       m=0;
		    }

		    }

		    
		    
		    }

	}



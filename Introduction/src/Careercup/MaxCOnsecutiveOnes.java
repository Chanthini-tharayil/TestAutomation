package Careercup;

import java.util.Arrays;
import java.util.Collections;
/*Find the maximum consecutive 1's in an array of 0's and 1's.
Example:
a) 00110001001110 - Output :3 [Max num of consecutive 1's is 3]
b) 1000010001 - Output :1 [Max num of consecutive 1's is 1]*/
public class MaxCOnsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,0,1,1,1,0,0,1,1,0,1,1,1,1,0};
		Boolean isStart=false;
		Boolean isEnd=false;		
		int[] c=new int[a.length];
		int j=0;
		int count=0;
		for( int i=0;i<a.length;i++)
		{
			if(a[i]==1&& isStart==false)
			{
				isStart=true;
			    count++;
			}
			else if(a[i]==1 &&isStart==true &&isEnd==false)
			{
				count++;
			}
			else if(a[i]!=1 && isStart==true&&isEnd==false)
			{
				isEnd=true;isStart=false;
				c[j]=count;
				count=0;
				j++;
				
			}
			
			else if(a[i]==1 && isEnd==true)
			{
				isStart=true;isEnd=false;
				count++;
			}
		

	
	}
		int k=0,max=0;
		while(k<c.length)
		{
			if(c[k]>max)
			{
				max=c[k];
			}
			
			k++;
		}
		
System.out.println(max);
}
}
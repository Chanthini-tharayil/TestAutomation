package prep1;

import java.util.Arrays;

public class noofsubsetswithproductlessthank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2, 4, 5, 3};
		int k=12;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				//if(a[i]*a[j]<=12)
				//	System.out.println(a[i]+" "+a[j]);
			}
		}
		int p=0,l=a.length-1;
		Arrays.sort(a);
		while(p<a.length-1 &&l>0)
		{
			if(a[p]*a[l]<=12 )
			{
				System.out.println(a[p]+" "+a[l]);
				l--;
			}
			else if(a[p]*a[l]>12)
				
			{
				l--;
			}
			
		}
		
		

	}

}

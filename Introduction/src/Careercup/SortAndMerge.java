package Careercup;

import java.util.Arrays;

public class SortAndMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,12,14,15};
int[] b= {2,3,1,4};
int[] c=new int[a.length+b.length];
Arrays.sort(a);
Arrays.sort(b);
int i=0,j=0,m=0;
while(i<a.length&&j<b.length)
{
	if(a[i]>b[j])
	{
		c[m]=b[j];
		j++;m++;
		
	}
	else if(a[i]<b[j])
	{
		c[m]=a[i];
		m++;i++;
		
	}
	else if(a[i]==b[j])
	{
		c[m]=a[i];
		m++;i++;j++;
	}
}
while(i<a.length)
{
	
	c[m]=a[i];
	m++;i++;
	
}
while(j<b.length)
{
	c[m]=b[j];
	m++;j++;
	
}
for( int s=0;s<c.length;s++)
	System.out.println(c[s]);
	}

}

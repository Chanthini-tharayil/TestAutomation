package prep;

public class mergetwosortedarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,6,8,10}; 
        int b[] = {3,5,7,9}; 
        int i=0,j=0,m=0;
        int[] c= new int[a.length+b.length];
        while(i<a.length && j<b.length)
        {
        	if(a[i]<b[j])
        	{
        		c[m]=a[i];
        		i++;
        		m++;
        	}
        	else if(a[i]==b[j])
        	{
        		c[m]=a[i];
        		i++;
        		j++;
        		m++;
        	}
        	else if(a[i]>b[j])
        	{
        		c[m]=b[j];
        		m++;j++;
        	}
        }
        if(i<a.length)
        {
        	while(i<a.length)
        	{
        		c[m]=a[i];
        		m++;i++;
        	}
        }
        else if(j<b.length)
        {
        	while(j<b.length)
        	{
        		c[m]=b[j];
        		m++;j++;
        	}
        }
        for(int k=0;k<c.length;k++)
        	System.out.println(c[k]);

	}

}

package prep1;

import java.util.Arrays;

public class xygreatherthanyx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5, 6};
		int index=3;
		int i=-1,j=0,temp=0,m=0;
		while(i<a.length && j<a.length)
		{
			j=i+index;
				m=j;
				
				while(i<j)
				{
					i++;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i++;
					j--;
				}
				i=m;
				j=i+index;
				
			
		}
		for(int k=0;k<a.length;k++)
			System.out.println(a[k]);
	
	}

}

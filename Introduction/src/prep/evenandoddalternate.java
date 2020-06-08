package prep;

import java.util.Arrays;
import java.util.Collections;

public class evenandoddalternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {-1, 2, 1, -4, -5, 6, -8, 8} ;
		Arrays.sort(a,Collections.reverseOrder());
		int j=1,i=0,temp=0;
		while(i<a.length &&j<a.length)
		{
			if(a[i]>0)
				i++;
			else if(a[i]<0)
			{
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j+=2;
				
				
			}
				
		}
		for(int m=0;m<a.length;m++)
			System.out.println(a[m]);
	}

}

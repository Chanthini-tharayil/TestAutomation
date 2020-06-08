package prep;

import java.util.Arrays;

public class pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-1, 2, 1, -4, -5, 6, -8, 8} ;
		Arrays.sort(a);
		int i=0,j=a.length-1;
		while(i<a.length && j<a.length)
		{
			if(a[i]+a[j]==3)
			{
				System.out.println(a[i]+" "+a[j]);
			i++;j--;	
			}
			else if(a[i]+a[j]<3)
			i++;
			else if(a[i]+a[j]>3)
				j--;
		
		}

	}

}

package prepstring1;

import java.util.Arrays;

public class maxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {5,1,3,4,2};
		//int[] b = {8,10,9,7,6};
		//int i=0,j=1;
		int large=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++)
		{
			if(large<a[i]*a[i+1] && i+1<a.length)
				large=a[i]*a[i+1];
		}
		System.out.println(large);
		
	}

}

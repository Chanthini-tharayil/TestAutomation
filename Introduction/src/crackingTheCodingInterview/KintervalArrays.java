package crackingTheCodingInterview;

import java.util.Arrays;
import java.util.HashSet;

public class KintervalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,4,4,2,1,5,7};//1,2,3,4,5,7,10
		int k=2;
		Arrays.sort(a);
	//	HashSet<Integer> m= new HashSet();
		int i=0,j=0;
		while(j<a.length)
		{
			if(a[j]-a[i]==2)
			{
				System.out.println(a[i]+","+a[j]);
				i++;
				j++;
			}
			else if(a[j]-a[i]<2)
			{
				j++;
			}
			else if(a[j]-a[i]>2)
			{
				i++;
			}
			else
			{
				i++;j++;
			}
		}
		

	}

}

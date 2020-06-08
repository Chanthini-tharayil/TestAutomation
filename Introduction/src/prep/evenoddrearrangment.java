package prep;

import java.util.Arrays;

public class evenoddrearrangment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Given an array of n elements. Our task is to write a program to rearrange the array such 
 * that elements at even positions are greater than all
 *  elements before it and elements at odd positions are less than all elements before it.
 *  Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
Output : 4 5 3 6 2 7 1

Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} 
Output : 4 5 2 6 1 8 1 8*/
	
 
		int[] a= {1, 2, 1, 4, 5, 6, 8, 8} ;
		
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		Arrays.sort(b);
		int evenpos=a.length/2;
		int oddpos=a.length-evenpos;
		int j=oddpos-1;
		for(int i=0;i<a.length;i+=2)
		{
			a[i]=b[j];
			j--;
		}
		 j=oddpos;
		for(int i=1;i<a.length;i+=2)
		{
			a[i]=b[j];
			j++;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}

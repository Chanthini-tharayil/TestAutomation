package Hackerrank;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,10,4,5,20};
		int a[]=new int[arr.length];
		Arrays.sort(arr);
		
		long max=0 ,min=0;
		for(int i=0;i<arr.length-1;i++)
		{
			min+=arr[i];
		}
		System.out.println(min);
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			a[j]=arr[i];
			j++;
		}
		for(int i=0;i<a.length-1;i++)
		{
			max+=a[i];
		}
		System.out.println(max);
		//System.out.println(arr[arr.length-1]);
		
		

	}

}

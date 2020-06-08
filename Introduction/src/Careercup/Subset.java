package Careercup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Subset {
	
	/*Verify if S2 = {5,8,2} is 
	 * a subset of S1 = {1,5,4,6,8,2} and S3 = {5,8,2,7} 
	 * is not a subset of S1.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a[]= {5,8,2};//258
		int b[]= {1,5,4,6,8,2};//124568
		int c[]= {5,8,2,7};//2578
		int i=0,j=0,count=0;
		Arrays.sort(a);Arrays.sort(b);Arrays.sort(c);
		while(i<a.length&&j<b.length)
		{
			if(a[i]==b[j])
			{
				i++;j++;count++;
			}
			else if(a[i]>b[j])
			{
				j++;
			}
			else if(a[i]<b[j])
				i++;
		}
		if(count==a.length||count==b.length)
		{
			System.out.println("subset");
		}
		else
			System.out.println("not a subset");*/
		
		
		//USING HASHMAP
		
		
		int[] S1 = {1,5,4,6,8,2};
		int[] S2 = {5,8,2};
		int[] S3 = {5,8,2,7};
		
		HashMap<Integer, Integer> map = new HashMap();
		for(int i=0;i<S1.length;i++)
		{
			map.put(S1[i], 1);
		}
		
		for(int i=0;i<S2.length;i++)
		{
			if(!map.containsKey(S2[i]))
				System.out.println("S2 is not subset");
		}
		
		for(int i=0;i<S3.length;i++)
		{
			if(!map.containsKey(S3[i]))
				System.out.println("S3 is not subset");
		}
		
		//USING LIST
		
		/*int[] S1 = {1,5,4,6,8,2};
		int[] S2 = {5,8,2};
		int[] S3 = {5,8,2,7};
		
		List<Integer> s1List = new ArrayList<Integer>();
		for(int s: S1) {
			s1List.add(s);
		}
		
		List<Integer> s2List = new ArrayList<Integer>();
		for(int s: S2) {
			s2List.add(s);
		}
		
		List<Integer> s3List = new ArrayList<Integer>();
		for(int s: S3) {
			s3List.add(s);
		}
		
		// Finding if S2 is a subset of S1
		boolean isSubset = false;
		for(int s: s2List) {
			
			if (s1List.contains(s)) {
				isSubset = true;
			}
			else {
				isSubset = false;
				break;
			}
		}
		System.out.println("Is S2 Subset of S1: "+isSubset);
		
		// Finding if S2 is a subset of S1
		isSubset = false;
		for(int s: s3List) {
			
			if (s1List.contains(s)) {
				isSubset = true;
			}
			else {
				isSubset = false;
				break;
			}
		}
		System.out.println("Is S3 Subset of S1: "+isSubset);
		
*/
	}

}

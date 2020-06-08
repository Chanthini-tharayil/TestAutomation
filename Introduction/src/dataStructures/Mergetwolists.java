package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import dataStructures.Linkedlist.Node;

// You can dreclty merge taking union of lists or use ListUtils.addall function
//To Remove duplicates-Check if ar3 contains that elemnt before adding it

public class Mergetwolists {
	public static void main(String[] args) {
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ArrayList<Integer> ar2 = new ArrayList<Integer>();
	ArrayList<Integer> ar3 = new ArrayList<Integer>();
	ar1.add(2);ar1.add(3);ar1.add(1);ar1.add(7);ar1.add(8);
	ar2.add(5);ar2.add(9);ar2.add(4);ar2.add(1);
	ar1.sort(null);
	ar2.sort(null);
	System.out.println(ar1);
	System.out.println(ar2);
	Iterator iterator1 = ar1.iterator();
	Iterator iterator2 = ar2.iterator();
	int index=0;
	int count=0;
	while(index<ar1.size()&& count<ar2.size())
	{
			if(ar1.get(index)<ar2.get(count) )
			{
				ar3.add(ar1.get(index));
				index++;
			}
			else 
			{
				ar3.add(ar2.get(count));
				count++;
			}
	}
	if(index==ar1.size())
	{
	while(count<ar2.size())
	{
		ar3.add(ar2.get(count));
		count++;
	}
	}
	else if(count==ar2.size())
	{
		while(index<ar1.size())
		{
			ar3.add(ar1.get(count));
			index++;
		}
	}
	System.out.println(ar3);
}
}

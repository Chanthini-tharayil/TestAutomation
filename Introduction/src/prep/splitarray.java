package prep;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class splitarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] a= {1,2,3,4,5};
 int[] b= {2,5,6,7,8};
 List<Integer> array= new ArrayList<Integer>();
 int i=0,j=0,sum=0;
 while(i<a.length && j<b.length)
 {
	 sum=a[i]+b[j] ;
	// System.out.println(sum/10);
	 if(sum/10==0)
	 array.add(sum);
	 else
	 {
		 int temp=sum%10;
		 sum=sum/10;
		 array.add(sum);
		 array.add(temp);		 
		 
	 }
	 i++;j++;
 }
 ListIterator<Integer> llist= array.listIterator();
 while(llist.hasNext())
 {
	 System.out.println(llist.next());
	// llist.next();
 }
 
	}

}

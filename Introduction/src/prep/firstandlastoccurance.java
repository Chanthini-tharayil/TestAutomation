package prep;

import java.util.ArrayList;
import java.util.List;

public class firstandlastoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {1,2,3,4,5,6,2,6};
 int n =2;
 List<Integer> m = new ArrayList<Integer>();
 int i =0;
 while(i<a.length)
 {
	 if(a[i]==n)
	 {

		 m.add(i);
		 i++;
	 }
	
	 
	 i++;
 }
 m.sort(null);
 System.out.println("First Occurance is:"+m.get(0));
 System.out.println("Last Occurance is:"+m.get(m.size()-1));
	}

}

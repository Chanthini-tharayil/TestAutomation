package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findnotusinglinersearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-1,-2,-3,4,3,-4,5,6,7,9,-9};
		int count=0;
		Boolean isstart=false,isend=false;
		List<Integer> m = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0 )
			{
				isstart=true;
				count++;
			}
			if(a[i]<0 && isstart==true )
			{
				isend=true;
				isstart=false;
				m.add(count);
				count=0;
			}
			
			
			//count=0;
		}
		
		m.sort(null);
	System.out.println(m.get(m.size()-1));
		

	}

}

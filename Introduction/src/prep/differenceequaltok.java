package prep;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class differenceequaltok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 5, 3, 6, 2};
		int k = 3,diff=0;
		//Arrays.sort(a);
		LinkedHashSet<Integer> m =new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			diff=Math.abs(a[i]+k);
			if(!m.contains(diff))
			{
				m.add(a[i]);
			}
			else
				System.out.println(a[i]+" "+diff);
		}
		

	}

}
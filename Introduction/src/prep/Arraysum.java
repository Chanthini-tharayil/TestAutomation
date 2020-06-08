package prep;

import java.util.Arrays;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {0,1,2,2,3,4,5};
		int sum=4;
		Arrays.sort(array);
		int start=0,last=array.length-1;
		while(start<last)
		{
			if(array[start]+array[last]==sum)
			{
				System.out.println(array[start]+" "+array[last]);
				start++;last--;
			}
			else if(array[start]+array[last]>sum)
				last--;
			else if(array[start]+array[last]<sum)
				start++;
		}
		

	}

}

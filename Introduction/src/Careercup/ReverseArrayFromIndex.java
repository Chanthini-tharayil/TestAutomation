package Careercup;

public class ReverseArrayFromIndex {
	
	/*Reverse an array in subset of N. Example:
input: Array = [1,2,3,4,5,6,7,8,9], N = 3
output: [3,2,1,6,5,4,9,8,7]*/

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9};
		int n=2;
		int i=0,j=0;
		while(j<array.length&&i<array.length)
		{
			j=j+n;
			int m=j;
			while(m>=i)
			{
				System.out.println(array[m]);
				m--;
			
			
		    }
			i=j+1;
						

	}

}
}

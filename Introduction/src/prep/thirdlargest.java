package prep;

import java.util.Arrays;

public class thirdlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,1,4,5,8,20};
		Arrays.sort(a);
		
		System.out.println(a[a.length-3]);
		
	}

}

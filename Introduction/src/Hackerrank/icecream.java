package Hackerrank;

import java.util.Arrays;

public class icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,4,3};
		int m=4;
		int[] a=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==m)
                {
                  a[0]=i+1;
                  a[1]=j+1;
                }
            }
        }
        Arrays.sort(a);
for(int i=0;i<a.length;i++)
	System.out.println(a[i]);

	}

}

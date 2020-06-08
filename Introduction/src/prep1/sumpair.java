package prep1;

import java.util.Arrays;

public abstract class sumpair {
	public static void main(String[] args) {
	 int a[]= {6,2,3,10,5,6,2,0};//1,2,2,3,5,6,6,10
	 int n =5;
	 Arrays.sort(a);
	 int i=0,j=a.length-1;
	 while(i<a.length &&j>0)
	 {
		 if(a[i]+a[j]==n)
		 {
			 System.out.println(a[i]+" "+a[j]);
			 i++;j--;
		 }
		 else if(a[i]+a[j]<n)
			 i++;
		 else if(a[i]+a[j]>n)
			 j--;
		 
			 
			 
	 }
	}
	 

}

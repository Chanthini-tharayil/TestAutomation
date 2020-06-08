package prep1;

import java.util.Arrays;

public class difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {6,2,3,10,5,6,2,1};//1,2,2,3,5,6,6,10
		 int n =1;
		 Arrays.sort(a);
		 int i=0,j=1;
		 while(i<a.length &&j<a.length)
		 {
			 if(a[j]-a[i]==1)
			 {
				 System.out.println(a[i]+" "+a[j]);i++;j++;
			 }
			 else if(a[j]-a[i]<1)
				 j++;
			 else if(a[j]-a[i]>1)
				 i++;
		 }

	}

}

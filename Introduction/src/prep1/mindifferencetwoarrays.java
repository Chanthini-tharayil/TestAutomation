package prep1;

import java.util.Arrays;

public class mindifferencetwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]={1, 5, 3, 19, 25};
 Arrays.sort(a);
 int i=0,j=1;
 int mindiff=Integer.MAX_VALUE;
 while(i<a.length && j<a.length)
	{
	 if(a[j]-a[i]<mindiff)
		 mindiff=a[j]-a[i];
	 i++;j++;
	}
 System.out.println(mindiff);
}
}
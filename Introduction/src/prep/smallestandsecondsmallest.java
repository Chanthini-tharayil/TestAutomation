package prep;

public class smallestandsecondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-1, 2, 1, -4, -5, 6, -8, 8} ;
		int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]<second && a[i]!=first)
				second=a[i];
		}
		System.out.println(first+" "+second);

	}

}

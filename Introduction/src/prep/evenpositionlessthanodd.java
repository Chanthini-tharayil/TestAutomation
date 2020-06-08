package prep;

import java.util.Arrays;

public class evenpositionlessthanodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2,2,1};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		Arrays.sort(b);
		int count=0,j=0;
		for(int i=0;i<a.length;i+=2)
		{
			a[i]=b[j];
			count++;j++;
		}
		for(int i=1;i<a.length;i+=2)
		{
			a[i]=b[count];
			count++;
		}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}

package prep;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5, 6, 7};//3456767
		int d=2,count=0;
		int temp;
		int i;
		for(int j=0;j<d;j++)
		{
			temp=a[0];
			for( i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[i]=temp;
		}
		
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	/*	int temparray[] =new int[d];
		for( i=0;i<d;i++)
			temparray[i]=a[i];
		for(i=0;i<a.length-2;i++)
		{
			a[i]=a[d];
			d++;count++;
	       }
		for( i=0;i<2;i++)
			{
			a[count]=temparray[i];
			count++;
			}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
	}

}

package prep;

public class moveallpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -2, -3, 0, -1, 0, 1, 5, -3 };
		int j=0,temp,count=0,m=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
				}
			else if(a[i]==0)
			{
			temp=a[m];
			a[m]=a[i];
			a[i]=temp;
			m--;
			}
		else if(a[m]==0)
		{
			m--;
		}
		}
	/*	j=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j--;
				}
			else if(a[j]==0)
			{
				j--;
			}
			if(a[i]==0)
				count++;
		}*/
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

	}

}

package prep1;

public class sortzeroonetwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={0, 1, 2, 0, 2,1, 1};
		int i=0,j=0,temp=0,l=a.length-1;
		while(i<a.length &&j<a.length&&l>j)
		{
			if(a[j]==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;j++;
				
			}
			else if(a[j]==2)
			{
				temp=a[j];
				a[j]=a[l];
				a[l]=temp;
				l--;j++;
			}
			else
			{
				j++;
			}
		}
		for(int k=0;k<a.length;k++)
			System.out.println(a[k]);
			

	}

}

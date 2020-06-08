package prep1;

public class sizeofsubarraywithmaxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	a[] = {1, -2, 1, 1, -2, 1};
	int max1=Integer.MIN_VALUE,min=0,start=0,end=0,s=0;
	for(int i=0;i<a.length;i++)
	{
		min=min+a[i];
		if(min>max1)
		{
			max1=min;
			start=s;
			end=i;
			
		}
		if(min<0)
		{
			min=0;
			s=i+1;
		}
	}
	int len=end-start+1;
	System.out.println(max1);
	

	}

}

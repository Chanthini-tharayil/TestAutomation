package prep1;

public class subarraywithzerosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {4,2,-3,-1,0,4};
int start=0,end=0,sum=0;
for(int i=0;i<a.length;i++)
{
	sum=a[i];
	for(int j=i+1;j<a.length;j++)
	{
		sum+=a[j];
		if(sum==0)
		{
			start=i;
			end=j;
		}
	}
}
for(int i=start;i<=end;i++)
	System.out.println(a[i]);
	}
	

}

package prep1;

public class mindiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={1, 5, 3, 19, 18, 25};
int min=Integer.MAX_VALUE;int i=0,j=0;
for( i=0;i<a.length;i++)
{
	for( j=i+1;j<a.length;j++)
	{
		if(Math.abs(a[i]-a[j])<min)
		{
			min=Math.abs(a[i]-a[j]);
			
		}
	}
}
System.out.println(min);
	}

}

package prep1;

public class mindistancebetween2digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	a[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4,  3};
	int x = 3, y = 6,dist=0,min=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==x && a[j]==y || a[i]==y && a[j]==x)
			{
				dist=j-i;
			}
		}
		if(min>dist)
			min=dist;
	}
	System.out.println(min);
	}

}

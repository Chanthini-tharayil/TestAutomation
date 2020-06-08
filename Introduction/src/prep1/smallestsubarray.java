package prep1;

import java.util.Arrays;

public class smallestsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1, 4, 45, 6, 0, 19};
int x  =  51;
//Arrays.sort(a);
int sum=0,pos=0;
for(int i=0;i>a.length;i++)
{
	sum+=a[i];
	if(sum==x)
	{
		pos=i;
		break;
	}
}
for(int i=a.length-1;i>pos;i--)
{
	System.out.println(a[i]);
}
	}

}

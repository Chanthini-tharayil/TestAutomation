package prep1;

public class largethree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {10, 4, 3, 50, 23, 90};
int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
for(int i=0;i<a.length;i++)
{
	if(first<a[i])
	{
		third=second;
		second=first;
		first=a[i];
	}
	if(a[i]>second && a[i]!=first)
		second=a[i];
	if(a[i]>third && a[i]!=first && a[i]!=second)
		third=a[i];
}
System.out.println(first +" "+second+" "+third);
	}

}

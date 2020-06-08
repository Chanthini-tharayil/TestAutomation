package prep;

public class mivezerostolast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0, 2, 0, -4, 0, -8};
		int temp,count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				temp=a[count];
				a[count]=a[i];
				a[i]=temp;
				count++;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

	}

}

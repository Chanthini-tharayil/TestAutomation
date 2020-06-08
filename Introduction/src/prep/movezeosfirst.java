package prep;

public class movezeosfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int i=0,j=a.length-1,temp=0;
		while(i<j)
		{
			if(a[i]==0)
			{
				i++;
			}
			else
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j--;
			}
		}
		
		for(int k=0;k<a.length;k++)
			System.out.println(a[k]);
	}

}

package prep1;

public class movez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 0, 4, 3, 0, 5, 0};
		int i=0,j=0,temp=0;
		while(i<a.length && j<a.length)
		{
			if(a[j]!=0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j++;
				
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

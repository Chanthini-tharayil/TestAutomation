package Sorting;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,34,2,19,67,45};
		
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		for( int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}

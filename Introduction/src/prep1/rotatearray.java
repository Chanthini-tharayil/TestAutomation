package prep1;

public class rotatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int d = 2, n =7;
		for(int i=0;i<d;i++)
		{
			shiftArray(arr,n);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

	private static void shiftArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp=0,i=0;
		temp=arr[0];
		for(i=0;i<n-1;i++)
		{
			
			arr[i]=arr[i+1];
			
		}
		arr[i]=temp;
	}

}

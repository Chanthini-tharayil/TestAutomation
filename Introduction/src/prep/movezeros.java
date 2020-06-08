package prep;

public class movezeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Move all zeroes to end of array
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		int temp,start=0,end=arr.length-1,count=0;
		for(int i=0;i<arr.length;i++)
				{
			if(arr[i]!=0)
				arr[count++]=arr[i];
				}
		while(count<arr.length)
		{
			arr[count]=0;
			count++;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}

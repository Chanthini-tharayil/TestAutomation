package prep;

public class reversearrayatindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int k=2;
		int n=arr.length;
		for (int i = 0; i < n; i += k) 
        { 
            int left = i; 
      
            // to handle case when k is not multiple 
            // of n 
            int right = Math.min(i + k - 1, n - 1); 
            int temp; 
              
            // reverse the sub-array [left, right] 
            while (left < right) 
            { 
                temp=arr[left]; 
                arr[left]=arr[right]; 
                arr[right]=temp; 
                left+=1; 
                right-=1; 
            } 
        } 
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	

}

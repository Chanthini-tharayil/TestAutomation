package dataStructures;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={5,4,3,2,1};
		System.out.println("Before");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		//arr= {5,4,3,2,1};
		   int n = arr.length;
	        for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	        
	        System.out.println("After");
	        for(int i=0;i<arr.length;i++)
	        System.out.println(arr[i]);


	}

}

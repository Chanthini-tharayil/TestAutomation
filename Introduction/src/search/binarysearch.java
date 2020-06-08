package search;

public class binarysearch {
	static int binarySearch(int arr[], int x) 
    { 
		int r = 0, len = arr.length -1; //length- 1 is taken as array starts from index 0
	 while(r<=len)
	 {
		 int mid=(r+len)/2;
		 if(arr[mid]==x)
		 {
			 //System.out.println(mid);
		 return mid;
		 }
		 else if(arr[mid]>x)
		 {
			 len=mid-1;
		 }
		 else if(arr[mid]<x)
		 { 
			 r=mid+1;
	 }
	 }
	 
	 return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 2, 3, 4, 10, 40 }; 		 
		 int x=40;
		 binarysearch ob = new binarysearch(); 
		 int result=binarySearch(arr,x);
		 
		 if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at "
	                               + "index " + result); 
	
	}

}

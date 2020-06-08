package Careercup;

public class ZerosAndOnes {
	
	/*Given a binary array {0,1,1,0,0,1,0,0,1} , sort the array in 
	 * a way that all zeros come to the left and all the one's come to the right 
	 * side of the array.*/
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {0,1,1,0,1,0,1};
		 int temp=0,count=-1;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==0)
			 {
				 count++;
				 temp=a[i];
				 a[i]=a[count];
				 a[count]=temp;
			
			 }
		 }
		 for(int i=0;i<a.length;i++)
			 System.out.println(a[i]);

	}

}

package prep;

public class largestthreelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {10, 4, 3, 50, 23, 90};
		 int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]>first)
			 {
				 third=second;
				 second=first;
				 first=a[i];
				 
				 
			 }
			 else if(a[i]>second && a[i]!=first)
			 {
				 second=a[i];
			 }
			 else if(a[i]>third && a[i]!=first &&a[i]!=second)
				 third=a[i];
		 }
		 
			 System.out.println(first+" "+second+" "+third);
		 

	}

}

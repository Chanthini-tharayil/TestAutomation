package prep1;

public class largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		 int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
		 for(int i=0;i<a.length;i++)
		 {
			 if(first<a[i])
				 
			 {
				 third=second;
				 second=first;
				 first=a[i];
			 }
		 }
		 System.out.println(first+" "+second+" "+third);

	}

}

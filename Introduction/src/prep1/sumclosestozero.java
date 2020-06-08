package prep1;

public class sumclosestozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {1, 60, -10, 70, -80, 85};
		 int sum=Integer.MAX_VALUE,test=0,i=0,ele=0,ele1=0;
		while(i<a.length-1 )
		 {
			 test=Math.abs(a[i]+a[i+1]);
					 if(sum>test)
					 {
						 sum=test;
						 ele=a[i];ele1=a[i+1];
					 }
					 i++;
		 }
		 System.out.println(sum +" "+ele+" "+ele1);

	}

}

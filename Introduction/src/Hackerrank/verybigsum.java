package Hackerrank;

public class verybigsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-1,-2,-3,4,5,2,1,0};
		float postive=0,negative=0,zero=0;
        int len=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            negative++;
            else if(arr[i]>0)
            postive++;
            else if(arr[i]==0)
            zero++;
        }
System.out.println(postive/len);
System.out.println(negative/len);
System.out.println(zero/len);
		

	}

}

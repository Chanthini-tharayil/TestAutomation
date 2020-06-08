package prep1;

public class mindsitanc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]=	{3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
	int x = 3, y = 6;
	int i=0,j=0,dist=Integer.MAX_VALUE,count=0;
	 for (i = 0; i < arr.length; i++)  
     { 
         for (j = i + 1; j < arr.length; j++)  
         { 
             if ((x == arr[i] && y == arr[j] 
                 || y == arr[i] && x == arr[j]) 
                 && dist > Math.abs(i - j))  
            	 dist = Math.abs(i - j); 
         } 
     } 
	System.out.println(dist);

	}

}

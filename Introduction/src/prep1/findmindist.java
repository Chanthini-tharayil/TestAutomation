package prep1;

public class findmindist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 4, 2, 6, 5, 6, 5, 4,1,2,  3};
		int X = 3, Y = 6;
		int N=arr.length;

		
		 int pos1 = Integer.MAX_VALUE;
		    int pos2 = Integer.MAX_VALUE;
		    int distance = 0;
		    int newDistance=0;
		    pos1 = pos2 = distance = Integer.MAX_VALUE;
		 
		    for (int k = 0; k < arr.length; k++)
		    {
		        if (arr[k] == X)
		            pos1 = k;
		        else if (arr[k] == Y)	
		        	pos2 = k;
		 
		      
		            newDistance = Math.abs(pos1 - pos2);
		            if (distance > newDistance)
		                distance = newDistance;
		        
		    }
		    System.out.println(distance);
		 

		
	}

}

package Hackerrank;

public class staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
	//	StringBuilder s= new StringBuilder();
		for(int i=1;i<=n;i++)
		  {
		   for(int j=1;j<=n;j++)
		    
		   {
		    if((i+j)>n)
		    {
		    System.out.print("#");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		    
		   }
		   System.out.println();
		   
		  }
	}

}

package Hackerrank;

import java.util.HashSet;

public class cloudjumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c= {0, 0, 1 ,0 ,0 ,1 ,0};
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(i+2<c.length&&c[i]==0 && c[i+2]==0 )
			{
				count++;
				i=i+2;
				//continue;
			}
			else if(i+1<c.length&&c[i]==0 && c[i+1]==0  )
			{
				count++;
				i=i+1;
				
			}
			else if(i+1<c.length &&c[i]==1 &&c[i+1]==0)
			{
				count++;
				i=i+1;
			}
		}
	System.out.println(count);

	}

}

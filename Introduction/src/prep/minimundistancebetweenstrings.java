package prep;

import java.util.ArrayList;
import java.util.List;

public class minimundistancebetweenstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="brown the is quick and frog the brown ";
		String test1="the frog";
		String[] t=test.split(" ");
		String[] m = test1.split(" ");		
		int count=0;
		for(int i=0,j=0;i<t.length;i++)
		{
			if(t[i].equals(m[j]))
			{
				j++;
				//count++;
				if(j==m.length)
					break;
			}
			
			else
			{
			
				count++;
			}
		
		}
		System.out.println(count);

	}

}

package prepstring;

import java.util.Arrays;

public class countbinarcharas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[2];
		String s = "10010";
		int count=0,sub=0;
		char k='1';
		
		for(int i=0;i<a.length;i++)
		{
			Arrays.fill(a,0);
			for(int j=i;j<a.length;j++)
			{
				if(s.charAt(i)==k)
					count++;
				if(count==1)
					sub++;
					
			}
		}
		System.out.println(sub);
		
	}

}

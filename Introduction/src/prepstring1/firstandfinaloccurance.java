package prepstring1;

import java.util.Arrays;

public class firstandfinaloccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5,5,1,8};
		int n=1,first=-1,last=0;
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i]!=n)
				continue;
			if(first==-1)
			{
				System.out.println(i);
				first=0;
			}
			last=i;
		}
		System.out.println(last);
	
	}
}

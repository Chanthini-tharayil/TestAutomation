package prep1;

import java.util.Stack;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	a[] = {1, 2, 3};
	int i=0,j=a.length-1,temp=0;
	while(i<j)
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;j--;
	}
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
		Stack<Integer> m = new Stack<Integer>();
		for(int k=0;k<a.length;k++)
		{
			m.push(a[k]);
		}
		while(m.isEmpty()==false)
		{
			System.out.println(m.pop());
		}
		
	}

}

package prepstring1;

import java.util.Stack;

public class individualwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		Stack<Character> m=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				m.push(str.charAt(i));
			}
			else
			{
				while(m.isEmpty()==false)
				{
					System.out.println(m.pop());
				}
			}
			
		}
		System.out.println(" ");
		while(m.isEmpty()==false)
		{
			System.out.println(m.pop());
		}

	}

}

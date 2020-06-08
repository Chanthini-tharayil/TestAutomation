package prepstring;

import java.util.Stack;

public class reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		Stack<Character> m = new Stack<Character>();
		for(int i=0;i<s.length();i++)
			m.push(s.charAt(i));
		while(m.empty()==false)
		{
			System.out.println(m.pop());
		}

	}

}

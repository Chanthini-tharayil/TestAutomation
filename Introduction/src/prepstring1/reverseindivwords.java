package prepstring1;

import java.util.Stack;

public class reverseindivwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello World";
Stack<Character> m = new Stack<Character>();
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)!=' ')
	m.push(s.charAt(i));
	else
	{
		while(m.empty()==false)
		{
			System.out.println(m.pop());
		}
		
	}
}
while (m.empty() == false) { 
    System.out.print(m.pop());
	}

}
}
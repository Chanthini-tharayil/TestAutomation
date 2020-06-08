package Careercup;

/*
 * Write the test cases for below logic.
i/p: string, strong
o/p: strng
 */
import java.util.HashSet;

public class Commonstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="string";
		String d="strong";
		char[] c= s.toCharArray();
		char[] e=d.toCharArray();
		HashSet<Character> h= new HashSet();
		for(char i: c)
			h.add(i);
		for(char i: e)
		{
			if(h.contains(i))
				System.out.println(i);
		}

	}

}

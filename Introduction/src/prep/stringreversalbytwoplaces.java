package prep;

public class stringreversalbytwoplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Write a code to test whether string s2 is obtained by rotating the string s1 by 2 places.
		e.g S1="amazon" S2="azonam" return true
		S1="quality" S2="lityqua" return false*/
		
		String test="quality";
		String test1="lityqua";
		String test2="";
		System.out.println(test.substring(0,0)+test.substring(2)+test.substring(0,2));
		if(test1.equals(( test.substring(0,0)+test.substring(2)+test.substring(0,2))))
		{
			System.out.println("true");
		}
		
		

	}

}

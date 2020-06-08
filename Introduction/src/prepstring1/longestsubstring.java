package prepstring1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="ABDEFGABEF";
		 String output = "";
		 LinkedHashSet<Character> visited = new LinkedHashSet<Character>();	 
		 
		 for (int start = 0; start < input.length(); start++) {
		       
		        int end = start;
		        for (; end < input.length(); end++) {
		            char currChar = input.charAt(end);
		            if (visited.contains(currChar)) {
		                break;
		            } else {
		                visited.add(currChar);
		            }
		        }
		        if (output.length() < end - start + 1) {
		            output = input.substring(start, end);
		        }
	}
		 Iterator i=visited.iterator();
				 while(i.hasNext())
				 {
		System.out.println(i.next());
				 }
		    System.out.println(output);


}

}
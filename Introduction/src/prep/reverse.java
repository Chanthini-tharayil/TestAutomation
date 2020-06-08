package prep;

import java.util.Stack;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "This is a test method";		
		 Stack<Character> st=new Stack<Character>(); 
		   
		    // Traverse given string and push all 
		    // characters to stack until we see a space. 
		    for (int i = 0; i < str.length(); ++i) { 
		        if (str.charAt(i) != ' ') 
		            st.push(str.charAt(i)); 
		   
		        // When we see a space, we print 
		        // contents of stack. 
		        else { 
		            while (st.empty() == false) { 
		                System.out.print(st.pop()); 
		                  
		            } 
		            System.out.print(" "); 
		        } 
		    } 
		    while (st.empty() == false) { 
		        System.out.print(st.pop()); 
		          
		    } 
	}

}

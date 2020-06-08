package prepstring;

public class numberofwords {

	static final int OUT = 0; 
    static final int IN = 1; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "One two three\nfour\tfive";
	      int state = OUT; 
	        int wc = 0;  // word count 
	        int i = 0; 
	          
	        // Scan all characters one by one 
	        while (i < str.length()) 
	        { 
	            // If next character is a separator, set the  
	            // state as OUT 
	            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' 
	                    || str.charAt(i) == '\t') 
	                state = OUT; 
	                  
	       
	            // If next character is not a word separator 
	            // and state is OUT, then set the state as IN 
	            // and increment word count 
	            else if (state == OUT) 
	            { 
	                state = IN; 
	                ++wc; 
	            } 
	       
	            // Move to next character 
	            ++i; 
	        } 
	        System.out.println(wc);
				

	}

}

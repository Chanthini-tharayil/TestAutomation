package prepstring1;

public class removeconsecimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeks for geeks";
		
		System.out.print(str.charAt(0)); 
	      
        // loop to check for  
        // each character 
        for (int i = 1;  
                 i < str.length(); i++) 
      
            // comparison of  
            // consecutive characters 
            if (str.charAt(i - 1)!=  
                str.charAt(i)) 
                System.out.print(str.charAt(i));
        /*vowels code
         *  if ((!is_vow(str.charAt(i - 1))) ||  
                (!is_vow(str.charAt(i)))) 
                System.out.print(str.charAt(i)); 
         */
        
	}
	  static boolean is_vow(char c) 
      { 
          // this compares vowel  
          // with character 'c' 
          return (c == 'a') || (c == 'e') ||  
                 (c == 'i') || (c == 'o') ||  
                 (c == 'u'); 

      }
}

package prepstring1;

public class movetofront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[] = "a b c de".toCharArray();
		 int i = str.length-1;  
	        for (int j = i; j >= 0; j--)  
	            if (str[j] != ' ') 
	            { 
	                char c = str[i]; 
	                str[i] = str[j]; 
	                str[j] = c; 
	                i--; 
	            } 
	        System.out.println(String.valueOf(str)); 
	}

}

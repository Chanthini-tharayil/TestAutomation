package dataStructures;

public class URLifystring {

	public static void main(String[] args) {
		
		String url="My H";
	
		   char[] result = new char[50];

	        // Strip off any space at beginning or end
	        url = url.trim();

	        // Loop through url, and insert an ASCII space '%20' whenever we hit a space
	        char[] urlChars = url.toCharArray();

	        // Also create a pointer to keep track of where we are in our results array
	        int pointer = 0;

	        for (int i=0; i < urlChars.length; i++) {

	            if (urlChars[i] != ' ') {
	                result[pointer] = urlChars[i];
	                pointer++;
	            } else {
	                result[pointer] = '%';
	                result[pointer+1] = '2';
	                result[pointer+2] = '0';
	                pointer = pointer + 3;
	            }
	        }
	        int count=0;
	        for( int i=0;result[i]!='\0';i++)
	        {
	        	count++;
	        }
	        System.out.println(count);
	        	
	            for (int i1 = 0; i1 < count; i1++) 
	                System.out.println("c[" + result[i1] + "]");
		// TODO Auto-generated method stub

	

}
}


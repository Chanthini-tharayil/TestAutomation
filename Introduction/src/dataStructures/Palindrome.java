package dataStructures;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pali="abba";
		int i=0;
		int k=pali.length();
		for(int j=k-1;j>=0;j--)
		{
			
			if(pali.charAt(i)==pali.charAt(j))
			{
				//System.out.println("Palindrome");
				//return false;
			//break;
			}
			else
				//return true;
				//System.out.println("Not a palindrome");
			i++;
			
			/* Another Way
			 *  char[] content = text.toCharArray();
        int length = content.length;

        for (int i = 0; i < length / 2; i++) {
            if (content[i] != content[length - i - 1]) {
                return false;
            }
        }
        return true;
			 */
		}

	}

}

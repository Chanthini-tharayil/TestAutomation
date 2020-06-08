package dataStructures;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First METHOD
		
		String str="this";
		String str1 = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
			
		}
		System.out.println(str1);
		
		//SecondMethod
		
		char[] chars = str.toCharArray();

        // Initialize pointers
        int left;
        int right = str.length() - 1;

        // Loop through swapping left and right until we hit the middle
        for (left = 0; left < right; left++, right--) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }

	}

}

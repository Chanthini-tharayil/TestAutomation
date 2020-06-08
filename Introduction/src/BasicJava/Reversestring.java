package BasicJava;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="chanthini";
		
		int len=str.length();
		String str1="";
		for(int i=len-1;i>=0;i--)
		{
			str1+=str.charAt(i);
			
		
		}
	
		System.out.println(str1);
	}

}

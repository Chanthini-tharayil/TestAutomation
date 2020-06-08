package prepstring1;

public class printsubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch = "abcbaa"; 
		for(int i=0;i<ch.length();i++)
		{
			for(int j=i+1;j<ch.length();j++)
			{
				System.out.println(ch.substring(i,j));
			}
		}

	}

}

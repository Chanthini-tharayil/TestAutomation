package prep1;

public class substringchk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="testing";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=1;j<s.length()-i;j++)
			{
			
			System.out.println(s.substring(i, j));
			
		}

	}
	}

}

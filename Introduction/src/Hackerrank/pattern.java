package Hackerrank;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="AMAZON";
		for(int i=0;i<test.length();i++)
		{
			StringBuilder s= new StringBuilder();
			for(int j=0;j<=i;j++)
			{
				
				s.append(test.charAt(j));
				
							}
			
			System.out.println(s.toString());
		}
		for(int i=0;i<4;i++)
		{
			StringBuilder s= new StringBuilder();
			for(int j=0;j<=i;j++)
			{
				
				s.append("*");
				
				}
			
			System.out.println(s.toString());
			
		}

	}

}

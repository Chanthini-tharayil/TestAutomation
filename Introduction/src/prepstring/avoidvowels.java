package prepstring;

public class avoidvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder();
		String s1="welcome to geeksforgeeks";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||
					s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				continue;
			}
			else
				s.append(s1.charAt(i));
			
			}
		System.out.println(s.toString());
		}
	
		

	}



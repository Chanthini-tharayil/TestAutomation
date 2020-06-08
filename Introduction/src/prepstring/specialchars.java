package prepstring;

public class specialchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="#GeeKs01fOr@gEEks07";
		
				int uppercase=0,lowercase=0,numbers=0,special=0;
				for(int i=0;i<test.length();i++)
				{
				if((int)test.charAt(i)>=65 && (int)test.charAt(i)<=90)
				{
				uppercase++;
				}
				else if((int)test.charAt(i)>=97 && (int)test.charAt(i)<=122)
				{
				lowercase++;
				}
				else if((int)test.charAt(i)>=48 && (int)test.charAt(i)>=57)
					numbers++;
				else
					special++;
				}
				System.out.println(uppercase+" "+lowercase+" "+numbers+" "+special);

	}

}

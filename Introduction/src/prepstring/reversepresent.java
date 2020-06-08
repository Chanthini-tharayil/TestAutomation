package prepstring;

public class reversepresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abadad";
		String  f="";
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length()-i;j++)
			{
				f=a.substring(i, j);
				System.out.println(a.substring(i, j));
			}
		}

	}

}

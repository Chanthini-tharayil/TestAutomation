package prepstring;

public class findnumberoftimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "GeeksforGeeks";
		String b = "Gks";
		int i=0,j=0,count=0;
		while(i<a.length() )
		{
			if(a.charAt(i)==b.charAt(j))
			{
				i++;j++;
			}
			else if(a.charAt(i)!=b.charAt(j))
			{
				i++;
			}
			if(j==b.length())
			{
				j=0;
				count++;
			}
		}
		System.out.println(count);

	}

}

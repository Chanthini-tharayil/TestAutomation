package prepstring;

public class lowertoupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GeeksForGeeks";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(Character.isUpperCase(c[i]))
			{
				c[i]=Character.toLowerCase(c[i]);
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}

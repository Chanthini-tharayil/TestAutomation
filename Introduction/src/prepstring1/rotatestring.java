package prepstring1;

public class rotatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="GeeksforGeeks";
		char c[]=t.toCharArray();
		int d=2;
		for(int i=0;i<d;i++)
			rotatestring(c);
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);

	}

	private static void rotatestring(char[] c) {
		// TODO Auto-generated method stub
		char temp=' ';
		temp=c[0];
		int i=0;
		for( i=0;i<c.length-1;i++)
		{
			//temp=c[i];
			c[i]=c[i+1];		
			
			
		}
		c[i]=temp;
	}

}

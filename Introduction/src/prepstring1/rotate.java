package prepstring1;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "GeeksforGeeks";
	char[] c= s.toCharArray();
	char temp=' ';
	int i=0;temp=c[0];
	for( i=0;i<c.length-1;i++)
	{
		
		c[i]=c[i+1];
		
		
	}
	c[i]=temp;
	for(int j=0;j<c.length;j++)
		System.out.println(c[j]);
		
	    	
		
		

	}

}

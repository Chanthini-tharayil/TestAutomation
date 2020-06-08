package prepstring;

public class stringrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="GeeksforGeeks";
char temp='0';
char[] c=a.toCharArray();
int d=2,i=0;
		for(int j=0;j<d;j++)
		{
			temp=c[0];
			for( i=0;i<c.length-1;i++)
			{
				c[i]=c[i+1];
			}
			c[i]=temp;
		}
		for(int k=0;k<c.length;k++)
			System.out.println(c[k]);
		
	}

}

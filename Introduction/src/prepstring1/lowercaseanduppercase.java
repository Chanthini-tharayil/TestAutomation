package prepstring1;

public class lowercaseanduppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bAwutndekWEdkd";
StringBuilder s1= new StringBuilder();
char[] c=new char[s.length()];
int j=0;
for(int i=0;i<s.length()&&j<c.length;i++)
{
	if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	{
		c[j]=s.charAt(i);
		j+=2;
	}
}
j=1;
for(int i=0;i<s.length()&&j<c.length;i++)
{
	if(s.charAt(i)>='a' && s.charAt(i)<='z')
	{
		c[j]=s.charAt(i);
		j+=2;
	}
}

for(int i=0;i<c.length;i++)
{
	
		System.out.println(c[i]);
	
}
}
}

package prepstring1;

public class palindromechk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String t="abba";
String test="";
int l=0,r=t.length()-1;
for(int i=t.length()-1;i>=0;i--)
{
	test+=t.charAt(i);
}
if(test.equals(t))
	System.out.println("Palindrome");
int test1=0;	
	while(l<r)
	{
		if(t.charAt(l)==t.charAt(r))
						test1=1;
			else
				test1=2;
		l++;
		r--;
			
	}
	if(test1==1)
		System.out.println("palindrome");

}
}
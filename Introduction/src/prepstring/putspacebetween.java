package prepstring;

public class putspacebetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="BruceWayneIsBatman";
StringBuilder s1=new StringBuilder();
for(int i=0;i<s.length();i++)
{
	if((s.charAt(i)>='A'&&s.charAt(i)<='Z'))
	{
		s1.append(' ');
	}
	s1.append(s.charAt(i));
}
System.out.println(s1.toString());
	}

}

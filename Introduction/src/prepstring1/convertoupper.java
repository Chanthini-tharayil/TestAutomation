package prepstring1;

public class convertoupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GeeksForGeeks";
		StringBuilder s1=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
				s1.append(Character.toUpperCase(s.charAt(i)));
			else
				s1.append(s.charAt(i));
		}
		System.out.println(s1.toString());

	}

}

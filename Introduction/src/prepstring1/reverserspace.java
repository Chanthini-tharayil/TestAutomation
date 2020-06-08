package prepstring1;

public class reverserspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="abc de";
		StringBuilder s1=new StringBuilder();
		String t1="";
		for(int i=t.length()-1;i>=0;i--)
		{
			
			t1+=t.charAt(i);
			
		}
		System.out.println(t1);

	}

}

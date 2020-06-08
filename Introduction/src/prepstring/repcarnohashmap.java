package prepstring;

public class repcarnohashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcfdeacf";
		int[] k=new int[256];
		int pos=0;
		for(int i=0;i<s.length();i++)
		{
			k[s.charAt(i)]++;
		
		}
for(int i=0;i<s.length();i++)
{
	if(k[s.charAt(i)]==2)
	{
		pos=i;
		break;
	}
}
for(int i=0;i<s.length();i++)
{
	if(i==pos)
	{
		System.out.println(s.charAt(i));
	}
	
}
}

}

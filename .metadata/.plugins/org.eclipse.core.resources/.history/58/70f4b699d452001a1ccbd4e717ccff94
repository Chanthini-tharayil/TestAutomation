package crackingTheCodingInterview;

public class UniqueCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c="test";
		String f="estt";
		int [] m= new int[128];
		char[] n=c.toCharArray();
		for(char s : n)
			m[s]++;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]!=0)
		System.out.println(m[i]);

	}
		for(int i=0;i<f.length();i++)
		{
			int j= f.charAt(i);
			m[j]--;
			if(m[j]<0)
			{
				System.out.println("Not permutation");
				break;
			}
			
		}
		for(int i=0;i<m.length;i++)
		{
			if(m[i]!=0)
		System.out.println(m[i]);

	}

}
}

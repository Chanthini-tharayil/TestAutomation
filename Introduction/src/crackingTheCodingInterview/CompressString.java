package crackingTheCodingInterview;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test ="aaabbccaa";
		//MY METHOD
		String test1="";
	//	int count=0;
		//	int i=0,j=1;
	/*	while(i<test.length()&&j<test.length())
		{
		
			if(test.charAt(i)==test.charAt(j))
			{
				count++;
				j++;
			}
			else
			{
				test1+=test.charAt(i);
				test1+=count+1;
				count=0;
				i=j;
				j=i+1;
			}
			
		}
		test1+=test.charAt(i);
		test1+=count+1;
		System.out.println(test1);*/
		
		StringBuilder s=new StringBuilder();
		int count=0;
		for (int i=0;i<test.length();i++)
		{
			count++;
			if(i+1>=test.length()||test.charAt(i)!=test.charAt(i+1))
			{
				s.append(test.charAt(i));
				s.append(count);
				count=0;
			}
				
		}
		System.out.println(s.toString());
		
		
	}

}

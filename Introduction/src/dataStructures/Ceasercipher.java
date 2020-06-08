package dataStructures;

public class Ceasercipher {
	
	//Replace string with values thats in incr number plus the original character
	//for ex if word in A and incr=2 then replace A with C

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" thiy AB";
		int incr=2;
		StringBuilder st= new StringBuilder();
		for(int i=0;i<=str.length()-1;i++)
		{
			if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)
			{
				int encr=(int)str.charAt(i)+incr;
				if(encr>122)
					encr=(int)str.charAt(i)-26+incr;						
				char k=(char)encr;
				st.append(k);
				
				
			}
			else if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)
			{
				int encr=(int)str.charAt(i)+incr;
				if(encr>90)
					encr=(int)str.charAt(i)-26+incr;						
				char k=(char)encr;
				st.append(k);
			}
			else if(str.charAt(i)==' ')
				st.append(' ');
			{
				
			}
			
		}
		System.out.println(st);

	}

}

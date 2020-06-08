package prepstring;

public class maxrepeatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeekk";
		int curr_count=1,count=0;
		char k=' ';
		for(int i=0;i<s.length();i++)
		{
			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
				curr_count++;
			else 
				{
				if(curr_count>count)
				{
				count=curr_count;
				k=s.charAt(i);
				}
				curr_count=1;
				}
			
		}
		System.out.println(k);

	}

}

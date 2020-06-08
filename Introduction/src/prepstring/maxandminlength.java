package prepstring;

public class maxandminlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a test string";
		String minword="",maxword="";
		int i=0,count=0,mincount=Integer.MAX_VALUE,maxcount=Integer.MIN_VALUE,index=0,maxstart=0,minstart=0;
		while(i<s.length())
		{
			if(s.charAt(i)!=' ')
			{
				i++;
			}
			else {
				count=i-index;
			if(count<mincount)
			{
				mincount=count;
				minstart=index;
			}
			if(count>maxcount)
			{
			    maxcount=count;	
			    maxstart=index;
			}
			
			i++;
			index=i;
			}			
				
				
		}
	//	System.out.println(s.substring(minstart,mincount+minstart));
		System.out.println(mincount+ " "+maxcount);
		

	}

}

package dataStructures;

public class Oneaway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pale";
		String str1="ple";
		char[] a= str.toCharArray();
		char[] b=str1.toCharArray();
		int count=str.length();
		int count1=str1.length();
		int i=0,j=0,counter=0;
		if(count>count1)
		{
			while(i<a.length && j< b.length)
			{
				if(a[i]!=b[j])
				{
					counter++;
					i++;
				}
				else 
				{
					i++;j++;
				}
					
			}
			
		}
		if(counter==1)
			System.out.println("One Away");
		else
			System.out.println("Not one away");
		//similarly write for count<count1 in this case if a[i]!=b[j] j will increase
		

	}

}

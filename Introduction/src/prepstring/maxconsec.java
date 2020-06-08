package prepstring;

public class maxconsec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="zACaAbbaazzC";
		int i=0,j=0,max=Integer.MIN_VALUE,count=0,upper=0,lower=0;
		while(i<s.length())
		{
			//j=i;
			while(Character.isUpperCase(s.charAt(j))==false)
			{
				j++;
				count++;
				if(max<count)
					max=count;
				i=j;
			}
			//i=j;
			i++;
			count=0;
		}
			

	}

}

package prepstring1;

public class smallestnlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String t="GeeksforGeeks A computer Science portal for Geeks";
 int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
 String minstring="",maxstring="";
 String[] s=t.split(" ");
 for(int i=0;i<s.length;i++)
 {
	 if(min>s[i].length())
	 {
		 min=s[i].length();
		 minstring=s[i];
		 
	 }
     if(max<s[i].length())
     {
    	 max=s[i].length();
    	 maxstring=s[i];
     }
 }
 System.out.println(maxstring+" "+minstring);
 
	}

}

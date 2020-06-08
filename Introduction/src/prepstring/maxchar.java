package prepstring;

import java.util.Arrays;

public class maxchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="test";
   int[] k=new int[26];
   char result=' ';
   Arrays.fill(k, 0);
   int max=Integer.MIN_VALUE;
   for(int i=0;i<s.length();i++)
   {
	   k[s.charAt(i)-'a']++;
   }
   for(int i=0;i<k.length;i++)
   {
	   if(max<k[i])
	   {
		   max=k[i];
		   result=(char)(i+'a');
	   }
   }
 System.out.println(result);
	}

}

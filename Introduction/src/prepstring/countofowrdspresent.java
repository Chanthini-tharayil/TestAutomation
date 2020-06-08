package prepstring;

import java.util.HashSet;

public class countofowrdspresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = { "welcome", "to", "geeks", "portal"};		
       String str = "geeksforgeeks is a computer science portal for geeks";
       String[] s=str.split(" ");
     HashSet<String> m= new HashSet<String>();
     for(int i=0;i<s.length;i++)
     {
    	 m.add(s[i]);
     }
     int count=0;
     for(int i=0;i<words.length;i++)
     {
    	 if(m.contains(words[i]))
    		 count++;
     }
     System.out.println(count);

	}

}

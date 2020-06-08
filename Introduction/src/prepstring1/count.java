package prepstring1;

import java.util.HashSet;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = { "welcome", "to", "geeks", "portal"};
        String str = "geeksforgeeks is a computer science portal for geeks";
        String[] s=str.split(" ");
        HashSet<String> m= new HashSet<String>();
        for(int i=0;i<words.length;i++)
        	m.add(words[i]);
        for(int i=0;i<s.length;i++)
        {
        	if(m.contains(s[i]))
        		System.out.println(s[i]);
        }
		

	}

}

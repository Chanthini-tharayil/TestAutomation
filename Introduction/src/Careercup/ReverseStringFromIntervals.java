package Careercup;

public class ReverseStringFromIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Reverse on space
		String s[] = "i like this program very much".split(" "); 
		String ans = ""; 
        String ans1 = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            ans += s[i] + " "; 
        } 
        System.out.println("Reversed String:"); 
        System.out.println(ans); 
	
	//reverse on index
        
	String s1="testin";
	String s2="";
	char[] c=s1.toCharArray();
	int i=0,j=0;
	
	while(i<=c.length && i+3 <=c.length)
	{
		j=i+2;
		while(j>=i)
		{
			s2+=c[j];
			j--;
		}
		i=i+3;
	}
	System.out.println(s2);
	//reverse on index
	
	
	
}}
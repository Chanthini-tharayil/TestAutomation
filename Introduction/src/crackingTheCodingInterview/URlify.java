package crackingTheCodingInterview;

public class URlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="My H";
   StringBuilder m=new StringBuilder();
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)==' ')
    	 {
    		 m.append("%20");
    		 
    	 }
    	 else
    	 {
    		 m.append(s.charAt(i));
    	 }
     }
     System.out.println(m.toString());
	}

}

package prep1;

import java.util.PriorityQueue;

public class kpairswithsmallesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {1, 7, 11};
	      int  a2[] = {2, 4, 6};
	     int  k = 3,count=0;
	     PriorityQueue<Integer> m=new PriorityQueue<Integer>();
	     PriorityQueue<Integer> n=new PriorityQueue<Integer>();
	     for(int i=0;i<a1.length;i++)
	    	 m.add(a1[i]);
	     for(int i=0;i<a2.length;i++)
	    	 n.add(a2[i]);
	     while(m.isEmpty()==false && n.isEmpty()==false && count<=k )
	     {
	    	 if(m.peek()>n.peek())
	    	 {
	    		 System.out.println(m.poll()+" "+n.peek());
	    		 count++;
	    	 }
	    	 else
	    		 System.out.println(n.poll()+" "+m.peek());
	    	 count++;
	     }
	     
	     

	}

}
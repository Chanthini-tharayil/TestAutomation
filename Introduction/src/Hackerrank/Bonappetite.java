package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Bonappetite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> bill=new ArrayList<Integer>();
		bill.add(3);bill.add(10);bill.add(2);bill.add(9);
		String a="4 1";		
		String[] m=a.split(" ");
		int b=12;
		int d=41%10;
		System.out.println(d);
		int k= Integer.parseInt(m[1]);
		int sum=0;
        for(int i=0;i<bill.size();i++)
        {
           if(i!=k)
           {
               sum+=bill.get(i);
           }
            }
            if((sum/2)==b)
            {
                System.out.println("Bon Appetit");
            }
            else
            {
                System.out.println(b-(sum/2));
            }

	}

}

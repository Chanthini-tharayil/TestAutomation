package dataStructures;

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abc";
		String srtg= "bca";
		Boolean check=false;
		char[] t= str.toCharArray();
		char[] y= srtg.toCharArray();
		Arrays.sort(t);
		Arrays.sort(y);
		for(int i=0;i<str.length();i++)
		{
			if(t[i]!=y [i])
			break;
			else 
				check = true;
		}
		if (check==true)
			System.out.println("Permutation combination");
		else
			System.out.println("Non permutation");
		

	}

}

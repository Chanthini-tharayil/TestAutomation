package dataStructures;
import java.util.*;

public class Uniquecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "abc";
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;				
					break;
			}
		}

	}
		if(count>0)
			System.out.println("Contains non unique chacaters");
		else
			System.out.println("No unique characters");

}
}

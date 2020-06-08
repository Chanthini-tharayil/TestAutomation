package dataStructures;

import java.util.Stack;

import dataStructures.Linkedlist.Node;

public class reversesumlinkedlist {
	 /********************************************
	  * THis program has two componets:
	  * Reversing number using stack
	  * Reverse two numbers and find its sum using stack
	  * 
	  ********************************************************/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack first = new Stack();
		 first.push(2);
		 first.push(3);
		 first.push(4);
		 
		 int num=0;
		 StringBuilder sb = new StringBuilder();
		 while(!first.isEmpty())
		 {
			 
			  num= (int) first.pop();
			  sb.append(num);
			 
			 
		 }
		 int result = Integer.parseInt(sb.toString());
				 System.out.println("First:"+result);
		
				 Stack first1 = new Stack();
				 first1.push(8);
				 first1.push(6);
				 first1.push(5);
				 
				 int num1=0;
				 StringBuilder sb1 = new StringBuilder();
				 while(!first1.isEmpty())
				 {
					 
					  num1= (int) first1.pop();
					  sb1.append(num1);
					 
					 
				 }
				 int result1 = Integer.parseInt(sb1.toString());
				 System.out.println("Second:"+result1);
				 int num2=result+result1;
				 System.out.println("Sum is:"+num2);
	}

}

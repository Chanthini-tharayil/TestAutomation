package dataStructures;

import java.util.Stack;

public class Minfromstack {
	
	 static class Node {

	         int data;
	         int min; // track here
	         Node next;

	         Node (int data, int min) {
	            this.data = data;
	            this.min = min;
	        }
	    }
    static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(0);
		push(3);
		push(1);
		push(7);
		 System.out.println("min:"+head.min);
	
	}
	
	public static void push(int data)
	{
		int min=data;
		  
	        if(head!=null)
	        {
	        	min =Math.min(data,head.min);
	        }
	        	 Node newNode = new Node(data, min);
	             newNode.next = head;
	             head = newNode;
	        
	       
	}
	

}

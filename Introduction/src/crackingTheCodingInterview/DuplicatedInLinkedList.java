	package crackingTheCodingInterview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


import dataStructures.Loopinlinkedlist.Node;

public class DuplicatedInLinkedList {


	 static class Node {
	        int data;
	        Node next;

	         Node(int d) {
	            data = d;
	            next=null;
	        }
	    }
	  
	  static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Node newNode = new Node(20);
		   Node secNode = new Node(20);
		   Node FourNode = new Node(80);
    	   Node thirdNode = new Node(40);
    	   Node fourthNode = new Node(40);
    	   //****************************

      // Printing Linkedlist values
    	   //********************************
           if (head == null) {
               head = newNode;
               System.out.println("in this box");
               
           }
           else
           {
        	   newNode.next=head;
        	   head=newNode;
           }
           head.next=secNode;
           secNode.next=FourNode;
           FourNode.next=thirdNode;
           thirdNode.next=fourthNode;
           
           Node current=head;
           System.out.println("Printing first list:");
           while(current!=null)
           {
            System.out.println(current.data);
            current=current.next;
           }
           
           HashSet<Integer> s =new HashSet();
           Node h=head;
           Node Previous=null;
           Node Remove=null;
           while(h!=null)
           {
        	   if(s.contains(h.data))
        	   {
        		  Previous.next=h.next;
        		//  Remove=h.next;
        		  h=Previous;
        		//  h.next=Remove;
        	   }
        	   else
        	   {
        	          	   s.add(h.data);
        	          	   Previous=h;
        	   }
        	   h=h.next;
           }
           
           System.out.println("After Removing dups-Hashset printing:");
           Iterator<Integer> i = s.iterator(); 
           while(i.hasNext())
           {
        	   System.out.println(i.next());
           }
           System.out.println("Removing from original linkedlist only");
           Node d=head;
           while(d!=null)
           {
        	   System.out.println(d.data);
        	   d=d.next;
           }
         
	}

}

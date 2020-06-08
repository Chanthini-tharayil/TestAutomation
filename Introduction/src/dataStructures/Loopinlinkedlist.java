package dataStructures;

import java.util.HashSet;
import java.util.LinkedList;

//import java.util.LinkedList;

import dataStructures.Linkedlist.Node;

public class Loopinlinkedlist {
	
 // head of list 
	  
    /* Linked list Node*/
   public static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    static Node head;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Node newNode = new Node(20);
    	   Node secNode = new Node(30);
    	   Node thirdNode = new Node(40);
    	   Node fourthNode = new Node(50);
    	   if (head == null) {
               head = newNode;
               System.out.println("in this box");
               
           }
           else
           {
        	   head.next=newNode;
           }
           newNode.next=secNode;
           secNode.next=thirdNode;
           thirdNode.next=fourthNode;
           fourthNode.next=secNode;
           Node slow_p = head, fast_p = head; 
           while (slow_p != null && fast_p != null && fast_p.next != null) { 
               slow_p = slow_p.next; 
               fast_p = fast_p.next.next; 
               if (slow_p == fast_p) { 
                   System.out.println("Found loop"); 
		           break;
		
		
               }
                             
           } 
           /*************************************************
            * Using hashset
            * *************************************************
            */
           
           LinkedList llist = new LinkedList(); 
           
           llist.push(20); 
           llist.push(4); 
           llist.push(15); 
           llist.push(10); 
     //     llist.addLast(head);
     
           /*Create loop for testing */
     //  head=(Node) llist.getFirst()  	   ;
       Node h=head;
       HashSet<Node> s = new HashSet<Node>(); 
       while (h != null) { 
           // If we have already has this node 
           // in hashmap it means their is a cycle 
           // (Because you we encountering the 
           // node second time). 
           if (s.contains(h))
           {
             System.out.println("Found");
             break;
           }
 
           // If we are seeing the node for 
           // the first time, insert it in hash 
           s.add(h); 
 
           h = h.next; 
       } 
}
}



package dataStructures;
public class Linkedlist {

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
    	  
    	   Node newNode = new Node(20);
    	   Node secNode = new Node(30);
    	   Node thirdNode = new Node(40);
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
           secNode.next=thirdNode;
           
           

           // Set it's next to current head
          Node current=head;
          System.out.println("Printing first list:");
          while(current!=null)
          {
           System.out.println(current.data);
           current=current.next;
          }
          //***********************************************

         //adding to the first(head) of linkedlist
          //***********************************************
          
          Node addFirst= new Node(50);
          if (head == null) {
              head = addFirst;
              System.out.println("in this box");
              
          }
          else
          {
       	  addFirst.next=head;
       	  head=addFirst;
          }
          Node current1=head;
          System.out.println("printing after adding to first:");
          while(current1!=null)
          {
           System.out.println(current1.data);
           current1=current1.next;
          }
    	
    	/***********************************************
    	 Adding to the last of linkedlist
    	 *********************************************
    	 */
          Node addLast= new Node(60);
          if (head == null) {
              head = addLast;
              System.out.println("in this box");
              
          }
          Node current2=head;
         
          while(current2.next!=null)
          {
          
           current2=current2.next;
          }
          current2.next=addLast;
          
          Node current3=head;
          System.out.println("printing after adding to last:");
          while(current3!=null)
          {
          System.out.println(current3.data);
           current3=current3.next;
          }
          
          /**********************************************
           * Finding Size of linked list
           * 
           * *****************************************
           */
          
          current3=head;
          int count=0;
          while(current3!=null)
          {
        	  current3=current3.next;
        	  count++;
          }
          System.out.println("Size of linked List is :"+count);
          
          /**************************************************
           * Delete data from linked list
           * ....................................v
           */
          
          int delData=20;
          current3=head;
         if(head.data==delData)
         {
        	 head=head.next;
         }
         else
         {
        	 while(current3!=null)
        	 {
        		 if(current3.next.data==delData)
        		 {
        			 current3.next=current3.next.next;
        			 break;
        		 }
        		 current3=current3.next;
        	 }
         }
         current3=head;
         System.out.println("Linkedlist after deleting:");
         while(current3!=null)
         {
        	 System.out.println(current3.data);
        	 current3=current3.next;
         }
         
         /********************************
          * Clearing linkedlist
          * Just have to set head to null -- this will clear linked list
          * ***************************
          */
         head=null;
        	 
    }
	

}

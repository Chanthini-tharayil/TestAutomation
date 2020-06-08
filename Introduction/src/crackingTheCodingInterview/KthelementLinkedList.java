package crackingTheCodingInterview;

public class KthelementLinkedList {
	

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
  	   Node secNode = new Node(30);
  	   Node thirdNode = new Node(40);
  	  Node FourNode = new Node(50);

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
         thirdNode.next=FourNode;
         
         Node current=head;
         System.out.println("Printing first list:");
         while(current!=null)
         {
          System.out.println(current.data);
          current=current.next;
         }
         int k=2;
         int count=1;
         Node h=head;
         while(h!=null)
         {
        	 if(count==k)
        	 {
        		 System.out.println("Kthelement"+h.data);
        	 }
        	 h=h.next;
        	 count++;
         }
      
      
	}

}

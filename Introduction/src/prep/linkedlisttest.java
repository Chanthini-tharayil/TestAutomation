package prep;

public class linkedlisttest {

	public static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first= new Node(10);
		Node second = new Node(20);
		Node third=new Node(30);
		Node fourth = new Node(40);
		if(head==null)
			head=first;
		else
		{
			first.next=head;
			head=first;
		}
		first.next=second;
		second.next=third;
		third.next=fourth;
		
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		

	}

}

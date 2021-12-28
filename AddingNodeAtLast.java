class Linkedlist
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			this.next = null;
		}
	}
	public static void main(String[] args)
	{
		Linkedlist ll = new Linkedlist();
		ll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		ll.Insertfirst();
		ll.InsertLast();
		ll.printlist();
		
	}
	public void printlist()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data + "->");
			n = n.next;
		}
	}
	public void Insertfirst()
	{
		Linkedlist ll = new Linkedlist();
		Node firstNode = new Node(5);
		firstNode.next = head;
		head  = firstNode;
	}
	public void InsertLast()
	{
		Linkedlist ll = new Linkedlist();
		Node lastNode = new Node(45);
		if(head == null)
		{
			head = lastNode;
			return;
		}
		lastNode.next = null;
		Node start = head;
		while(start.next!= null)
		{
			start = start.next;
		}
		start.next = lastNode;
	}
}


//Output : 5->10->20->30->40->45->

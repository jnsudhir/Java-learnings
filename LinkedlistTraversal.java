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
		Node second  = new Node(20);
	    Node third = new Node(30);
		Node fourth = new Node(40);
		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		ll.printlist();
	}
	public void printlist()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " -->");
			n = n.next;
		}
	}
}



//Output : 10 -->20 -->30 -->40 -->

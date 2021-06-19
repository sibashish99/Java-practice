// introduce a linked list
class LinkedList {
	Node head; 
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		} 
	}
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

	public static void main(String[] args){
		LinkedList llist = new LinkedList();

		llist.head = new Node(1);  //insert in ll
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second; 
		second.next = third; 
        
        llist.printList(); //traverse ll

        

	}
}

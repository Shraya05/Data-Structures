class Node{
	int data;
    Node next; 
    Node(int data) {
        this.data = data;
        this.next = null;
	}
}
public class LinkedList {
Node head; 
    LinkedList() {
        this.head = null; 
    }
    public void insertAtBeginning(int data) {
        Node newnode = new Node(data); 
        newnode.next = head; 
        head = newnode; 
    }
public void insertAtEnd(int data)
{
	   Node newnode = new Node(data);
       if (head == null) {
           head = newnode; 
           return;
       }
       Node curr = head;
       while (curr.next != null) {
           curr = curr.next;
       }
       curr.next = newnode;
}
public void insertAtposition(int data,int pos)
{
	Node curr=head;
	Node newnode = new Node(data);
	int index=0;
	if(pos<0)
	{
		System.out.print("Invalid position");
	}
	 if (pos == 0) {
         insertAtBeginning(data);
         return;
     }
	 while (curr != null && index < pos - 1) {
         curr = curr.next;
         index++;
     }
	 if (curr == null) {
         System.out.println("Position out of bounds. Adding at the end.");
         insertAtEnd(data);
         return;
     }
     newnode.next = curr.next;
     curr.next = newnode;
}
public void print()
{
	Node curr = head;
    if (curr == null) {
        System.out.println("The list is empty.");
        return;
    }
    while (curr != null) {
        System.out.print(curr.data);
        if (curr.next != null) {
            System.out.print(" -> ");
        }
        curr = curr.next;
    }
    System.out.println();
}
}

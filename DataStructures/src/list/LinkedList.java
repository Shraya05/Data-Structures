package list;

class Node {
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
	    public void insertAtEnd(int data) {
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
	    public void insertAtPosition(int data, int pos) {
	        if (pos < 0) {
	            System.out.println("Invalid position!");
	            return;
	        }

	        Node newnode = new Node(data);

	        if (pos == 0) {
	            insertAtBeginning(data);
	            return;
	        }

	        Node curr = head;
	        int index = 0;
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

	    public void print() {
	        Node curr = head;
	        if (curr == null) {
	            System.out.println("The list is empty.");
	            return;
	        }
	        while (curr != null) {
	            System.out.print(curr.data);
	            if (curr.next != null) {
	                System.out.print(" -> "); // Separator for readability
	            }
	            curr = curr.next;
	        }
	        System.out.println();
}
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();

	        // Insert at the beginning
	        list.insertAtBeginning(10);
	        list.insertAtBeginning(20);
	        list.print(); // Output: 20 -> 10

	        // Insert at the end
	        list.insertAtEnd(30);
	        list.print(); // Output: 20 -> 10 -> 30

	        // Insert at a specific position
	        list.insertAtPosition(25, 2); // Insert 25 at index 2
	        list.print(); // Output: 20 -> 10 -> 25 -> 30

	        // Insert at an invalid position
	        list.insertAtPosition(40, 10); // Position out of bounds, appends to end
	        list.print(); // Output: 20 -> 10 -> 25 -> 30 -> 40

	        // Insert at position 3
	        list.insertAtPosition(5, 3);
	        list.print(); // Output: 5 -> 20 -> 10 -> 25 -> 30 -> 40
    }
}

package Implementation_of_Single_Linked_List;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to add a node at the end of the list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Method to add a node at the beginning of the list
    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // Method to delete a node by value
    public void deleteWithValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) return;

        current.next = current.next.next;
    }

    // Method to find a node by value
    public Node find(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        return current;
    }

    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

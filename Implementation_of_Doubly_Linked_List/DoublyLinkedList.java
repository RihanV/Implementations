package Implementation_of_Doubly_Linked_List;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
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
        Node newNode = new Node(data);
        current.next = newNode;
        newNode.prev = current;
    }

    // Method to add a node at the beginning of the list
    public void prepend(int data) {
        Node newHead = new Node(data);
        if (head != null) {
            head.prev = newHead;
            newHead.next = head;
        }
        head = newHead;
    }

    // Method to delete a node by value
    public void deleteWithValue(int data) {
        if (head == null) return;

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) return;

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    // Method to find a node by value
    public Node find(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        return current;
    }

    // Method to display the list from head to tail
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to display the list from tail to head
    public void displayBackward() {
        if (head == null) return;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    
}


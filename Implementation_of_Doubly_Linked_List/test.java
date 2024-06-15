package Implementation_of_Doubly_Linked_List;

public class test {
	public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.prepend(0);
        list.displayForward(); // Output: 0 <-> 1 <-> 2 <-> 3 <-> null

        list.deleteWithValue(2);
        list.displayForward(); // Output: 0 <-> 1 <-> 3 <-> null

        Node found = list.find(3);
        System.out.println(found != null ? "Found: " + found.data : "Not Found"); // Output: Found: 3

        list.displayBackward(); // Output: 3 <-> 1 <-> 0 <-> null
    }

}

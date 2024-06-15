package Implementation_of_Single_Linked_List;

public class test {
	public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.prepend(0);
        list.display(); // Output: 0 -> 1 -> 2 -> 3 -> null

        list.deleteWithValue(2);
        list.display(); // Output: 0 -> 1 -> 3 -> null

        Node found = list.find(3);
        System.out.println(found != null ? "Found: " + found.data : "Not Found"); // Output: Found: 3
    }

}

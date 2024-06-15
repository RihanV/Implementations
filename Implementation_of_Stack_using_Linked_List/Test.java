package Implementation_of_Stack_using_Linked_List;

public class Test {
	 public static void main(String[] args) {
	        Stack stack = new Stack();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.display(); // Output: 3 -> 2 -> 1 -> null

	        System.out.println("Top element is: " + stack.peek()); // Output: Top element is: 3

	        System.out.println("Popped element is: " + stack.pop()); // Output: Popped element is: 3
	        stack.display(); // Output: 2 -> 1 -> null

	        System.out.println("Stack is empty: " + stack.isEmpty()); // Output: Stack is empty: false

	        stack.pop();
	        stack.pop();
	        System.out.println("Stack is empty: " + stack.isEmpty()); // Output: Stack is empty: true
	    }

}

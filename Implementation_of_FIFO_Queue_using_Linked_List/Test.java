package Implementation_of_FIFO_Queue_using_Linked_List;

public class Test {
	public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display(); // Output: 1 -> 2 -> 3 -> null

        System.out.println("Front element is: " + queue.peek()); // Output: Front element is: 1

        System.out.println("Dequeued element is: " + queue.dequeue()); // Output: Dequeued element is: 1
        queue.display(); // Output: 2 -> 3 -> null

        System.out.println("Queue is empty: " + queue.isEmpty()); // Output: Queue is empty: false

        queue.dequeue();
        queue.dequeue();
        System.out.println("Queue is empty: " + queue.isEmpty()); // Output: Queue is empty: true
    }

}

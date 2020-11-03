package BasicW4Q7;

public class BasicW4Q7 {

    public static void main(String[] args) {
        Queue queue = new LinkedQueue();
        queue.enqueue("Alex");
        queue.enqueue("Sandy");
        queue.enqueue("Betty");
        System.out.println(queue.Queue());
        System.out.println(queue.front());
        System.out.println(queue.size());
        System.out.println(queue.empty());
        System.out.println("Removed: " + queue.dequeue());
        System.out.println(queue.Queue());
    }
}

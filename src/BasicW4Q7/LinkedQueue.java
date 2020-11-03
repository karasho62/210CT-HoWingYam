package BasicW4Q7;

public class LinkedQueue implements Queue {

    private LinkedList qll;
    private int size = 0;

    public LinkedQueue() {
        qll = new LinkedList();
    }

    public int size() {
        return size;
    }
    public String Queue(){
        return qll.get();
    }
    public boolean empty() {
        return qll.isEmpty();
    }

    public void enqueue(Object item) throws QueueFullException {
        qll.addToTail(item);
    }

    public Object dequeue() throws QueueEmptyException {
        try {
            Object item = qll.removeFromHead();
            return item;
        } catch (EmptyListException e) {
            throw new QueueEmptyException();
        }

    }

    public Object front() throws QueueEmptyException {
        try {
            Object item = qll.removeFromHead();
            qll.addToHead(item);
            return item;
        } catch (EmptyListException e) {
            throw new QueueEmptyException();
        }
    }
}

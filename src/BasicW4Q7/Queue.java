package BasicW4Q7;

public interface Queue {

    public abstract boolean empty();

    public abstract int size();

    public abstract Object front() throws QueueEmptyException;

    public abstract void enqueue(Object item) throws QueueFullException;

    public abstract Object dequeue() throws QueueEmptyException;

    public abstract String Queue() throws QueueEmptyException;
}

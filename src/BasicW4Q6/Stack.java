package BasicW4Q6;

public interface Stack {

    public abstract int size();

    public abstract boolean empty();

    public abstract void push(Object item) throws StackFullException;

    public abstract Object pop() throws StackEmptyException;

    public abstract Object peek() throws StackEmptyException;

    public abstract int search(String item) throws StackEmptyException;
}

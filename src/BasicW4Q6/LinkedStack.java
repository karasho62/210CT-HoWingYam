package BasicW4Q6;

public class LinkedStack implements Stack {

    private LinkedList sll;
    private int size = 0;
    private Object peekItem;

    public LinkedStack() {
        sll = new LinkedList();
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return sll.isEmpty();
    }

    public void push(Object item) throws StackFullException {
        sll.addToHead(item);
        size++;
        peekItem = item;
    }

    public Object pop() throws StackEmptyException {
        try {
            Object item = sll.removeFromHead();
            size--;
            return item;
        } catch (EmptyListException e) {
            throw new StackEmptyException();
        }
    }

    public Object peek() throws StackEmptyException {
        try {
            Object item = sll.removeFromHead();
            sll.addToHead(item);
            return item;
        } catch (EmptyListException e) {
            throw new StackEmptyException();
        }
    }
    
    public int search(String item) throws StackEmptyException{
        int position=0;
        position=sll.get(item);
        return position;
    }
}

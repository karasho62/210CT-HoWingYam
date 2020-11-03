package BasicW4Q7;

public class LinkedList {

    private ListNode head;
    private ListNode tail;
    private int size = 0;

    public LinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(Object item) {
        if (isEmpty()) {
            head = tail = new ListNode(item);
        } else {
            head = new ListNode(item, head);
        }
        size++;
    }

    public void addToTail(Object item) {
        if (isEmpty()) {
            head = tail = new ListNode(item);
        } else {
            tail.setNext(new ListNode(item));
            tail = tail.getNext();
        }
        size++;
    }

    public Object removeFromHead() throws EmptyListException {
        Object item = null;
        if (isEmpty()) {
            throw new EmptyListException();
        }
        item = head.getData();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.getNext();
        }
        size--;
        return item;
    }

    public String toString() {
        String s = "1[ ";
        ListNode current = head;
        while (current != null) {
            s += current.getData() + " ";
            current = current.getNext();
        }
        return s + "]2";
    }

    public int size() {
        return size;
    }

    public String get() {
        String rValue = "";
        ListNode current = head;
        for (int i = 1; i <= size; i++) {
            rValue += "["+current.data+"]";
            current = current.next;
        }
        return rValue;
    }
}

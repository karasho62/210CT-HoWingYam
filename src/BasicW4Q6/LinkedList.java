package BasicW4Q6;

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

    public Object removeFromHead() throws EmptyListException {
        Object item = null;
        if (isEmpty()) {
            throw new EmptyListException();
        }
        item = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
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

    public int get(String n) {
        int rValue = 0;
        ListNode current = head;
        for (int i = 1; i <= size; i++) {
            if (current.data == n) {
                rValue = i;
                return rValue;
            } else if (current.getData() != n) {
                current = current.getNext();
            }
        }
        return rValue;
    }
}

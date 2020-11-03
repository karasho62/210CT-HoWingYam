package BasicW4Q7;

public class ListNode {

    protected Object data;
    protected ListNode next;

    public ListNode(Object o) {
        data = o;
        next = null;
    }

    public ListNode(Object o, ListNode nextNode) {
        data = o;
        next = nextNode;
    }

    public Object getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setData(Object o) {
        data = o;
    }

}

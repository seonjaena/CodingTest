public class SjLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if(head == null) {
            head = node;
        }
        if(tail == null) {
            tail = node;
        }
        Node<T> tailNode = tail;
        tailNode.next(node);
        tail = node;
        node.prev(tailNode);
    }

    public void printAll() {
        if(head == null) {
            return;
        }
        Node<T> node = head;
        System.out.println(node.data());
        while(node.next() != null) {
            node = node.next();
            System.out.println(node.data());
        }
    }

}

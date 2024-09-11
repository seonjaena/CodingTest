public class SjLinkedList<T> {

    Node<T> head = null;

    public void addNode(T data) {
        if(head == null) {
            head = new Node<>(data);
        }else {
            Node<T> node = this.head;
            while(node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new Node<>(data));
        }
    }

    public void addNodeInside(T data, T baseData) {
        Node<T> baseNode = searchNode(baseData);
        if(baseNode == null) {
            addNode(data);
        }else {
            Node<T> newNode = new Node<>(data);
            newNode.setNext(baseNode.getNext());
            baseNode.setNext(newNode);
        }
    }

    public boolean deleteNode(T data) {
        Node<T> node = head;

        if(node == null) {
            return false;
        }

        while(node.getNext() != null) {
            if(node.getNext().getData().equals(data)) {
                node.setNext(node.getNext().getNext());
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    private Node<T> searchNode(T data) {
        if(head == null) {
            return null;
        }
        Node<T> node = head;
        while(node.getNext() != null) {
            if(node.getData().equals(data)) {
                return node;
            }else {
                node = node.getNext();
            }
        }
        return null;
    }

    public void printAll() {
        if(head != null) {
            Node<T> node = this.head;
            System.out.println(node.getData());
            while(node.getNext() != null) {
                node = node.getNext();
                System.out.println(node.getData());
            }
        }
    }

}

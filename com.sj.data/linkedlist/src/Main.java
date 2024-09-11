public class Main {
    public static void main(String[] args) {
        SjLinkedList<Integer> linkedList = new SjLinkedList<>();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.printAll();
        System.out.println("=========================================");
        linkedList.addNodeInside(-100, 100);
        linkedList.addNodeInside(-4, 4);
        linkedList.addNodeInside(-101, 0);
        linkedList.addNodeInside(-1, 1);
        linkedList.printAll();
        System.out.println("=========================================");
        linkedList.deleteNode(-1);
        linkedList.deleteNode(-4);
        linkedList.deleteNode(-100);
        if(linkedList.deleteNode(1000)) {
            System.out.println("데이터 1,000이 잘 지워졌씁니다.");
        }else {
            System.out.println("데이터 1,000이 지워지지 않았습니다.");
        }
        linkedList.printAll();
    }
}
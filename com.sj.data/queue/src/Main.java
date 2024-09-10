public class Main {
    public static void main(String[] args) {
        SjQueue<Integer> queue = new SjQueue<>();
        System.out.println("initial size: " + queue.size());
        System.out.println("value: " + queue.dequeue());
        queue.enqueue(1);
        System.out.println("offer result: " + queue.offer(2));
        queue.enqueue(3);
        System.out.println("offer result: " + queue.offer(4));
        System.out.println("size: " + queue.size());
        System.out.println("value1 : " + queue.dequeue());
        System.out.println("size: " + queue.size());
        System.out.println("value2 : " + queue.dequeue());
        System.out.println("size: " + queue.size());
        System.out.println("value3 : " + queue.dequeue());
        System.out.println("size: " + queue.size());
        System.out.println("value4 : " + queue.dequeue());
        System.out.println("size: " + queue.size());
        System.out.println("value5 : " + queue.dequeue());
    }
}
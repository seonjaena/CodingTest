public class Main {
    public static void main(String[] args) {
        SjStack<Integer> stack = new SjStack<>();
        System.out.println("initial size: " + stack.size());
        System.out.println("value: " + stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("size: " + stack.size());
        System.out.println("value1 : " + stack.pop());
        System.out.println("size: " + stack.size());
        System.out.println("value2 : " + stack.pop());
        System.out.println("size: " + stack.size());
        System.out.println("value3 : " + stack.pop());
        System.out.println("size: " + stack.size());
        System.out.println("value4 : " + stack.pop());
    }
}
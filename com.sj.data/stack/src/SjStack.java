import java.util.ArrayList;
import java.util.List;

public class SjStack<T> {

    private List<T> stack = new ArrayList<>();

    public void push(T t) {
        stack.add(t);
    }

    public T pop() {
        if(stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

}

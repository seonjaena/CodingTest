import java.util.ArrayList;
import java.util.List;

public class SjQueue<T> {

    private List<T> queue = new ArrayList<>();

    public boolean offer(T t) {
        int beforeSize = queue.size();
        try {
            enqueue(t);
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        int afterSize = queue.size();
        return beforeSize + 1 == afterSize;
    }

    public void enqueue(T t) {
        queue.add(t);
    }

    public T dequeue() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}

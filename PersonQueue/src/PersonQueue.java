import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Admin on 11/6/2016.
 */
public class PersonQueue {
    public PersonQueue(){
        names = new Object[20];
    }

    public PersonQueue(int capacity) {
        names = new Object[capacity];
    }

    public void enqueue(Object name) {
        if (size == names.length)throw new IllegalStateException("Cannot add to full queue");
        names[tail] = name;
        tail = (tail + 1) % names.length;
        size++;
    }
    public Object dequeue() {
        if (size == 0) throw new NoSuchElementException("Cannot remove from empty queue");
        Object item = names[head];
        names[head] = null;
        head = (head + 1) % names.length;
        size--;
        return item ;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString(){
        return Arrays.toString(names);
    }


    private Object[] names;
    private static int size, head, tail = 0;

}
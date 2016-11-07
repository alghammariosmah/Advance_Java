import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Admin on 11/6/2016.
 */
public class PersonQueue {
    public PersonQueue(){
        items = new Object[20];
    }

    public PersonQueue(int capacity) {
        items = new Object[capacity];
    }

    public void enqueue(Object name) {
        if (size == items.length)throw new IllegalStateException("Cannot add to full queue");
        items[tail] = name;
        tail = (tail + 1) % items.length;
        size++;
    }
    public Object dequeue() {
        if (size == 0) throw new NoSuchElementException("Cannot remove from empty queue");
        Object item = items[head];
        items[head] = null;
        head = (head + 1) % items.length;
        size--;
        return item ;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString(){
        return Arrays.toString(items);
    }


    public Object[] items;
    private static int size, head, tail = 0;

}
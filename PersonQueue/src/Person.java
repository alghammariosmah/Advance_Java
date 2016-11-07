import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Admin on 11/6/2016.
 */
public class Person {
    public Person(){
        multi = new Object[20][20];
    }

    public Person(int capacity) {
        multi = new Object[capacity][2];
    }

    public void enqueue(Object name, Object address) {
        if (size == multi.length)throw new IllegalStateException("Cannot add to full queue");
        int index1 = 1;
        int index0 = 0;
        multi[tail][index0] = name;
        multi[tail][index1]=address;
        tail = (tail + 1) % multi.length;
        size++;
    }
    public Object dequeue() {
        if (size == 0) throw new NoSuchElementException("Cannot remove from empty queue");
        int index1 = 1;
        int index0 = 0;
        Object item = multi[head][index0];
        multi[head][index0] = null;
        Object address = multi[head][index1];
        multi[head][index1] = null;
        head = (head + 1) % multi.length;
        size--;
        return item + " " + address;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString(){
        return Arrays.deepToString(multi);
    }

    private Object[][] multi;
    private static int size, head, tail;

}

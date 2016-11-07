import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Admin on 11/6/2016.
 */
public class Person {
    public Person(){
        names = new Object[20];
    }

    public Person(int capacity) {
        names = new Object[capacity];
        addresses = new Object[capacity];
    }

    public void enqueue(Object name, Object address) {
        if (size == names.length)throw new IllegalStateException("Cannot add to full queue");
        names[tail] = name;
        addresses[tail] = address;
        tail = (tail + 1) % names.length;
        size++;
    }
    public Object dequeue() {
        if (size == 0) throw new NoSuchElementException("Cannot remove from empty queue");
        Object item = names[head];
        names[head] = null;
        Object address = addresses[head];
        addresses[head] = null;
        head = (head + 1) % names.length;
        size--;
        Object finalresult = item+" "+address;
        return finalresult;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString(){
        System.out.println(Arrays.toString(addresses));
        return Arrays.toString(names);
    }


    private Object[] names, addresses;
    private static int size, head, tail = 0;


}

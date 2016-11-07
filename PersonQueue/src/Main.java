import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Admin on 11/7/2016.
 */
public class Main {
    public Main(){
        addresses = new Object[20];
    }

    public Main(int capacity) {
        addresses = new Object[capacity];
    }

    public void addressEnqueue(Object address) {
        if (size == addresses.length)throw new IllegalStateException("Cannot add to full queue");
        addresses[tail] = address;
        tail = (tail + 1) % addresses.length;
        size++;
    }
    public Object addressDequeue() {
        if (size == 0) throw new NoSuchElementException("Cannot remove from empty queue");
        Object address = addresses[head];
        addresses[head] = null;
        head = (head + 1) % addresses.length;
        size--;
        return address;
    }

    public boolean isAddressEmpty() {
        return size == 0;
    }

    public String toString(){
        return Arrays.toString(addresses);
    }

    private Object[]  addresses;
    private static int size, head, tail = 0;
}

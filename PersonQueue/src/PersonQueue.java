import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * This method returns an Object array for persons and their addresses. 
 * The capacity argument must specify an Object array length. 
 * @author Alghammari
 *
 */
public class PersonQueue {
	/**
	 * This is a constructor for the Queue which auto-sets the queue to 20.
	 */
    public PersonQueue(){
        items = new Object[20];
    }
    
    /**
     * The user has to input the capacity of the Object array.
     * @param capacity
     */
    public PersonQueue(int capacity) {
        items = new Object[capacity];
    }
    /**
     * Adding the given name along with address to the rear of the queue.
     * @exception IllegalStateException if the queue is full.
     * @param name
     */
    public void enqueue(Object name) {
        if (size == items.length)throw new IllegalStateException("Cannot add to full queue");
        items[tail] = name;
        tail = (tail + 1) % items.length;
        size++;
    }
    
    /**
     * Removes the front name and address from the queue and returns them.
     * @exception NoSuchElementException if the queue is empty.
     * @return iterm
     */
    public Object dequeue() {
        if (size == 0) throw new NoSuchElementException("Cannot remove from empty queue");
        Object item = items[head];
        items[head] = null;
        head = (head + 1) % items.length;
        size--;
        return item ;
    }
    
    /**
     * Returns whether the queue is empty or not.
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Converting the Object array into a string
     */
    public String toString(){
        return Arrays.toString(items);
    }


    public Object[] items;
    private static int size, head, tail = 0;

}
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.NoSuchElementException;

import org.junit.Test;

public class PersonQueueTest {

	@Test
	public void test() {
		check(5,"Sam","Sanaa");
		check(5,"Mark","Austria");
	}
	
	private void check(int n, String name, String address){
		Person person1 = new Person(name, address);
		PersonQueue q = new PersonQueue(n);
		array = new Object[n];
		q.enqueue(person1);
		enqueueTest(person1);
		assertTrue(Arrays.equals(q.items, array));
	}
	
	 public void enqueueTest(Object name) {
	        if (size == array.length)throw new IllegalStateException("Cannot add to full queue");
	        array[tail] = name;
	        tail = (tail + 1) % array.length;
	        size++;
	    }
	 public Object dequeueTest() {
	        if (size == 0) throw new NoSuchElementException("Cannot remove from empty queue");
	        Object item = array[head];
	        array[head] = null;
	        head = (head + 1) % array.length;
	        size--;
	        return item ;
	    }
	private Object[] array;
	private static int size, head, tail;

}

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PersonQueueTest {

	@Test
	public void test() {
		check(5,"Sam","Sanaa");
	}
	
	private void check(int n, String name, String address){
		Person q = new Person(n);
		multi = new Object[n][2];
		q.enqueue(name, address);
		int index1 = 1;
        int index0 = 0;
        multi[tail][index0] = name;
        multi[tail][index1]=address;
        tail = (tail + 1) % multi.length;
        size++;
        Assert.assertTrue(EqualsBuilder.reflectionEquals(q,multi));
	}
	private Object[][] multi;
	private static int size, head, tail;

}

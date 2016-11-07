/**
 * Created by Al-Ghammari on 11/6/2016.
 */

import java.util.*;

public class PersonQueue {
    public static void main(String[] args) {
        Person q = new Person(5);
        System.out.println(q.isEmpty());
        q.enqueue("a","Sanaa");
        System.out.println(q);
        System.out.println(q.dequeue());
        System.out.println(q);
        q.enqueue("Osamah","Thahban");
        System.out.println(q);
        q.enqueue("Ghaleb", "Alhadabah");
        System.out.println(q.dequeue());
        q.enqueue("Al-Ghammari","Jeddah");
        System.out.println(q);
        q.enqueue("Al-Ghammari","Jeddah");
        System.out.println(q);
//        q.enqueue("Al-Ghammari","Jeddah1");
//        System.out.println(q);

    }

}
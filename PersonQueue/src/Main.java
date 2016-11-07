/**
 * Created by Al-ghammari on 11/7/2016.
 */
public class Main {

    public static void main(String[] args) {
        String[] myStrings = new String[20];
        System.out.println();
        Person q = new Person(5);
        System.out.println(q);
        q.enqueue("I am","Java");
        System.out.println(q);
        q.enqueue("Osa","Thahban");
        System.out.println(q);
        q.enqueue("Gha", "Alhadabah");
        System.out.println(q);
        q.enqueue("Al-Ghammari","Jeddah");
        System.out.println(q.dequeue());
        System.out.println(q);
        System.out.println(q.dequeue());
        System.out.println(q);

    }
}

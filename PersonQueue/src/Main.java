public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ahmed","Sanaa");
        System.out.println(p1);
        PersonQueue q = new PersonQueue(5);
        q.enqueue(p1);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);

//        Person q = new Person(5);
//        System.out.println(q.isEmpty());
//        q.enqueue("a","Sanaa");
//        System.out.println(q);
//        System.out.println(q.dequeue());
//        System.out.println(q);
//        q.enqueue("Osamah","Thahban");
//        System.out.println(q);
//        q.enqueue("Ghaleb", "Alhadabah");
//        System.out.println(q.dequeue());
//        q.enqueue("Al-Ghammari","Jeddah");
//        System.out.println(q);
//        q.enqueue("Al-Ghammari","Jeddah");
//        System.out.println(q);
//        q.enqueue("Al-Ghammari","Jeddah1");
//        System.out.println(q);

    }

}


/**
 * Created by Admin on 11/17/2016.
 */
public class Main {

    public static void main(String[] args) {
        StringList person = new StringList();
        person.insert("Sam");
        System.out.println(person);
        person.insert("Sam2");
        System.out.println(person);
        person.insert("Sam3");
        System.out.println(person);
        person.insert("Sam4");
        System.out.println(person);
        person.delete("Sam5");
        System.out.println(person);
//        person.insertAfter("Ghaleb");
//        System.out.println(person);
//        person.insertAfter("Al-Ghammari");
//        System.out.println(person);
        System.out.println(person.search("Sam4"));


    }
}

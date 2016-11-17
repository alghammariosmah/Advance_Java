
/**
 * Created by Admin on 11/17/2016.
 */
public class Main {

    public static void main(String[] args) {
        StringList person = new StringList();
        person.insert("Osamah");
        System.out.println(person);
        person.insert("Osamah2");
        System.out.println(person);
        person.insert("Osamah");
        System.out.println(person);
        person.insert("Osamah3");
        System.out.println(person);
        person.delete("Osamah2");
        System.out.println(person);
//        person.insertAfter("Ghaleb");
//        System.out.println(person);
//        person.insertAfter("Al-Ghammari");
//        System.out.println(person);
        System.out.println(person.search("Osamah"));


    }
}

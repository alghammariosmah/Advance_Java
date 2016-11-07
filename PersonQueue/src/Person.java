/**
 * Created by Al-Ghammari on 11/7/2016.
 */
public class Person {
    public Person(){
        this.person = null;
        this.address = null;
    }

    public Person(String person, String address) {
        setPerson(person);
        setAddress(address);
    }

    private String  setAddress(String ad) {
        return address= ad;
    }

    private String setPerson(String p) {
        return person = p;
    }

    public String toString(){
        return "("+"Person: "+person+", address: "+address+")";
    }
    public String person, address;
}

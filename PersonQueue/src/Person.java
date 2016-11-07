/**
 * Created by Al-Ghammari on 11/7/2016.
 * This method returns the person along with his/her address
 */
public class Person {
	/**
	 * A constructor for unassigned person and address strings
	 */
    public Person(){
        this.person = null;
        this.address = null;
    }

    /**
     * This function sets both the person and address
     * @param person
     * @param address
     */
    public Person(String person, String address) {
        setPerson(person);
        setAddress(address);
    }

    /**
     * This function requires the address from the main method input.
     * @param ad
     * @return
     */
    private String  setAddress(String ad) {
        return address= ad;
    }

    /**
     * This function requires the person from the main method input.
     * @param p
     * @return
     */
    private String setPerson(String p) {
        return person = p;
    }

    /**
     * Returns the final input as a string output
     */
    public String toString(){
        return "("+"Person: "+person+", address: "+address+")";
    }
    public String person, address;
}

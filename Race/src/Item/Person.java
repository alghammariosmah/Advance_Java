package Item;

/*
 * Person class where we can get the person and an auto-generated ID 
 * for each person
 * 
 * @author Admin
 *
 */
public class Person implements Item {
	private static int id = 0;
	final int personID;
	private String name;

	/*
	 * An empty constructor for un-given name
	 */
	public Person() {
		this(null);
	}

	/**
	 * A constructor with input string as p
	 * 
	 * @param p
	 */
	public Person(String p) {
		setName(p);
		id += 1;
		personID = id;
	}

	/*
	 * This function returns the auto-generated ID for each person
	 * 
	 * @see Item.Item#getID()
	 */
	@Override
	public int getID() {
		return personID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Item.Item#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * This function sets the name of the person added
	 * 
	 * @param n
	 */
	private void setName(String n) {
		name = n;
	}

	/**
	 * returns a string with all the variables needed from this class
	 */
	@Override
	public String toString() {
		return name + " with ID: " + personID;
	}

}

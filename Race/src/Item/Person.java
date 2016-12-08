package Item;


public class Person implements Item {
	private static int id = 0;
	public final int personID;
	
	private String name;
	
	public Person() { 
		this(null); 
	} 
	
	public Person(String p) { 
		setName(p);
		id+=1;
		personID = id;	
	} 
	
	public int getID(){
		return personID;
	}
	
	
	public String getName(){
		return name;
	}
	
	private void setName(String n){
		name = n;
	}
	
	
	public String toString() { 
		return name + " with ID: "+ personID; 
	}
	


	
}

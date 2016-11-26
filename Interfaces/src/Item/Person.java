package Item;


public class Person implements Item {
	public Person() { 
		this(null, 0); 
	} 
	public Person(String p, int iden) { 
		setName(p);
		setID(iden);
	} 
	
	public int getID(){
		
		return id;
	}
	
	public void setID(int n){
		id = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	
	public String toString() { 
		return name; 
	}
	
	private String name;
	private int id;
	
}

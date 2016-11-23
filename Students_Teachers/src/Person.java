

public class Person {
	public Person() { 
		this(null); 
	} 
	public Person(String p) { 
		name = p;
	} 
	
	public String nameToString(){
		return name;
	}

	public String toString() { 
		return "name: "+name; 
	}
	private String name;
}

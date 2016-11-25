
public class Student extends Person{
	public Student() {
		super(); 
	}
	public Student(String s) {
		super(s);
	}
	
	public String toString() { 
		String s= super.toString(); 
		s+= " student";
		return s;
	} 
}

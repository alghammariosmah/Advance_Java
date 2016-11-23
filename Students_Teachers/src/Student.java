
public class Student extends Person{
	public Student() {
		super(); 
	}
	public Student(String s) {
		super(s);
	}
	
	public void addStudnet(String s){
		StringBuffer buffer = new StringBuffer();
		buffer.append(s);
	}
	
	
	public String toString() { 
		String s= super.toString(); 
		s+= " student";
		return s;
	} 
}

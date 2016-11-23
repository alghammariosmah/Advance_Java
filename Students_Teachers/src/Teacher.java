
public class Teacher extends Person{
	public Teacher() {
		super(); 
	}
	public Teacher(String s) {
		super(s);
	}
	
	public String teacher(){
		return super.toString();
	}
	
	public String toString() { 
		String s= super.toString(); 
		s+= " teacher";
		return s;
	} 
}

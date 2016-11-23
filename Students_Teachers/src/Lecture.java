
public class Lecture {
	public Lecture(){
		this(null,null, null);
	}
	public Lecture(String st, String te, String le){
		student = st;
		teacher = te;
		lecture = le;	
	}
	
	public String toString() { 
		return "Lecture: "+lecture+ " name: "+teacher + " student: "+ student; 
	}
	
	private String student, teacher, lecture;
}

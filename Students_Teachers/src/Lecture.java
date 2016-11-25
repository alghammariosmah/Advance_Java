import java.util.ArrayList;

public class Lecture {
	public Lecture(){
		this(null,null, null);
	}
	public Lecture(ArrayList<String> st, String te, String le){
		student.addAll(st);
		teacher = te;
		setLecture(le);
	}
	
	public void setLecture(String le){
		lecture = le;
	}
	
	public String toString() { 
		return "Lecture: "+lecture+ ", teacher: "+teacher + ", students:\n"+ student.toString(); 
	}
	
	private String teacher, lecture;
	ArrayList<String> student = new ArrayList<>();
}

import java.util.ArrayList;

public class StudentList {
	ArrayList<String> elements = new ArrayList<>();
	
	public void addStudent(String student) {
		elements.add(student);
	}
	
	public void deleteStudent(String student){
		elements.remove(student);
	}

	public String toString() {
		return elements.toString();
	}
	public ArrayList<String> StudentList(){
		return elements;
	}
}

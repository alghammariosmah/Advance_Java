
public class Main {
	public static void main(String[] args){
		Student s1 = new Student("Akram");
		Student s2 = new Student("Ben");
		Student s3 = new Student("Sam");
		
		Teacher t = new Teacher("Daniel");
//		System.out.println(t);
	
		
		StudentList sl = new StudentList();
		sl.addStudent(s1.toString());
		sl.addStudent(s2.toString());
		sl.addStudent(s3.toString());
//		System.out.println(sl);
		
		Lecture l = new Lecture(sl.StudentList(), t.nameToString(), "Math");
		System.out.println(l);
	}
}

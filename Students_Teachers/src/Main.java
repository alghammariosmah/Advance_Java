
public class Main {
	public static void main(String[] args){
		Student s = new Student("Akram");
		Teacher t = new Teacher("Daniel");
		System.out.println(s);
		System.out.println(t);
		Lecture l = new Lecture(s.nameToString(), t.nameToString(), "Math");
		System.out.println(l);
	}
}

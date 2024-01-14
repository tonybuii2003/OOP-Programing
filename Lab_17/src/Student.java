
public class Student extends Person {
	public final int freshman = 1, sophomore = 2, junior = 3, senior = 4;
	private int status;
	public Student() {
		status = freshman;
	}
	public Student(String name, int age, int status) {
		super(name,age);
		this.status = status;
	}
	public String toString() {
		return super.toString() + "\nStatus: " + status;
	}
}

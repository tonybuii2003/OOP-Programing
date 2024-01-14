public class Staff extends Employee {
	private int title;
	public Staff(String name, int age, double salary, MyDate hire, int title) {
		super(name, age, salary, hire);
		this.title = title;
	}
	public String toString() {
		return super.toString() +"\nTitle: " + title;
	}

}

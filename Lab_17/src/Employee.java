
public class Employee extends Person {
	private double salary;
	private MyDate hireDate;
	public MyDate getDateHired() {
		return hireDate;
	}
	public Employee(String name, int age, double salary, MyDate hire) {
		super(name,age);
		this.salary = salary;
		this.hireDate = hire;
	}
	public String toString() {
		return super.toString() + "\nSalary: "+ salary + " Hired Date: " + getDateHired();
	}
}

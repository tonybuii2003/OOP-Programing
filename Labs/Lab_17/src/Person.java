
public class Person {
	private String name,address,phoneNum,email;
	private int age;
	public int getAge() {
		return age;
	}
	public Person() {}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
}

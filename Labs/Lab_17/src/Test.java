
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s = new Student("Tony",18,1);
		Person e = new Employee("Tom", 20, 100000, new MyDate(2019, 1, 3));
		Person f = new Faculty("Mark", 34, 120000, new MyDate(2018, 3, 5), 1);
		Person sa = new Staff("Anna", 37, 200000, new MyDate(2018, 6, 4), 1);
		System.out.println(s);
		System.out.println(e);
		System.out.println(f);
		System.out.println(sa);
		
	}

}

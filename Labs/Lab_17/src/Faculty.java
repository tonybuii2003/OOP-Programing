import java.util.Date;

public class Faculty extends Employee {
	private String officeHours;
	private int rank;
	public Faculty(String name, int age, double salary, MyDate hire, int rank) {
		super(name, age, salary, hire);
		this.rank = rank;
	}
	public int salaryRange(int rank) {
		Date now = new Date();
		int year = now.getYear() - getDateHired().getYear();
		if (rank*year < 10)
			return 1;
		if (rank*year<20)
			return 2;
		return 3;
	}
	public String toString() {
		return super.toString() + "\nRank: " + rank + " salaryRange: " + salaryRange(rank);
	}
}

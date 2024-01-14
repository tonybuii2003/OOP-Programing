public class MyDate {
	private int year, month, day;
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String toString() {
		return month + "/" + day  + "/"+year;
	}
	public boolean equals(Object o) {
		if (o instanceof MyDate)
			return ((MyDate)o).year == year && ((MyDate)o).month == month && ((MyDate)o).day == day;
		return false;
	}
	public int getYear() {
		return year;
	}
}

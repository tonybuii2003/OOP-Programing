
public class Time {
private int hours,minutes,seconds;
	public Time() { //default
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	public Time(int h, int m, int s) {
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}
	/**
	 * increases the number of seconds by one. 
	 * If the number of seconds is 60 it adds one to the number of minutes and resets seconds to 0. 
	 * If the number of minutes is 59 it adds one to the number of hours and resets the number of minutes to 0. 
	 * If the number of hours reaches 24 it should be reset to 0. 
	 */
	public void tick() {
		this.seconds += 1;
		if (this.seconds > 59) {
			this.minutes+=1;
			this.seconds = 0;
		}
		if (this.minutes > 59) {
			this.hours+=1;
			this.minutes = 0;
		}
		if (this.hours > 23) {
			this.hours = 0;
		}
		
	}
	/**
	 * adds the seconds together and makes sure the result is 59 or less (incrementing the minutes as needed)
	 * adds the minutes together and makes sure the result is 59 or less (increments the hours as needed)
	 * adds the hours together (resetting the hours to 0 if it reaches 24).
	 * @param offset is the Time to get the seconds, minutes, and hours
	 */
	public void add(Time offset) {
		this.seconds += offset.seconds;
		if (this.seconds > 59) {
			this.minutes+=1;
			this.seconds %= 60;
		}
		this.minutes+=offset.minutes;
		
		if (this.minutes > 59) {
			this.hours+=1;
			this.minutes %= 60;
		}
		this.hours+=offset.hours;
		if (this.hours > 23) {
			this.hours %= 24;
		}
		
	}
	public String toString() {
		return ("TIME: " + hours + " hours " + minutes + " minutes "+seconds + " seconds ");
	}
		
}

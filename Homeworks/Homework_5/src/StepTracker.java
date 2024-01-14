
public class StepTracker {
	private int numberOfStep;
	private int activeDays, numofDays, totalSetps;
	public int getStep() {
		return this.numberOfStep;
	}
	public int getTotalSteps() {
		return this.totalSetps;
	}
	public int getTotalofDays() {
		return this.numofDays;
	}
	public void setStep(int num) {
		this.numberOfStep = num;
		this.activeDays = 0;
		this.numofDays = 0;
	}
	//To consider as active day, the number of setps must be >= 10000
	/**
	 * A setter method for number of steps
	 * @param num the number value to set
	 */
	public StepTracker(int num) {
	this.numberOfStep = num;
	}
	/**
	 * accumulates information about steps, in readings taken once per day
	 * @param num the number value to set
	 */
	public void addDailySteps(int num) {
		if (num > getStep())
			this.activeDays+=1;
		this.numofDays += 1;
		this.totalSetps += num;
	}
	/*
	 * returns the number of active days
	 */
	public int activeDays() {
		return activeDays;
	}
	/*
	 *returns the average number of steps per day
	 *calculated by dividing the total number of steps taken by the number of days tracked 
	 */
	public double averageSteps() {
		if (getTotalofDays() == 0)
			return 0;
		return (double)getTotalSteps()/getTotalofDays();
	}
	
}

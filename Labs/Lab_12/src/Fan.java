
public class Fan {
	private final int SLOW=1,MEDIUM=2, FAST=3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	public int getSpeed() {
		return this.speed;
	}
	public boolean getOn() {
		return this.on;
	}
	public double getRadius() {
		return this.radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fan() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
	public Fan(int speed, boolean on,  double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	public String toString() {
		if (this.on){
			return ("Fan speed: " + getSpeed() + "; Fan color: " + getColor() + "; Fan radius: " + getRadius());
		}
		else {
			return ("Fan color: " + getColor() + "; Fan radius: " + getRadius() + "; fan is off");
		}
	}
}

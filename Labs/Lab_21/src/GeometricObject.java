
public abstract class GeometricObject {
	private boolean filled;
	private String color = "white";
	private java.util.Date dateCreated;
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		this.color = c;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean f) {
		this.filled = f;
	}
	public java.util.Date getDate(){
		return dateCreated;
	}
	public GeometricObject() {
		dateCreated =new java.util.Date();
	}
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String toString() {
		return "color: "+color+", filled: "+filled+" created on "+dateCreated;
	}
	public abstract double getArea();
	public abstract double getPerimeter();

}

package Lab_1;
public class Circle2D {
	private double x,y,radius;
	public double getRadius() {
		return this.radius;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public Circle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	public Circle2D (double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public boolean contains(double x, double y) {
		boolean xValid = x <= this.x + this.radius && x >= this.x - this.radius;
		boolean yValid = y <= this.y + this.radius && y >= this.y - this.radius;
		return xValid && yValid;
	}
	public boolean contains(Circle2D circle) {
		boolean xValid = circle.getX() + circle.getRadius() <= this.x - this.radius && circle.getRadius() >= this.x - this.radius;
		boolean yValid = circle.getY() + circle.getRadius() <= this.y - this.radius && circle.getRadius() >= this.y - this.radius;
		return xValid && yValid;
	}
	public boolean overlap(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(this.getX() - circle.getX() ,  2) + Math.pow(this.getY() - circle.getY(), 2));
		return circle.getRadius() + this.getRadius() <= distance;
	}
	
}


public class Triangle extends GeometricObject {
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	private double side1,side2,side3;
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	public Triangle(double side1,double side2,double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getArea() {
		double a=this.side1,b=this.side2,c=this.side3;
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double getPerimeter() {
		double a=this.side1,b=this.side2,c=this.side3;
		return a+b+c;
	}
	public String toString() {
		String str =super.toString() + ("\nThe triangle with 3 sides: " + this.side1+","+this.side2+","+this.side3 + ", has an area: "+ this.getArea()+" and perimeter: " + this.getPerimeter());
		return str;
	}
}

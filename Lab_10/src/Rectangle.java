public class Rectangle {
	private double width=1;
	private double height=1;
	private String color = "white";
	public Rectangle() {

	}
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}
	public void setWidth(double w) {
		this.width = w;
	}
	public void setHeight(double h) {
		this.height = h;
	}
	public void setColor(String c) {
		this.color = c;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	public String toString() {
		return "width= " + getWidth() + ", height= " + getHeight() + ", color= " + getColor();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(4,40);
		Rectangle rec2 = new Rectangle(3.5,35.9);
		
		rec1.setColor("red");
		rec2.setColor("blue");
		
		System.out.println(rec1);
		System.out.println(rec2);
		
		
		System.out.println("area of rectangle 1: " + rec1.getArea() + " and the perimeter of rectangle 1: " + rec1.getPerimeter());
		System.out.println("area of rectangle 2: " + rec2.getArea() + " and the perimeter of rectangle 2: " + rec2.getPerimeter());
	}

}

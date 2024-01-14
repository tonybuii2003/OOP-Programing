public class Square extends GeometricObject implements Colorable {
    private double size;
    public Square(double size){
        super();
        this.size = size;
    }
    public void howToColor(){
        System.out.print("\nColor a square of size length " + size + " from one size to the other.");
    }
    public double getArea(){
        return size*size;
    }
    public double getPerimeter(){
        return 4*size;
    }
    public static void main(String[] args) {
        GeometricObject[] test = new GeometricObject[5];
        test[0] = new Square(2);   
        test[1] = new Square(3);  
        test[2] = new Square(4);  
        test[3] = new Square(5);   
        test[4] = new Triangle(); 
        for (GeometricObject g : test){
            if (g instanceof Colorable){
                ((Colorable)g).howToColor();
            }
        }
    }
}

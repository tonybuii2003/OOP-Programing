package Lab_1;

public class Testing_Lab {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Circle2D c1 = new Circle2D(1, 1, 2);
			Circle2D c2 = new Circle2D (2, 2, 2);
			
			System.out.println("Does c1 contain (1.5, 1.5)? " + c1.contains(1.5,1.5));
			System.out.println("Does c1 contain c2? " + c1.contains(c2));
			System.out.println("Does c1 contain c2? " + c2.contains(c1));
			System.out.println("Does c1 overlap with c2? " + c1.overlap(c2));
	}

}

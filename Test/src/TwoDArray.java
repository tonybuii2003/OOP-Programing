public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double[][] point = new double[3][2];
	point[0][0] = 1;
	point[0][1] = 1;
			for (double[] i:point) {
				for (double j : i) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		//}
	}
}

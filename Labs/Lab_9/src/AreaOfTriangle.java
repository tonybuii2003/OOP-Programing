import java.util.Scanner;

public class AreaOfTriangle {
	public static double getTriangleArea(double[][] points) {
		double result,s,a,b,c,x1,x2,y1,y2,x3,y3;
		x1 = points[0][0]; y1 = points[0][1];
		x2 = points[1][0]; y2 = points[1][1];
		x3 = points[2][0]; y3 = points[2][1];
		a = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		b = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		c = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
		s = (a+b+c)/2;
		if (x1==y1 && x2==y2 && x3==y3) {
			
			return 0;
		}
			
		result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] point = new double[3][2];
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		String input = inp.nextLine();
		String[] temp = input.split(" ");
		int index = 0;
		for (int i = 0; i<point.length;i++) {
			for (int j = 0; j<point[i].length;j++) {
				point[i][j] = Double.parseDouble(temp[index]);
				index++;
			}
		}
		if (getTriangleArea(point) == 0) 
			System.out.println("The three points are on the same line");
		else
			System.out.printf("The area of the triangle is %.2f",getTriangleArea(point));
	}

}

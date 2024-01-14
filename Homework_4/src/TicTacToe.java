import java.util.Scanner;
public class TicTacToe {
	static int player1=0;
	static int player2=0;
	static String[][] map = createMap();
	public static String[][] createMap() {
		String [][] map = new String [3][3];
		for (int i=0;i<map.length;i++) {
			for (int j =0; j<map[0].length;j++) {
				map[i][j] = " * ";
			}
		}
		return map;
	}
	public static void printMap(String[][] a) {
		for (String[] i:a) {
			for (String j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static boolean won(String[][] a, String element, String element2) {
		for (int j = 0; j<a[0].length;j++) {
			if (a[0][j].equals(element) && a[1][j].equals(element) && a[2][j].equals(element)) {
				System.out.println(element + " wins");
				return true;
			}
		}
		for (int j = 0; j<a[0].length;j++) {
			if (a[0][j].equals(element2) && a[1][j].equals(element2) && a[2][j].equals(element2)) {
				
				System.out.println(element2 + " wins");
				return true;
			}
		}
		for (int i = 0; i<a.length;i++) {
			if(a[i][0].equals(element) && a[i][1].equals(element) && a[i][2].equals(element)) {
				System.out.println(element + " wins");
				return true;
			}
		}
		for (int i = 0; i<a.length;i++) {
			if(a[i][0].equals(element2) && a[i][1].equals(element2) && a[i][2].equals(element2)) {
				
				System.out.println(element2 + " wins");
				return true;
			}
		}
		if (a[0][0].equals(element) && a[1][1].equals(element) && a[2][2].equals(element)) {
			System.out.println(element + " wins");
			return true;
		}
		if (a[0][2].equals(element) && a[1][1].equals(element) && a[2][0].equals(element)) {
			System.out.println(element + " wins");
			return true;
		}
		if (a[0][0].equals(element2) && a[1][1].equals(element2) && a[2][2].equals(element2)) {
			System.out.println(element2 + " wins");
			return true;
		}
		if (a[0][2].equals(element2) && a[1][1].equals(element2) && a[2][0].equals(element2)) {
			System.out.println(element2 + " wins");
			return true;
		}
		return false;
	}
	public static boolean mainGame () {
		
		Scanner key = new Scanner(System.in);
		if (player1==player2) {
			System.out.println("Player X turn:");
			System.out.println("x cordinate (0-2): ");
			int x = key.nextInt();
			System.out.println("y cordinate (0-2): ");
			int y = key.nextInt();
			if (map[x][y].equals(" * ")) {
			map[x][y] = "X ";
			player1++;
			}else if (map[x][y].equals("O ")) {
				System.out.println("O has already moved in here");
			}
		printMap(map);
		}
		else if (player1>player2) {
			System.out.println("Player O turn:");
			System.out.println("x cordinate(0-2): ");
			int x = key.nextInt();
			System.out.println("y cordinate(0-2): ");
			int y = key.nextInt();
			if (map[x][y].equals(" * ")) {
			map[x][y] = "O ";
			player2++;
			} else if (map[x][y].equals("X ")) {
				System.out.println("X has already moved in here");
			}
			printMap(map);
		}
		if((player1+player2) == 9) {
			System.out.println("DRAW");
			return true;
		}
		return won(map,"O ","X ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMap(map);
		while(mainGame() == false) {
		}
	}

}

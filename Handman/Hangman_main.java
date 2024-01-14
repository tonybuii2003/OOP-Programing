import java.util.Scanner;

public class Hangman_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the game
		Hang_man tony = new Hang_man("TonyBuiHAHA", 6);
		tony.createGame();
		// INPUT
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Your word:");
		char x = keyboard.next().charAt(0);
		// MAINGAME
		tony.setWord(x);
		while (tony.gamePlay() == false) {
			System.out.println("Your word:");
			x = keyboard.next().charAt(0);
			tony.setWord(x);
		}

	}

}

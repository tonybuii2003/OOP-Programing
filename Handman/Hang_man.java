
public class Hang_man {
	private String thatWord;
	private char yourWord;
	private int turn;

	// CONDUCTOR
	public Hang_man(String w, int t) {
		thatWord = w;
		yourWord = '0';
		turn = t;
	}

	String finalWord = "";
	int count = 0;

	// METHOD THAT WILL CREATE THE GAME AND THE WORD
	public void createGame() {
		System.out.println("Hi! Welcome to Hangman, you have " + turn + " turns");
		for (int i = 0; i <= thatWord.length() - 1; i++) {
			finalWord += "*";
			// guess[i] = "*"
		}
		System.out.println("Your word right now: " + finalWord);
	}

	// method that set the new word
	public void setWord(char word) {
		this.yourWord = word;
	}

	// CHECK IF THE CHAR USER PROVIDED MATCH THE CHAR IN THE GIVEN WORD
	public boolean checkIfexist() {
		boolean result = false;
		for (int i = 0; i <= thatWord.length() - 1; i++) {
			if (thatWord.charAt(i) == yourWord) {
				// if word[i] == yourChar --> c++ -->guess[i] = yourChar
				count++;
				finalWord = finalWord.substring(0, i) + yourWord + finalWord.substring(i + 1);
				result = true;
			}
		}
		return result;
	}
	// THIS IS THE MAIN GAME
	/*
	 * If the user still have turns:
	 * The game moves on. After user input the word, the game will check if the word
	 * match its word.
	 * If the word doesn't match, the user's word will replace into the blank. Else
	 * the user will lose 1 turn.
	 * The game only end when the user win (ALL THE WORDS MATCHED) or lost (OUT OF
	 * TURN)
	 */

	public boolean gamePlay() {
		boolean result = false;
		if (turn > 0) {
			if (checkIfexist()) {

				System.out.println("Right! Your word is now: " + finalWord);
			} else {
				System.out.println("Wrong");
				turn--;
				System.out.println("You have " + turn + " turns left");
				if (turn == 0) {
					System.out.println("You out of turn. You lost");
					result = true;
				}
			}
		}
		if (count == thatWord.length()) {
			System.out.println("You win");
			result = true;

		}
		return result;
	}
}

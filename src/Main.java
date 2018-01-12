

/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		MastGame game = new MastGame(upperBound);
		GameConsole ui = new GameConsole();
		ui.play(game);
		
		
	}
}

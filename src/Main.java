

/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 * @author Theeruth Borisuth
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100 ;
		MastGame game = new MastGame(upperBound);
		
		
		//this part is the part that we need to guess by ourself
//		GameConsole ui = new GameConsole();
//		ui.play(game);
		
		//this is the Game solver.
		GameSolver gs = new GameSolver();
		System.out.println("Mission completed. The number is "+gs.play(game));
		System.out.println("I have tried "+game.getCount()+" times.");
		
	}
}

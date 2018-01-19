/**
 * This class will solve the MastGame by itself. . This class solve the game by using the Bisection Algorithm. 
 * At each step you divide the search interval in half, so that the solution is always somewhere in the search interval.
 * @author Theeruth Borisuth.
 *
 */
public class GameSolver extends NumberGame {
	/**
	 * Initialize the GameSolver class.
	 * @param game : base class from NumberGame.
	 * @return guess : return the correct number.
	 */
	public int play(NumberGame game){
		int max = game.getUpperBound();
		int min = 1;
		int guess = min + (max - min)/2 ; 
		while (!game.guess(guess)){
			//get message from the number game class.
			String hint = game.getMessage();
			//If the guess number is too large it will set the max into the guess number.
			if(hint.toLowerCase().contains("too large")){
				max = guess - 1; 
				guess = min + (max - min)/2;
			}	
			//If the guess number is too large it will set the max into the guess number.
			if(hint.toLowerCase().contains("too small")){
				if ((max - guess) == 1){
				game.guess(guess+1);
				return guess + 1  ;
				}
				min = guess + 1;
				guess = min + (max - min)/2;
			}
		 }
		return guess;
	}

}

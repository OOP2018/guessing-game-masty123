/**
 * This class will solve the MastGame by itself. It will narrowing the range of the min and max until it get its answer
 * @author Theeruth Borisuth.
 *
 */
public class GameSolver extends NumberGame {
	/**
	 * Initialize the GameSolver class.
	 * @param game
	 * @return guess number
	 */
	public int play(NumberGame game){
		return solve(game, game.getUpperBound(), game.getUpperBound()/2);
	}
	/**
	 * This method will be the key for Solving MastGame.
	 * @param game : this use to call base class called number game.
	 * @param upperBound : It is a maximum value of the number that we can guess
	 * @param answer : this variable use to return the correct answer.
	 * @return answer
	 */
	private int solve(NumberGame game, int upperBound, int answer){
		game.guess(answer);
		if (game.getMessage().contains("too small")){
			if ((upperBound - answer) == 1){
				game.guess(answer + 1);
				return answer + 1;
			} 
			else return solve(game, upperBound, answer + (upperBound - answer) / 2);
			
		} else if (game.getMessage().contains("too large")) return solve(game, answer - 1 , answer/2);
		
		System.out.println("Mission completed. The number is "+answer);
		System.out.println("I have tried "+game.getCount()+" times.");
		return answer;
	}
}

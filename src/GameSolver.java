/**
 * This class will solve the MastGame by itself. It will narrowing the range of the min and max until it get its answer
 * @author Theeruth Borisuth.
 *
 */
public class GameSolver extends NumberGame {
	/**
	 * Initialize the Gameolver class.
	 * @param game
	 * @return guess number
	 */
	public int play(NumberGame game){
//		int max = game.getUpperBound();
//		int min = 1;
//		//int counter = 0 ;
//		int guess = 0 ; 
//		while (game.guess(guess) != true){
//			int range = (max - min) + 1;
//			guess = (int) ((Math.random() * range) + min);
//			game.guess(guess);
//			//get message from the number game class.
//			String hint = game.getMessage();
//			//If the guess number is too large it will set the max into the guess number.
//			if(hint.contains("large")){
//				max = guess; 
//			}
//			//If the guess number is too large it will set the max into the guess number.
//			if(hint.contains("small")){
//				min = guess;
//			}
//				
//			//Return the correct number
//			if(hint.contains("Right")){
//				break;
//			}
//		 }
//		System.out.println("Mission completed. The number is "+guess);
//		System.out.println("I have tried "+game.getCount()+" times.");
//		return guess;
		return solve(game.getUpperBound(), game, game.getUpperBound()/2);
	}
	
	private int solve(int upperBound, NumberGame game, int answer){
		game.guess(answer);
		if (game.getMessage().contains("small")){
			if ((upperBound - answer) == 1){
				game.guess(answer + 1);
				return answer + 1;
			}
			else return solve(upperBound, game, answer + (upperBound - answer) / 2);
			
		}else if (game.getMessage().contains("large")){
			return solve(answer - 1, game, answer/2);
		}
		return answer;
	}
}

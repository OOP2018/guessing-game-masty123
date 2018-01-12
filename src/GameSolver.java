/**
 * This class will solve the MastGame by itself. It will narrowing the range of the min and max until it get its answer
 * @author Theeruth Borisuth.
 *
 */
public class GameSolver extends NumberGame {
	//Initialize the problem solver.
	public int play(NumberGame game){
		int max = game.getUpperBound();
		int min = 1;
		int counter = 0 ;
		int guess = 0 ; 
		boolean running = true ;
		while (running){
			int range = (max - min) + 1;
			guess = (int) ((Math.random() * range) + min);
			game.guess(guess);
			//get message from the number game class.
			String hint = game.getMessage();
			//If the guess number is too large it will set the max into the guess number.
			if(hint.contains("large")){
				counter++;
				max = guess; 
			}
			//If the guess number is too large it will set the max into the guess number.
			if(hint.contains("small")){
				counter++;
				min = guess;
			}
				
			//Return the correct number
			if(hint.contains("Right")){
				counter++;
				break;
			}
		 }
		System.out.println("Mission completed. The number is "+guess);
		System.out.println("I have tried "+counter+" times.");
		return guess;
		
	}
}

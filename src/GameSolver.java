
public class GameSolver extends NumberGame {
	
	public int play(NumberGame game){
		MastGame gm = new MastGame();
		int max = game.getUpperBound();
		int min = 1;
		int range = (max - min) + 1;
		int guess = 0 ;
		while (guess != gm.secret){
			
		}
		return guess;
		
	}
}


public class GameSolver extends NumberGame {
	
	public int play(NumberGame game){
		int max = game.getUpperBound();
		int min = 1;
		
		int guess = 0 ;
		boolean running = true ;
		while (running){
			int range = (max - min) + 1;
			guess = (int) ((Math.random() * range) + min);
			game.guess(guess);
			
			String hint = game.getMessage();
			if(hint.contains("large")){
				System.out.println(guess);
				max = guess;
			}
				
			if(hint.contains("small")){
				System.out.println(guess);
				min = guess;
			}
				
			
			if(hint.contains("Right")){
				System.out.println("Mission completed. The number is "+guess);
				break;
			}
		 }
		return guess;
		
	}
}

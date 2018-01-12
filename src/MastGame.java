import java.util.Random;

public class MastGame extends NumberGame {
	//variables 'n' stuff
	private int upperBound;
	private String hint= "";
	private int counter = 0 ;
	
	public int secret ;
	
	public MastGame(){};
	/**
	 * 
	 * @param upperBound
	 */
	public MastGame(int upperBound){
		this.upperBound = upperBound;
		secret = getRandomNumber(this.upperBound);
	}
	
	
	public int getRandomNumber (int limit){
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}
	
	public boolean guess(int number){
		counter++;
		if (number == secret){
			hint = "Right! The secret number is "+number+" !."+" You have guessed "+counter+" times.";
			return true;
		}
		
		if(secret > number){
			hint = "Sorry, your guess is too small.\n";
		}
		else{
			hint = "Sorry, you're guess is too large.\n";
		}
		return false ;
	}
	
	public int getUpperBound(){
		return upperBound;
	}
	
	public String getMessage(){
		return hint;
	}
	public String toString(){
		return "I'm guesing the number between 1 and 100";
	}
	
}

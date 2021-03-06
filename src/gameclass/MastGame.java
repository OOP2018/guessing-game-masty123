package gameclass;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
/**
 * A Guessing game called MastGame it will random a number from 1 to 100 and you will need to guess which number it is.
 * @author Theeruth Borisuth
 *
 */
public class MastGame extends NumberGame {
	//variables 'n' stuff
	private int upperBound;
	private String hint= "";
	private int counter = 0 ;
	private int secret ;
	private int number;
	

	/**
	 * Initialize a new game
	 * @param upperBound is the max value for the secret number.
	 */
	public MastGame(int upperBound){
		this.upperBound = upperBound;
		secret = getRandomNumber(this.upperBound);
	}
	
	/**
	 * Create a random number between 1 and the limit.
	 * @param limit is the upper limit for the random number.
	 * @return a random number between 1 and limite (inclusive).
	 */
	public int getRandomNumber (int limit){
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}
	/**
	 * Guess the number that we have got. If you have the same
	 * @param number that we guess.
	 * @return true if u guess right, false if it wrong.
	 */
	public boolean guess(int number){
		counter++;
		this.number = number;
		if (number == secret){
			hint = "Right! The secret number is "+number+" !."+" You have guessed "+counter+" times.";
			setChanged();
			notifyObservers();
			return true;
		}
		
		if(secret > number){
			hint = "Sorry, your guess is too small.\n";
		}
		else{
			hint = "Sorry, you're guess is too large.\n";
		}
		setChanged();
		notifyObservers();
		return false ;
	}
	/**
	 *Return the max value of the number.
	 *@return max value.
	 */
	public int getUpperBound(){
		return upperBound;
	}
	/**
	 * Get the secret number.
	 * @return secret number.
	 */
	public int getSecret(){
		return secret ;
	}
	/**
	 * 	get the message to know whether we guess right or wrong.
	 * 	@return hint whether we guess right or wrong.
	 */
	public String getMessage(){
		return hint;
	}
	public int getCount(){
		return counter;
	}
	/**
	 * return the question of the game.4
	 * @return Question message.
	 */
	public String toString(){
		return "I'm guesing the number between 1 and " + upperBound;
	}
	
	@Override
	public int getAnswer(){
		return number;
	}
	
}

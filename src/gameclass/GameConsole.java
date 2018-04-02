package gameclass;
import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 *  @author Theeruth Borisuth
 */
public class GameConsole {
	/**
	 * This method display the message in the console.
	 * @param game
	 * @return guess number
	 */
	public int play(MastGame game) {
		Scanner input = new Scanner(System.in);
		//greeting, friends.
		System.out.println( "WELCOME TO MASTGAME\n" );
		//reply player with question message
		System.out.println(game.toString());
		int guess = 0 ;
		boolean correct = false;
		//checking the correct answer
		do{
			System.out.print("Your answer? ");
			guess = input.nextInt();
			
			correct = game.guess(guess);
			System.out.println( game.getMessage() );

		}while(correct != true);
		
		return guess;
	}
	
}

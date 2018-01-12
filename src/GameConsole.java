import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
	public int play(MastGame game) {
		Scanner input = new Scanner(System.in);
		
		System.out.println( "WELCOME TO MASTGAME\n" );
		System.out.println(game.toString());
		int guess = 0 ;
		boolean correct = false;
		do{
			System.out.print("Your answer? ");
			guess = input.nextInt();
			
			correct = game.guess(guess);
			System.out.println( game.getMessage() );

		}while(correct != true);
		
		return guess;
	}
	
}

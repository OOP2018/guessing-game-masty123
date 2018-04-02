package gameui;
import gameclass.MastGame;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class GameController {
	@FXML
	TextField textfield1;
	@FXML
	Label label;
	@FXML
	Label label2;
	@FXML
	Button guess;
	@FXML
	Button giveup;
	
	//initialize variable from MastGame.
	private int upperBound = 100;
	private MastGame game = new MastGame(upperBound);
	private AnswerView aView = new AnswerView(game);
	private CounterView cView = new CounterView(game);
	
	@FXML
	public void initialize(){
		if(label != null){label.setText(game.toString());}
		aView.run();
		cView.run();
		

	}
	
	@FXML
	public void handleGuess(){
		int guess = Integer.parseInt(textfield1.getText().trim());
		game.guess(guess);
		label2.setText(game.getMessage());
	}
	
	@FXML
	public void handleGiveup(){
		System.exit(0);
	}
	
	
	public void handleKey(KeyEvent event){
		if(event.getCode().equals(KeyCode.ESCAPE)){
			System.exit(0);
		}
		
		if(event.getCode().equals(KeyCode.ENTER)){
			handleGuess();
		}
	}
	
	
	
	
}

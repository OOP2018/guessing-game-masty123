package GameUI;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	/**
	 * setting up the user interface.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
	
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("guessinggameUI.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Guessing Game");
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception creating scene: "+ e.getMessage());
		}
	}
	/**
	 * Launch the program
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

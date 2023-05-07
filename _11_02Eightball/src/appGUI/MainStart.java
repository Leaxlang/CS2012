package appGUI;

/*
 * GROUP-1:
 * Alondra Perez 
 * Lea Lang
 * Naomi Shah
 */

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import java.io.FileNotFoundException; 
import javafx.scene.Scene;  
import javafx.scene.layout.Pane;


public class MainStart extends Application {
	private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #e63ca7; -fx-text-fill: #2c1545";
	private static final String IDLE_BUTTON_STYLE = "-fx-background-color: #633dcc; -fx-text-fill: #fac8e3";
	private Pane root;
	private MagicEigthBall ball;


	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) throws Exception {

		//creating a pane ad a new 8ball object, and make it appear empty
		this.root = new Pane();
		this.ball = new MagicEigthBall();
		ball.showMystery();

		
		//BUTTON:
		//functionality:
		Button button = new Button ("Shake 8 ball");
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{
				try {
					ball.showSaying();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		};
		button.setOnAction(event);

		//placement
		button.setLayoutX(300);
		button.setLayoutY(630);
		
		//design
		button.setPrefSize(110, 40);
		button.setStyle(IDLE_BUTTON_STYLE);
		button.setOnMouseEntered(e -> button.setStyle(HOVERED_BUTTON_STYLE));
		button.setOnMouseExited(e -> button.setStyle(IDLE_BUTTON_STYLE));

		
		//adding elements
		root.getChildren().add(this.ball);
		root.getChildren().add(button);

		Scene scene = new Scene(this.root,720,720);  

		//Setting title to the Stage 
		stage.setTitle("Magic 8-ball");  

		//Adding scene to the stage 
		stage.setScene(scene);
		stage.setResizable(false);
		
		//Displaying the contents of the stage 
		stage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
























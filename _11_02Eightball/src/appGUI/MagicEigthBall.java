package appGUI;

/*
 * GROUP-1:
 * Alondra Perez 
 * Lea Lang
 * Naomi Shah
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.FadeTransition;
import javafx.animation.*;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;


public class MagicEigthBall extends StackPane {
	public MagicEigthBall(Node... arg0) {
		super(arg0);
	}
	
	//shows empty 8ball image
	public void showMystery() throws FileNotFoundException {
		Image image2;
		image2 = new Image(new FileInputStream("8ball.png"));
		ImageView imageView2 = new ImageView(image2); 

		getChildren().add(imageView2);
	}

	//shakes the 8ball and shows a saying 
	public void showSaying() throws FileNotFoundException, InterruptedException {
		
		//adding 8ball gif to "animate it"
		Image image;
		image = new Image(new FileInputStream("8ball.gif"));
		ImageView imageView = new ImageView(image); 

		
		//setting the preserve ratio of the image view 
		imageView.setPreserveRatio(true); 

		getChildren().add(imageView);

		
		//creating objects: WiseSaying, Label, and another 8 ball image that doesn't move 
		WiseSayings oracle = new WiseSayings();
		String saying = oracle.getRandomSaying();

		Label label1 = new Label(saying + "\n \n \n \n \n \n \n \n \n \n \n \n \n ");
		label1.setTextFill(Color.web("#45107d"));

		Image image2;
		image2 = new Image(new FileInputStream("8ball.png"));
		ImageView imageView2 = new ImageView(image2);

		
		//delaying the appearance of the label to have gif finish one cycle first
		FadeTransition ft = new FadeTransition(Duration.millis(2000), label1);
		ft.setFromValue(0);
		ft.setToValue(1);
		SequentialTransition seqTransition2 = new SequentialTransition (
				new PauseTransition(Duration.millis(1000)), // wait a second
				ft
				);
		seqTransition2.play();

		
		//have second image appear on top of gif so it looks like it is not looping
		FadeTransition ft2 = new FadeTransition(Duration.millis(100), imageView2);
		ft2.setFromValue(0);
		ft2.setToValue(1);
		SequentialTransition seqTransition = new SequentialTransition (
				new PauseTransition(Duration.millis(2400)), 
				ft2
				);
		seqTransition.play();

		getChildren().add(imageView2);
		getChildren().add(label1);
	}
}























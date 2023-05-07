package main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.transform.Rotate;
import javafx.scene.shape.*;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.layout.StackPane;
import javafx.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.*;

public class Picture_Experiment extends Application {
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane, 800, 600);

		
		//---BACKGROUND
		Rectangle sky = new Rectangle(0, 0, 800, 600);
		sky.setFill(Color.rgb(49, 29, 64));
		stackPane.getChildren().add(sky);

		
		//---BOX
		Box box = new Box(300,300, 300); 
		Rotate xRotation = new Rotate(75, Rotate.X_AXIS);
		Rotate yRotation = new Rotate(25, Rotate.Y_AXIS);
		box.getTransforms().addAll(xRotation, yRotation);

		
		//---MATERIAL
		PhongMaterial mat = new PhongMaterial();
		mat.setDiffuseMap(new Image(new FileInputStream("giphy.gif")));
		mat.setSpecularMap(new Image( new FileInputStream("Height.png")));

		((PhongMaterial) mat).setSpecularColor(Color.WHITE);
		//((PhongMaterial) mat).setDiffuseColor(Color.BLACK);

		box.setMaterial(mat);

		
		//---"ANIMATION"
		RotateTransition rt = new RotateTransition(Duration.millis(5000), box);
		rt.setAxis(Rotate.X_AXIS);
		rt.setByAngle(180);
		rt.setCycleCount(10);
		rt.setAutoReverse(true);

		EventHandler<MouseEvent> movement = new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent e) { 
				rt.play();
			} 
		};
		EventHandler<MouseEvent> stop = new EventHandler<MouseEvent>() { 
			@Override 
			public void handle(MouseEvent e) { 
				rt.pause();
			} 
		};

		box.setOnMouseMoved(movement);
		box.setOnMouseExited(stop);

		//---SETUP
		stackPane.getChildren().add(box);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.RotateTransition;
import javafx.event.EventHandler;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Panel extends StackPane{

	public Panel() throws FileNotFoundException {
		
		//---SHADOW
		Rectangle shadow = new Rectangle(300, 450);
		shadow.setSmooth(true);
		shadow.setTranslateX(-5);
		shadow.setTranslateY(6);
		shadow.setFill(Color.GRAY);

		BoxBlur blur = new BoxBlur();  
		blur.setHeight(10);  
		blur.setWidth(8);  
		blur.setIterations(5);
		shadow.setEffect(blur);

		//---BOX
		Box box = new Box(300, 450, 10); 
		Rotate xRotation = new Rotate(1, Rotate.X_AXIS);
		Rotate yRotation = new Rotate(0, Rotate.Y_AXIS);
		box.getTransforms().addAll(xRotation, yRotation);


		//---MATERIAL
		PhongMaterial mat = new PhongMaterial();
		mat.setDiffuseMap(new Image(new FileInputStream("giphy2.gif")));
		mat.setSpecularMap(new Image( new FileInputStream("Height.png")));
		mat.setSpecularPower(100);

		((PhongMaterial) mat).setSpecularColor(Color.WHITE);
		//		((PhongMaterial) mat).setDiffuseColor(Color.BLACK);

		box.setMaterial(mat);


		//---ANIMATION
		RotateTransition rt = new RotateTransition(Duration.millis(1000), box);
		rt.setAxis(Rotate.Y_AXIS);
		rt.setFromAngle(10);
		rt.setToAngle(-10);
		rt.setCycleCount(50);
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
		
		getChildren().add(shadow);
		getChildren().add(box);
	}

}

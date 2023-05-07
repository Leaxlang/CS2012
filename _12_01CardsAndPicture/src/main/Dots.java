package main;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.KeyValue;
import javafx.util.Duration;

public class Dots extends StackPane {

	private final int WIDTH = 800;
	private final int HEIGHT = 600;
	private final Random random = new Random();

	public Dots() {

		Canvas canvas = new Canvas(WIDTH, HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		StackPane root = new StackPane(canvas);

		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0), event -> {
			// Draw the first circle immediately
			drawCircle(gc);
		}));
		timeline.setDelay( Duration.millis( 2000) );
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.setAutoReverse(false);

		for (int i = 1; i <= 10; i++) {
			double delay = random.nextDouble() * 1.0; // Random delay between 0 and 1 seconds
			//double duration = random.nextDouble() * 1.0 + 1.0; // Random duration between 1 and 2 seconds
			timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(delay), new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// Draw a circle with a random color and position
					drawCircle(gc);
				}
			}, new KeyValue[0]));
		}

		timeline.play();

		//Dots disappear when touched
		canvas.setOnMouseMoved(e->{
			gc.clearRect(e.getX(),e.getY(),30,30);
		});

		getChildren().add(root);
	}

	private void drawCircle(GraphicsContext gc) {
		gc.setFill(javafx.scene.paint.Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		gc.fillOval(random.nextInt(WIDTH), random.nextInt(HEIGHT), 5, 5);
	}
}

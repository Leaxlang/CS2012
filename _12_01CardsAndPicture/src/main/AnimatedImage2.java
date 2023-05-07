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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.KeyValue;
import javafx.util.Duration;

public class AnimatedImage2 extends Application {

    private final int WIDTH = 640;
    private final int HEIGHT = 480;
    private final int FPS = 60;
    private final String FORMAT = "png";
    private final File FILE = new File("animation." + FORMAT);
    private final Random random = new Random();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0), event -> {
            // Draw the first circle immediately
            drawCircle(gc);
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.setAutoReverse(false);

        for (int i = 1; i <= 10; i++) {
        	double delay = random.nextDouble() * 3.0; // Random delay between 0 and 3 seconds
        	double duration = random.nextDouble() * 2.0 + 1.0; // Random duration between 1 and 3 seconds
        	timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(delay), new EventHandler<ActionEvent>() {
        	    @Override
        	    public void handle(ActionEvent event) {
        	        // Draw a circle with a random color and position
        	        drawCircle(gc);
        	    }
        	}, new KeyValue[0]));

        }

        timeline.play();

        primaryStage.setScene(scene);
        primaryStage.show();

        // Save the canvas to a file
        try {
            WritableImage image = canvas.snapshot(null, null);
            ImageIO.write(SwingFXUtils.fromFXImage(image, null), FORMAT, FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void drawCircle(GraphicsContext gc) {
        gc.setFill(javafx.scene.paint.Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        gc.fillOval(random.nextInt(WIDTH), random.nextInt(HEIGHT), 50, 50);
    }
}

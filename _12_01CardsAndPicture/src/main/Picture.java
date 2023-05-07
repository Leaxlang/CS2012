package main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.effect.BoxBlur;  
import javafx.util.Duration;
import javafx.scene.shape.*;
import javafx.scene.layout.StackPane;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.*;
import javafx.scene.text.*;
import java.util.Random;
import javafx.scene.control.*;

//image-credits:
//picture: https://giphy.com/oritoor/
//rock texture: https://3dtextures.me/2022/04/07/rock-047/

public class Picture extends Application {
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane, 800, 600);

		//---BACKGROUND
		ImageView background = new ImageView(new Image( new FileInputStream("concrete.jpg")));
		background.setFitHeight(2000);
		background.setFitWidth(3000);
		stackPane.getChildren().add(background);


		Panel plate = new Panel();
		stackPane.getChildren().addAll(plate);

		EventHandler<MouseEvent> blackhole = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) { 
				stackPane.getChildren().removeAll(plate);
				addBlackhole(stackPane);
			};
		};

		plate.setOnMouseClicked(blackhole);

		addSignature(stackPane);

		addTitle(stackPane);

		addLoading(stackPane);

		addInstructions(stackPane);



		//---SETUP		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	//---INSTRUCTIONS
	private void addInstructions(StackPane stackPane) {
		VBox vbox = new VBox();
		
		Rectangle rect = new Rectangle(4000,4000);
		rect.setFill(Color.MEDIUMORCHID);
		
		Text info = new Text("Click and Hover over different things!");
		info.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 25));
		
		Button btn = new Button("close");
		
		stackPane.getChildren().addAll(rect,vbox);
		vbox.getChildren().addAll(info,btn);
		vbox.setAlignment(Pos.CENTER);		
		
		EventHandler<MouseEvent> close = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) { 
				stackPane.getChildren().removeAll(rect,vbox);
			};
		};
		btn.setOnMouseClicked(close);
		
	}

	//---LOADING
	private void addLoading(StackPane stackPane) throws FileNotFoundException {
		Rectangle rect = new Rectangle(4000,4000);
		rect.setFill(Color.BLANCHEDALMOND);
		
		ImageView back = new ImageView(new Image( new FileInputStream("windows-background.png")));
		ImageView loading = new ImageView(new Image( new FileInputStream("giphy3.gif")));
		
		stackPane.getChildren().addAll(rect,back,loading);

		EventHandler<MouseEvent> close = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) { 
				stackPane.getChildren().removeAll(rect,back,loading);
			};
		};
		loading.setOnMouseClicked(close);	
	}

	//---TITLE
	private void addTitle(StackPane stackPane) {
		Text picture = new Text("\"PICTURE\"");
		picture.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 45));
		stackPane.getChildren().add(picture);
		stackPane.setAlignment(picture, Pos.TOP_CENTER);

		EventHandler<MouseEvent> stroke = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				StrokeTransition st = new StrokeTransition(Duration.millis(1500), picture, Color.CADETBLUE, Color.BLUEVIOLET);
				st.setCycleCount(100);
			    st.setAutoReverse(true);
			 
			    st.play();
			}
		};
		picture.setOnMouseClicked(stroke);
	}

	//---SIGNATURE
	private void addSignature(StackPane stackPane) {
		Random random = new Random();
		Text name = new Text("LEA");
		name.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
		name.setFill(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		
		stackPane.getChildren().add(name);
		stackPane.setAlignment(name, Pos.BOTTOM_RIGHT);

		EventHandler<MouseEvent> changeColor = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				FillTransition change = new FillTransition(Duration.millis(500), name, Color.DEEPPINK, Color.HONEYDEW);
				change.setCycleCount(100);
				change.setAutoReverse(true);
				change.play();
			}
		};
		name.setOnMouseMoved(changeColor);
	}

	//BLACKHOLE
	public void addBlackhole(StackPane stackPane){
		Circle blackhole = new Circle(100);

		BoxBlur blur = new BoxBlur();  
		blur.setHeight(10);  
		blur.setWidth(8);  
		blur.setIterations(5);
		blackhole.setEffect(blur);

		stackPane.getChildren().add(blackhole);

		ScaleTransition zoom = new ScaleTransition(Duration.millis(3500), blackhole);

		zoom.setByX(5);
		zoom.setByY(5);
		zoom.setCycleCount(1);

		zoom.play();

		Dots bubbles = new Dots();
		stackPane.getChildren().add(bubbles);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

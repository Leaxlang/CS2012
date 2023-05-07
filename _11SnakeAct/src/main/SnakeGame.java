package main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class SnakeGame extends Application{
	
	private static final int GAMEWIDTH = 600;
	private static final int GAMEHEIGTH = 500;
	private static final int RADIUS = 5;
	
	private Pane root;
	
	private Text score;
	
	private Circle food;
	
	Random random = new Random();
	
	private Snake snake;
	
	private void newSnake(){
		this.snake = new Snake(GAMEWIDTH/2, GAMEHEIGTH/2,RADIUS);
		root.getChildren().add(this.snake);
	}
	
	private void newFood() {
		this.food = new Circle(random.nextInt(GAMEWIDTH), random.nextInt(GAMEHEIGTH), RADIUS);
		this.food.setFill(Color.DEEPPINK);
		this.root.getChildren().add(this.food);
	}
	
	private boolean hit() {
		return this.food.intersects(this.snake.getBoundsInLocal());
	}
	
	private boolean gameOver() {
		return this.snake.eatSelf();
	}
	
	private void move() {
		Platform.runLater(() ->{
			this.snake.step();
			adjustLocation();
			if(hit()) {
				this.snake.eats(this.food);
				this.score.setText(""+this.snake.getLength());
				newFood();
			}else if(gameOver()) {
				this.root.getChildren().clear();
				this.root.getChildren().add(this.score);
				this.score.setText("RESET" + this.snake.getLength());
				newSnake();
				newFood();
			}
		});
	}
	
	private void adjustLocation() {
		if(this.snake.getCenterX() < 0) {
			this.snake.setCenterX(GAMEWIDTH);
		}else if(this.snake.getCenterX() > GAMEWIDTH) {
			this.snake.setCenterX(0);
		}
		
		if(this.snake.getCenterY() < 0) {
			this.snake.setCenterY(GAMEHEIGTH);
		}else if(this.snake.getCenterY() > GAMEHEIGTH) {
			this.snake.setCenterY(0);
		}
	}
	
	public void start(Stage primaryStage) throws Exception{
		this.root = new Pane();
		this.root.setPrefSize(GAMEWIDTH, GAMEHEIGTH);
		
		this.score = new Text (0,32,"0");
		this.root.getChildren().add(this.score);
		
		newFood();
		newSnake();
		
		Runnable r = () -> {
			try {
				for(;;) {
					move();
					Thread.sleep(100/1+ this.snake.getLength() / 10);
				}
			}catch(InterruptedException e){
				
			}
		};
		
		Scene scene = new Scene (this.root);
		
		scene.addEventFilter(KeyEvent.KEY_PRESSED, event ->{
			KeyCode code = event.getCode();
			
			if(code == KeyCode.UP) {
				this.snake.setCurvDirection(Direction.UP);
			}else if (code == KeyCode.DOWN) {
				this.snake.setCurvDirection(Direction.DOWN);
			}else if (code == KeyCode.LEFT) {
				this.snake.setCurvDirection(Direction.LEFT);
			}else if (code == KeyCode.RIGHT) {
				this.snake.setCurvDirection(Direction.RIGHT);
			}
		});
		
		primaryStage.setTitle("Snake Game");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
		Thread th = new Thread(r);
		th.setDaemon(true);
		th.start();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}











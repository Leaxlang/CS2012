package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class CardGame extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create a list of card numbers
        ArrayList<Integer> cardNumbers = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            cardNumbers.add(i);
        }

        // Shuffle the card numbers
        Collections.shuffle(cardNumbers);

        // Select the first 7 cards
        ArrayList<Integer> chosenCards = new ArrayList<>(cardNumbers.subList(0, 7));

        // Create a grid pane for the cards
        GridPane gridPane = new GridPane();
        gridPane.setHgap(20);

        // Add the cards to the grid pane
        for (int i = 0; i < 7; i++) {
            ImageView imageView = new ImageView(new Image(new FileInputStream("cards/" + chosenCards.get(i) + ".png")));
            imageView.setFitWidth(80);
            imageView.setFitHeight(100);
            gridPane.add(imageView, i, 0);
        }

        // Create a scene and show the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Card Game");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

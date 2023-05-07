package appGUI;

import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GUIBusyBox extends Application{
	
	static double progress = 0;
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@SuppressWarnings({ "exports" })
	public void start(Stage primaryStage) {
		try {
			StackPane pane = new StackPane();
			VBox vb = new VBox(50);
			HBox hb1 = new HBox(60);
			HBox hb2 = new HBox(60);
			
			vb.setAlignment(Pos.TOP_CENTER);
			hb1.setAlignment(Pos.TOP_CENTER);
			hb2.setAlignment(Pos.BOTTOM_CENTER);
			
			VBox topLeftV = new VBox(20);
			HBox topLeftH1 = new HBox(50);
			HBox topLeftH2 = new HBox();
			
			topLeftV.setAlignment(Pos.CENTER);
			
			Image image = new Image(new FileInputStream("lilyofthevalley.jpg"));
			ImageView viewImage = new ImageView(image);
			FileChooser choose = new FileChooser();
			Button B1 = new Button("Set Image");
			Button B2 = new Button("Choose Image");
			Label L1 = new Label("Image Label");
			
			L1.setFont(new Font(25));
			
			viewImage.setFitWidth(200);
			viewImage.setFitHeight(200);
			B1.setPrefSize(200,200);
			
			B1.setOnAction(event -> {
				try {
					File file = choose.showOpenDialog(primaryStage);
					
					if(getFileExtension(file.toString()).equals("png") || 
							getFileExtension(file.toString()).equals("png") ||
							getFileExtension(file.toString()).equals("jpeg")) 
					{
						
						Image newImage = new Image(new FileInputStream(file));
						ImageView newView = new ImageView(newImage);
						newView.setFitHeight(200);
						newView.setFitWidth(200);
						L1.setText("");
						L1.setGraphic(newView);
				
					} else {
						L1.setText("Not a Pic");
					}
					
					
					} catch (Exception x) {
					x.printStackTrace();
				}
			});
			
			topLeftH1.getChildren().addAll(B1,B2);
			topLeftH2.getChildren().addAll(L1);
			topLeftV.getChildren().addAll(topLeftH1, topLeftH2);
			
			//
			
			VBox topRightV = new VBox(10);
			HBox topRightH1 = new HBox(50);
			HBox topRightH2 = new HBox(100);
			HBox topRightH3 = new HBox(15);
			HBox topRightH4 = new HBox(100);
			
			topRightV.setAlignment(Pos.CENTER);
			
			TextField user = new TextField();
			PasswordField pass = new PasswordField();
			TextArea area = new TextArea();
			Button B3 = new Button("Push Button");
			Label L2 = new Label("Hello");
			Slider y = new Slider(0,5,2.5);
			Slider x = new Slider(0,5,2.5);
			
			y.setOrientation(Orientation.VERTICAL);
			
			area.setPrefHeight(50);
			area.setPrefWidth(150);
			
			L2.scaleXProperty().bind(x.valueProperty());
			L2.scaleYProperty().bind(y.valueProperty());
			
			B3.setOnAction(event -> {
				L2.setText(area.getText());
			});
			
			topRightH1.getChildren().add(user);
			topRightH2.getChildren().addAll(pass, L2);
			topRightH3.getChildren().addAll(area, y);
			topRightH4.getChildren().addAll(B3, x);
			
			topRightV.getChildren().addAll(topRightH1, topRightH2, topRightH3, topRightH4);
			
			//
			VBox bottomLeftV = new VBox(25);
			HBox bottomLeftH1 = new HBox(10);
			HBox bottomLeftH2 = new HBox(20);
			HBox bottomLeftH3 = new HBox(30);
			HBox bottomLeftH4 = new HBox(20);
			
			bottomLeftV.setAlignment(Pos.CENTER);
			bottomLeftH4.setAlignment(Pos.TOP_CENTER);
			
			ToggleGroup tg = new ToggleGroup();
			Rectangle rec = new Rectangle(0,0,20,20);
			Label L3 = new Label("Text");
			Button B4 = new Button("Change Color");
			RadioButton r1 = new RadioButton("Pink");
			RadioButton r2 = new RadioButton("Black");
			RadioButton r3 = new RadioButton("Orange");
			RadioButton r4 = new RadioButton("Sky Blue");
			CheckBox c1 = new CheckBox("Box 1");
			CheckBox c2 = new CheckBox("Box 2");
			CheckBox c3 = new CheckBox("Box 3");
			CheckBox c4 = new CheckBox("Box 4");
			ComboBox<Object> box = new ComboBox<Object>();
			ListView<String> list = new ListView<String>();
			Label L4 = new Label ("Graphics Label");
			
			rec.setFill(Color.DARKSEAGREEN);
			
			r1.setToggleGroup(tg);
			r2.setToggleGroup(tg);
			r3.setToggleGroup(tg);
			r4.setToggleGroup(tg);
			
			B3.setOnAction(event -> {
				RadioButton rb = (RadioButton) tg.getSelectedToggle();
				String color = "Pink";
				
				if(rb != null)
					color = rb.getText();
				
				switch(color) {
				case "Purple":
					rec.setFill(Color.PURPLE);
					break;
				case "Red":
					rec.setFill(Color.RED);
					break;
				case "Silver":
					rec.setFill(Color.SILVER);
					break;
				case "Black":
					rec.setFill(Color.BLACK);
					break;
				default:
					rec.setFill(Color.PINK);
					break;
				}
			});
			
			c1.setOnAction(event -> {
				L3.setText(c1.getText());
			});
			c2.setOnAction(event -> {
				L3.setText(c2.getText());
			});
			c3.setOnAction(event -> {
				L3.setText(c3.getText());
			});
			c4.setOnAction(event -> {
				L3.setText(c4.getText());
			});
			
			L4.setFont(new Font(40));
			
			list.getItems().add("Red");
			list.getItems().add("Orange");
			list.getItems().add("Yellow");
			list.setPrefSize(120, 70);
			
			box.getItems().add("Zero");
			box.getItems().add("Base");
			box.getItems().add("One");
			box.setPrefSize(120, 120);
			
			box.setOnAction(event -> {
				L4.setText((String) box.getValue());
				
				if(list.getSelectionModel().getSelectedItem() != null) {
					switch (list.getSelectionModel().getSelectedItem()) {
					case"Red":
						L4.setTextFill(Color.DARKRED);
						break;
					case "Purple":
						L4.setTextFill(Color.MEDIUMPURPLE);
						break;
					case "Yellow":
						L4.setTextFill(Color.LIGHTGOLDENRODYELLOW);
						break;
					}
				}
			});
			
			bottomLeftH1.getChildren().addAll(rec, r1, r2, r3, r4);
			bottomLeftH2.getChildren().addAll(L3, c1, c2, c3, c4);
			bottomLeftH3.getChildren().addAll(box,list);
			bottomLeftH4.getChildren().addAll(B3, L4);
			
			bottomLeftV.getChildren().addAll(bottomLeftH1, bottomLeftH2, bottomLeftH3, bottomLeftH4);
			
			//
			
			VBox bottomRightV = new VBox(20);
			HBox bottomRightH1 = new HBox(20);
			HBox bottomRightH2 = new HBox(20);
			HBox bottomRightH3 = new HBox(20);
			
			bottomRightV.setAlignment(Pos.CENTER);
			
			TabPane tabPane = new TabPane();
			MenuBar menuBar = new MenuBar();
			Menu menu = new Menu("Menu Bar");
			ToggleGroup toggleGroup = new ToggleGroup();
			ProgressIndicator indicator = new ProgressIndicator();
			ProgressBar bar = new ProgressBar();
			Spinner<Object> spin = new Spinner<Object>(0,100,50);
			RadioMenuItem menuR1 = new RadioMenuItem("Menu 1");
			RadioMenuItem menuR2 = new RadioMenuItem("Menu 2");
			Tab t1 = new Tab("Tab1", new Label("Hot Summer"));
			Tab t2 = new Tab("Tab2", new Label("Jelly Pop"));
			Tab t3 = new Tab("Tab3", new Label("Say My Name"));
			Button Inc = new Button("Increase");
			Button Dec = new Button("Decrease");
			
			Inc.setOnAction(event -> {
				if(progress >= 1)
					progress = 1;
				progress += 0.1;
				bar.setProgress(progress);
				indicator.setProgress(progress);
			});
			
			Dec.setOnAction(event -> {
				if (progress <= 0)
					progress = 0;
				progress -= 0.1;
				bar.setProgress(progress);
				indicator.setProgress(progress);
			});
			
			toggleGroup.getToggles().addAll(menuR1, menuR2);
			
			menu.getItems().addAll(menuR1, menuR2);
			
			menuBar.getMenus().add(menu);
			
			bar.setPrefSize(250, 20);
			bar.setStyle("-fx-accent: lightBlue");
			
			indicator.setStyle("-fx-accent: lightBlue");
			
			tabPane.getTabs().addAll(t1, t2, t3);
			tabPane.setPrefSize(200, 100);
			
			bottomRightH1.getChildren().addAll(menuBar, tabPane);
			bottomRightH2.getChildren().addAll(spin, Dec, Inc);
			bottomRightH3.getChildren().addAll(bar, indicator);
			
			bottomRightV.getChildren().addAll(bottomRightH1, bottomRightH2, bottomRightH3);
			
			//
			
			hb1.getChildren().addAll(topLeftV, topRightV);
			hb2.getChildren().addAll(bottomLeftV, bottomRightV);
			
			vb.getChildren().addAll(hb1, hb2);
			
			pane.getChildren().add(vb);
			pane.setStyle("-fx-background-color: grey");
			
			Scene scene = new Scene(pane, 800, 700);
			primaryStage.setScene(scene);
			primaryStage.setTitle("GUI BusyBox");
			primaryStage.setResizable(false);
			primaryStage.show();
			
			
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getFileExtension(String fullName) {
		if(fullName == null)
			return "NoPic";
		String file = new File(fullName).getName();
		int dotIndex = file.lastIndexOf('.');
		return(dotIndex == -1) ? "No Pic": file.substring(dotIndex + 1);
	}

}

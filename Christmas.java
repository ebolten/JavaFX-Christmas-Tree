package christmas;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Christmas extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane(); // window pane
		
		// merry christmas label
		Label merry = new Label("Merry");
		Label navidad = new Label("Christmas!");
		merry.setPadding(new Insets(10,10,10,45));
		navidad.setPadding(new Insets(10,10,10,85));
		pane.getChildren().addAll(merry,navidad);
				
		// tree itself
		Polygon triangleOne = new Polygon(
				90,30,
				110,60,
				70,60);
		Polygon triangleTwo = new Polygon(
				90,50,
				120,80,
				60,80);
		Polygon triangleThree = new Polygon(
				90,70,
				125,100,
				55,100);
		
		// tree stump
		Rectangle treeStump = new Rectangle(80,100,20,20);
		
		
		// lights on christmas tree
		Circle lightOne = new Circle(95,45,2);
		Circle lightTwo = new Circle(80,50,2);
		Circle lightThree = new Circle(95,85,2);
		Circle lightFour = new Circle(75,75,2);
		Circle lightFive = new Circle(110,95,2);
		Circle lightSix = new Circle(100,65,2);
		Circle lightSeven = new Circle(68,96,2);
		
		// tree colors
		triangleOne.setStroke(Color.BLACK);
		triangleOne.setFill(Color.DARKGREEN);
		triangleTwo.setStroke(Color.BLACK);
		triangleTwo.setFill(Color.DARKGREEN);
		triangleThree.setStroke(Color.BLACK);
		triangleThree.setFill(Color.DARKGREEN);
		treeStump.setStroke(Color.BLACK);
		treeStump.setFill(Color.SADDLEBROWN);
		
		// light colors
		lightOne.setStroke(Color.BLACK);
		lightOne.setFill(Color.RED);
		lightTwo.setStroke(Color.BLACK);
		lightTwo.setFill(Color.CORNFLOWERBLUE);
		lightThree.setStroke(Color.BLACK);
		lightThree.setFill(Color.VIOLET);
		lightFour.setStroke(Color.BLACK);
		lightFour.setFill(Color.SLATEBLUE);
		lightFive.setStroke(Color.BLACK);
		lightFive.setFill(Color.YELLOWGREEN);
		lightSix.setStroke(Color.BLACK);
		lightSix.setFill(Color.BROWN);
		lightSeven.setStroke(Color.BLACK);
		lightSeven.setFill(Color.CRIMSON);
		
		// add tree
		pane.getChildren().addAll(triangleThree,triangleTwo,triangleOne,treeStump);
		
		// add lights
		pane.getChildren().addAll(lightOne,lightTwo,lightThree,lightFour,lightFive,lightSix,lightSeven);
		
		// stage and scene
		Stage stage = new Stage();
		Scene scene = new Scene(pane,200,140);
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		primaryStage.setTitle("Christmas");
		primaryStage.show();
	}

}

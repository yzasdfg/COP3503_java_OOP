/*
 * /
 * Write a program that displays three cards randomly selected from a deck of 52 cards 
 * The card images files are name 1.png, 2.png, 3.png ¡­ 52.png and can be obtained from 
 * the course website. All three cards are distinct and selected randomly.
 * Hint: You can select random cards by storing the numbers 1 ¨C 52 to an arraylist,
 * perform a random shuffle, and use the first three numbers in the arraylist as the files names 
 * for the image.
 * You MUST implement your own random shuffle logic (do NOT use classes/methods directly 
 * from the java utility package)
 * 
 */


/* 
 * @Author: Y.Z.
 * Date: 6/20/2017
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView; 




public class  Project4_PartI extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {


		// Create a HBox
		HBox pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setAlignment(Pos.CENTER);
		ArrayList<Integer> card=new ArrayList<Integer>();

		// get card number after shuffling
		card=getRandCards(card);


		for (int i=0; i<3; i++){
			//create an imagine and image view, set the properties.
			Image image= new Image( "file:card/" + card.get(i) + ".png");
			ImageView view=new ImageView(image);
			view.setFitHeight(150);
			view.setPreserveRatio(true);

			//add the image view to pane		
			pane.getChildren().add(view);
		}


		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("DispThreeCards"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage


	}
	public static void main(String[] args) {
		launch(args);
	}


	// initialize the array list with integer 1-52 as original value, then perform a random shuffle
	private ArrayList<Integer> getRandCards(ArrayList<Integer> card){

		for (int i=0; i<52; i++){
			card.add(i+1);
		}


		for (int i = 51; i >0; i--) {

			int j=(int)(Math.random()*(i+1));
			int temp = card.get(i);
			card.set(i, card.get(j));
			card.set(j, temp);
			
			//or Collections.swap(card,i, j);
		}
		return card;
	}
}



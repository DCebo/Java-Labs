package application;
	
import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
//For event handling
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;


public class Lab3B extends Application {
	
	@Override
	public void start(Stage primaryStage) {
	
		/* 
		 * creating label email
		 */
		//Text text1 = new Text("Email");
		Label text1 = new Label("Where the sum will be");
		
		/*
		 *  creating Text Field for email
		 */
		TextField textField1 = new TextField();
		
		/*
		 *  creating Text Field for password
		 */
		TextField textField2 = new TextField();
		
		/*
		 * Creating Button
		 */
		//Button button1 = new Button("Submit");
		Button button1 = new Button("Add both text fields");
		
		/*
		 * Creating a Grid Pane
		 */
		GridPane gridPane = new GridPane();
		
		/*
		 * Setting size for the pane
		 */
		gridPane.setMinSize(400, 200);
		
		/*
		 * Setting the padding
		 */
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		
		/*
		 * Setting the vertical and horizontal gaps between columns
		 */
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		
		/*
		 * Setting the grid alignment
		 */
		gridPane.setAlignment(Pos.CENTER);
		
		/*
		 * Creating the mouse event handler
		 */
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent click) {
				System.out.println("Hello World");
				int textInt1 = Integer.parseInt(textField1.getText());
				int textInt2 = Integer.parseInt(textField2.getText());
				text1.setText("The sum is: " + (textInt1 + textInt2));

			}
			
		};
		
		/*
		 * Registering the event filter
		 */
		button1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		
		/*
		 * Arranging all the nodes in the grid
		 */
		gridPane.add(text1, 0, 0);	
		gridPane.add(textField1, 1, 0);	
		//gridPane.add(text2, 0, 1);	
		gridPane.add(textField2, 1, 1);	
		//gridPane.add(label, 0, 4);	// Add label to the grid.
		gridPane.add(button1, 0, 2);	
		//gridPane.add(button2, 0, 0);	
		
		/*
		 * Creating a scene object
		 */
		Scene scene = new Scene(gridPane);
		
		/*
		 * Setting a title to the Stage
		 */
		primaryStage.setTitle("Grid Pane Example");
		
		/*
		 * Adding a scene to the stage
		 */
		primaryStage.setScene(scene);
		
		/*
		 * Displaying the contents of the stage
		 */
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

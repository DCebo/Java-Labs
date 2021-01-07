
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


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		GridPane grid = new GridPane();
		
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		Button button4 = new Button("Button 4");
		Button button5 = new Button("Button 5");
		Button button6 = new Button("Button 6");
		
		button1.setMaxWidth(150);
		button1.setMaxHeight(50);
		button2.setMaxWidth(150);
		button2.setMaxHeight(50);
		button3.setMaxWidth(150);
		button3.setMaxHeight(50);
		button4.setMaxWidth(150);
		button4.setMaxHeight(50);
		button5.setMaxWidth(150);
		button5.setMaxHeight(50);
		button6.setMaxWidth(150);
		button6.setMaxHeight(50);

		//Event handler before adding button to grid so buttons are fully
		//set up and do not have to change or add to grid later after changing button
		
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
		
			@Override
			public void handle(MouseEvent click) {
				System.out.println("Clicked " + click.getSource());
				System.out.println("Clicked " + click.getSource().getClass().getName());

			}
			
		};
		
		button1.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
		button2.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
		button3.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
		button4.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
		button5.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
		button6.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

		grid.add(button1, 0, 0); //(button, column, row)
		grid.add(button2, 1, 0);
		grid.add(button3, 2, 0);
		grid.add(button4, 0, 1);
		grid.add(button5, 1, 1);
		grid.add(button6, 2, 1);
		
		grid.setVgap(10);
		grid.setHgap(10);
		
		//Creating a scene
		Scene scene = new Scene(grid);
		
		//Setting title to the stage
		primaryStage.setTitle("Grid Pane Example");
		//Adding scene to the stage
		primaryStage.setScene(scene);
		//Displaying contents of the stage
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
}

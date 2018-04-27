/**Koopa
 * 
 */
package application;

import application.controller.GameController;
import application.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


/**start: Gets Start.fxml and sets the scene 
 *with it.
 *@param primaryStage
 */
public class Main extends Application {
	public static Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			AnchorPane root = new AnchorPane();
			root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
			Scene scene = new Scene(root);
			scene.setOnKeyPressed( new GameController() );
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**main: launches the arguments.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

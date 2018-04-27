/**koopa
 * 
 */
package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import application.Main;

public class MainController implements EventHandler<ActionEvent> {

	@FXML
	Button buttonPlay;
	@FXML
	Button buttonHelp;
	@FXML
	Button buttonExit;
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == buttonPlay){
			try {
				AnchorPane root = new AnchorPane();
				root = FXMLLoader.load(getClass().getResource("/Game.fxml"));
				Scene scene = new Scene(root);
				scene.setOnKeyPressed( new GameController() );
				//scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				Main.stage.setScene(scene);
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(event.getSource() == buttonHelp){
			try {
				AnchorPane root = new AnchorPane();
				root = FXMLLoader.load(getClass().getResource("/Help.fxml"));
				Scene scene = new Scene(root);
				//scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				Main.stage.setScene(scene);
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(event.getSource() == buttonExit)
			Main.stage.close();
		
		// TODO Auto-generated method stub
		
	}

}

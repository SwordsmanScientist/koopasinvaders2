package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class GameController implements EventHandler<KeyEvent>{
   
	@FXML
	ImageView marioID;
	@FXML
	ImageView bowserID;
	@Override
	public void handle(KeyEvent event) {
		// S, L, R, P
		String key = event.getCode().toString();
		System.out.println(key);
		
		if(key.equals("LEFT") || key.equals("A"))
			System.out.println(key);
			//Move model left
		else if(key.equals("RIGHT") || key.equals("D"))
			//move model right
			System.out.println(key);
		else if(key.equals("SPACE"))
			System.out.println(key);
			//Fire player.fire()
		else if(key.equals("P"))
			System.out.println(key);
		else if(key.equals("ESC"))
			System.out.println(key);
			//Unpause
		//Pause or unpause
			
		// TODO Auto-generated method stub
		
	}
}

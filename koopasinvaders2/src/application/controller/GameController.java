package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameController implements EventHandler<KeyEvent>, Initializable{
   
	@FXML
	ImageView marioId;
	@FXML
	ImageView bowserId;
	@FXML
	AnchorPane pane;
	
	@Override
	public void handle(KeyEvent event) {
		System.out.println("Hello?");
		// S, L, R, P
		String key = event.getCode().toString();
		System.out.println(key+"works");
		
		if(key.equals("LEFT") || key.equals("A"))
			updateImageView('L');
		else if(key.equals("RIGHT") || key.equals("D"))
			updateImageView('R');
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
	
	public void updateImageView(char c) {
		if(marioId == null)
			System.out.println("\n\nnull");
		double dx = marioId.getLayoutX();
		if(c=='R')
			marioId.setLayoutX(dx+3);
		else if(c=='L')
			marioId.setLayoutX(dx-3);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Main.stage.getScene().getRoot().requestFocus();
		marioId = new ImageView("/mario.png");
		//marioId.setImage(image1);
		marioId.setLayoutX(280.0);
		marioId.setLayoutY(341.0);
		
		/*
		Scene scene = (Main.stage.getScene());
		scene.addEventFilter(KeyEvent.ANY, keyEvent -> {
            System.out.println(keyEvent);
        });
		
		scene.setOnKeyPressed(e -> {
		    if (e.getCode() == KeyCode.A) {
		        System.out.println("A key was pressed");
		    }
		});
		
		
	
		Main.stage.setScene(scene);
	    //Main.stage.show();
		/*
		
		System.out.println("gtgrtgtg\n");
		Scene scene = (Main.stage.getScene());
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				String key = event.getCode().toString();
				System.out.println(key+"works");
			if(key.equals("LEFT") || key.equals("A"))
				updateImageView('L');
			else if(key.equals("RIGHT") || key.equals("D"))
				updateImageView('R');
			else if(key.equals("SPACE"))
				System.out.println(key);
				//Fire player.fire()
			else if(key.equals("P"))
				System.out.println(key);
			else if(key.equals("ESC"))
				System.out.println(key);
			}  
        });
		
		/*
		scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @SuppressWarnings("incomplete-switch")
			@Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                case UP:    goNorth = false; break;
                case DOWN:  goSouth = false; break;
                case SPACE: shoot = false;   break;
                case ENTER: menu = false; break;
                }
            }
        }); 
		
		Main.stage.setScene(scene);
	    Main.stage.show(); */
		// TODO Auto-generated method stub
		
	}


}

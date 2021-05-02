package FXML_Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Algorithms_for_the_game.Generat_Dice_number_both;
import MediaClass.PlayNewMedia;
import Rules_Of_The_game.PlayerArea;
import application.Main;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PoPupPage extends Main implements Initializable{
	@FXML
    private JFXButton Button_Yes;

    @FXML
    private JFXButton Button_No;

    @FXML
    private Label PopUp_Label;
    PlayerArea Gamer[] = new PlayerArea[9];
    Image image = new Image("/images/Owned_A.png");
    PlayNewMedia player = new PlayNewMedia();
    
    @Override
	public void initialize(URL location, ResourceBundle arg1) {
    	PopUp_Label.setText(Static_PopUp_Label.getText());
    	Gamer[1]=Gamer1;
    	Gamer[2]=Gamer2;
    	Gamer[3]=Gamer3;
    	Gamer[4]=Gamer4;
    	Gamer[5]=Gamer5;
    	Gamer[6]=Gamer6;
    	Gamer[7]=Gamer7;
    	Gamer[8]=Gamer8;
    	PopUp_Label.setFocusTraversable(true);
    }
    
    @FXML
    void Click_ON_NO(MouseEvent event) {
    	((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    	
    }
    String images_source[]= {null,"/images/Owned_A.png","/images/Owned_B.png","/images/Owned_C.png","/images/Owned_D.png","/images/Owned_E.png","/images/Owned_F.png"
    						,"/images/Owned_G.png","/images/Owned_H.png"};

    @FXML
    void Click_On_Yes(MouseEvent event) {
    	Gamer[player_turn].setPlayer_amount(Gamer[player_turn].getPlayer_amount()-Main.Building_price);
    	Gamer[player_turn].getLabel_amount().setText(String.valueOf(Gamer[player_turn].getPlayer_amount())+" $");
    	for(int i=1;i<=40;i++) {
    		if(static_player_place==i) {
    			Gamer[player_turn].getPlayers_owned_places()[static_player_place]=true;
    			image = new Image(images_source[player_turn]);
    			images_owned_buildings[i].setImage(image);
    			images_owned_buildings[i].setVisible(true);
		        FadeTransition transition = new FadeTransition(Duration.millis(100), Gamer[player_turn].getLabel_amount());
		        transition.setFromValue(1);
		        transition.setToValue(0);
		        transition.setCycleCount(12);
		        transition.setAutoReverse(true);
		        transition.play();
		        player = new PlayNewMedia("/sound/Yes Buy.mp3");
		        player.run();
    		}
    	}
    	((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    	
    	

    }
    

}

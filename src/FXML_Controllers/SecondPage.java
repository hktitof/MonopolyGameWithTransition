package FXML_Controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;

import Algorithms_for_the_game.Generat_Dice_number_both;
import MediaClass.PlayNewMedia;
import Rules_Of_The_game.Instanciate_Owned_Places_To_False;
import Rules_Of_The_game.PlayerArea;
import Transitions.ChangeDiceNumber;
import Transitions.DiceTransition;
import Transitions.DominoTransitions;
import Transitions.FadeTransitionClass;
import Transitions.FadetransitionOnetime;
import Transitions.ITransitionStrategy;
import Transitions.PauseTransitionClass;
import Transitions.ScaleTransitionClass;
import Transitions.TranslateTransitionClass;
import application.Main;
import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.scene.input.MouseEvent;

public class SecondPage extends Main implements Initializable{
	
									///Players Information
	@FXML
    private Label Label_player1;

    @FXML
    private Label Label_Amount_player1;

    @FXML
    private Label Label_player1_Amount;

    @FXML
    private Label Label_player2;

    @FXML
    private Label Label_Amount_player2;

    @FXML
    private Label Label_player2_Amount;

    @FXML
    private Label Label_player3;

    @FXML
    private Label Label_Amount_player3;

    @FXML
    private Label Label_player3_Amount;

    @FXML
    private Label Label_player4;

    @FXML
    private Label Label_Amount_player4;

    @FXML
    private Label Label_player4_Amount;

    @FXML
    private Label Label_player5;

    @FXML
    private Label Label_Amount_player5;

    @FXML
    private Label Label_player5_Amount;

    @FXML
    private Label Label_player6;

    @FXML
    private Label Label_Amount_player6;

    @FXML
    private Label Label_player6_Amount;

    @FXML
    private Label Label_player7;

    @FXML
    private Label Label_Amount_player7;

    @FXML
    private Label Label_player7_Amount;

    @FXML
    private Label Label_player8;

    @FXML
    private Label Label_Amount_player8;

    @FXML
    private Label Label_player8_Amount;

    @FXML
    private Line Line_Player1;

    @FXML
    private Line Line_Player2;

    @FXML
    private Line Line_Player3;

    @FXML
    private Line Line_Player4;

    @FXML
    private Line Line_Player5;

    @FXML
    private Line Line_Player6;

    @FXML
    private Line Line_Player7;

    @FXML
    private ImageView Player1_smbole;

    @FXML
    private ImageView Player2_smbole;

    @FXML
    private ImageView Player3_smbole;

    @FXML
    private ImageView Player4_smbole;

    @FXML
    private ImageView Player5_smbole;

    @FXML
    private ImageView Player6_smbole;

    @FXML
    private ImageView Player7_smbole;

    @FXML
    private ImageView Player8_smbole;

    @FXML
    private JFXTextField textfield_player1;

    @FXML
    private JFXTextField textfield_player2;

    @FXML
    private JFXTextField textfield_player3;

    @FXML
    private JFXTextField textfield_player4;

    @FXML
    private JFXTextField textfield_player5;

    @FXML
    private JFXTextField textfield_player6;

    @FXML
    private JFXTextField textfield_player7;

    @FXML
    private JFXTextField textfield_player8;

    @FXML
    private ImageView Domino_A;

    @FXML
    private ImageView Domino_B;

    @FXML
    private ImageView Domino_C;

    @FXML
    private ImageView Domino_D;

    @FXML
    private ImageView Domino_E;

    @FXML
    private ImageView Domino_F;

    @FXML
    private ImageView Domino_G;

    @FXML
    private ImageView Domino_H;

    @FXML
    private TextField textfied_getX;

    @FXML
    private Button Button_id;

    @FXML
    private Label label_position;

    @FXML
    private ImageView Dice_var1;

    @FXML
    private ImageView Dice_var2;

    @FXML
    private ImageView Dice1;

    @FXML
    private ImageView Dice2;

    @FXML
    private ImageView Dice3;

    @FXML
    private ImageView Dice4;

    @FXML
    private ImageView Dice5;

    @FXML
    private ImageView Dice6;

    @FXML
    private ImageView Arrow_1;

    @FXML
    private ImageView Arrow_2;

    @FXML
    private ImageView Arrow_3;

    @FXML
    private ImageView Arrow_4;

    @FXML
    private ImageView Arrow_5;

    @FXML
    private ImageView Arrow_6;

    @FXML
    private ImageView Arrow_7;

    @FXML
    private ImageView Arrow_8;

    @FXML
    private ImageView Area_2;

    @FXML
    private ImageView Area_4;

    @FXML
    private ImageView Area_7;

    @FXML
    private ImageView Area_9;

    @FXML
    private ImageView Area_10;

    @FXML
    private ImageView Area_22;

    @FXML
    private ImageView Area_24;

    @FXML
    private ImageView Area_25;

    @FXML
    private ImageView Area_27;

    @FXML
    private ImageView Area_28;

    @FXML
    private ImageView Area_30;

    @FXML
    private ImageView Area_32;

    @FXML
    private ImageView Area_33;

    @FXML
    private ImageView Area_35;

    @FXML
    private ImageView Area_38;

    @FXML
    private ImageView Area_40;

    @FXML
    private ImageView Area_12;

    @FXML
    private ImageView Area_14;

    @FXML
    private ImageView Area_15;

    @FXML
    private ImageView Area_17;

    @FXML
    private ImageView Area_19;

    @FXML
    private ImageView Area_20;
    										//// END
    
    
    public static int number_of_players;
    public static int Place_Domino_A=1;
    public static int Place_Domino_B=1;
    public static int Place_Domino_C=1;
    public static int Place_Domino_D=1;
    public static int Place_Domino_E=1;
    public static int Place_Domino_F=1;
    public static int Place_Domino_G=1;
    public static int Place_Domino_H=1;
    
    
    
    private int mouse_click_on_Dice=0;
    private int get_two_genereated_number_array[]=new int[2];
    public static int player_loop=0;
    
    
    void set_Domino_New_Place() {
    	Place_Domino_A=Place_Domino_A+Integer.parseInt(textfied_getX.getText().toString());
    	if(Place_Domino_A>40) {
    		Place_Domino_A=Place_Domino_A-40;
    	}
    	label_position.setText(String.valueOf(Place_Domino_A));
    }
    
    private int duration_time_in_millis=200;
    private Duration object_dur=new Duration(this.duration_time_in_millis);
    TranslateTransition trans = new TranslateTransition(this.object_dur, Domino_A);
    DiceTransition trans_dice = new DiceTransition();;
    
    @FXML
    void Butoon_click(ActionEvent event) {
    	DominoTransitions Move_Domino_obj = new DominoTransitions(Domino_A,Place_Domino_A,Integer.parseInt(textfied_getX.getText().toString()));
    	Move_Domino_obj.run();
    	set_Domino_New_Place();
    	System.out.println(String.valueOf(Place_Domino_A));
    	Dice_var1.setImage(Dice1.getImage());
    	Dice_var2.setImage(Dice3.getImage());
    	
    	
    }
    
    @Override
	public void initialize(URL location, ResourceBundle arg1) {
    	number_of_players=Main.players_number;
    	Determination_players(Main.players_number,Main.players_amount);
    	label_position.setText(String.valueOf(Place_Domino_A));
    	Dice_var1.setImage(Dice1.getImage());
    	Dice_var2.setImage(Dice3.getImage());
    	this.mouse_click_on_Dice=0;
    	Setup_Arrow();
    	images_owned_buildings[2]=Area_2;
    	images_owned_buildings[4]=Area_4;
    	images_owned_buildings[7]=Area_7;
    	images_owned_buildings[9]=Area_9;
    	images_owned_buildings[10]=Area_10;
    	images_owned_buildings[22]=Area_22;
    	images_owned_buildings[24]=Area_24;
    	images_owned_buildings[25]=Area_25;
    	images_owned_buildings[27]=Area_27;
    	images_owned_buildings[28]=Area_28;
    	images_owned_buildings[30]=Area_30;
    	images_owned_buildings[32]=Area_32;
    	images_owned_buildings[33]=Area_33;
    	images_owned_buildings[35]=Area_35;
    	images_owned_buildings[38]=Area_38;
    	images_owned_buildings[40]=Area_40;
    	images_owned_buildings[12]=Area_12;
    	images_owned_buildings[14]=Area_14;
    	images_owned_buildings[15]=Area_15;
    	images_owned_buildings[17]=Area_17;
    	images_owned_buildings[19]=Area_19;
    	images_owned_buildings[20]=Area_20;
    	
		
    	
    	
    	
    }
    
    @FXML
    void Click_Dice_1(MouseEvent event) {
    	if(this.mouse_click_on_Dice<10) {
    		this.mouse_click_on_Dice=this.mouse_click_on_Dice+1;
    	}else {
    		this.mouse_click_on_Dice=1;
    	}
    	trans_dice = new DiceTransition(Dice_var1,Dice_var2,this.mouse_click_on_Dice);;
    	trans_dice.run();
    	ChangeDiceNumber changeDiceObj = new ChangeDiceNumber(Dice1, Dice2, Dice3, Dice4, Dice5, Dice6, Dice_var1, Dice_var2);
    	changeDiceObj.run();
    	Generat_Dice_number_both generate_number= new Generat_Dice_number_both(Dice1, Dice2, Dice3, Dice4, Dice5, Dice6, Dice_var1, Dice_var2,Domino_A);
    	generate_number.run();
    	
    	
    	
    }

    @FXML
    void Click_Dice_2(MouseEvent event) {
    	Click_Dice_1(event);
    }
    
    void Setup_Arrow() {
    	//Arrow 1
    	FadeTransition Arrow_slap = new FadeTransition(Duration.millis(100), Arrow_1);
    	Arrow_slap.setFromValue(1);
    	Arrow_slap.setToValue(0);
    	Arrow_slap.setCycleCount(FadeTransition.INDEFINITE);
    	Arrow_slap.setAutoReverse(true);
    	Arrow_slap.play();
    	//Arrow 2
    	Arrow_slap = new FadeTransition(Duration.millis(100), Arrow_2);
    	Arrow_slap.setFromValue(1);
    	Arrow_slap.setToValue(0);
    	Arrow_slap.setCycleCount(FadeTransition.INDEFINITE);
    	Arrow_slap.setAutoReverse(true);
    	Arrow_slap.play();
    	//Arrow 3
    	Arrow_slap = new FadeTransition(Duration.millis(100), Arrow_3);
    	Arrow_slap.setFromValue(1);
    	Arrow_slap.setToValue(0);
    	Arrow_slap.setCycleCount(FadeTransition.INDEFINITE);
    	Arrow_slap.setAutoReverse(true);
    	Arrow_slap.play();
    	//Arrow 4
    	Arrow_slap = new FadeTransition(Duration.millis(100), Arrow_4);
    	Arrow_slap.setFromValue(1);
    	Arrow_slap.setToValue(0);
    	Arrow_slap.setCycleCount(FadeTransition.INDEFINITE);
    	Arrow_slap.setAutoReverse(true);
    	Arrow_slap.play();
    	//Arrow 5
    	Arrow_slap = new FadeTransition(Duration.millis(100), Arrow_5);
    	Arrow_slap.setFromValue(1);
    	Arrow_slap.setToValue(0);
    	Arrow_slap.setCycleCount(FadeTransition.INDEFINITE);
    	Arrow_slap.setAutoReverse(true);
    	Arrow_slap.play();
    	//Arrow 6
    	Arrow_slap = new FadeTransition(Duration.millis(100), Arrow_6);
    	Arrow_slap.setFromValue(1);
    	Arrow_slap.setToValue(0);
    	Arrow_slap.setCycleCount(FadeTransition.INDEFINITE);
    	Arrow_slap.setAutoReverse(true);
    	Arrow_slap.play();
    	//Arrow 7
    	Arrow_slap = new FadeTransition(Duration.millis(100), Arrow_7);
    	Arrow_slap.setFromValue(1);
    	Arrow_slap.setToValue(0);
    	Arrow_slap.setCycleCount(FadeTransition.INDEFINITE);
    	Arrow_slap.setAutoReverse(true);
    	Arrow_slap.play();
    	//Arrow 8
    	Arrow_slap = new FadeTransition(Duration.millis(100), Arrow_8);
    	Arrow_slap.setFromValue(1);
    	Arrow_slap.setToValue(0);
    	Arrow_slap.setCycleCount(FadeTransition.INDEFINITE);
    	Arrow_slap.setAutoReverse(true);
    	Arrow_slap.play();
    	
    }
    
	
    @FXML
    void Click_On_Player1(MouseEvent event) {
    	Click_On_image_under_players_info(event);
    	Label_player1.setVisible(false);
    	textfield_player1.setVisible(true);
    	textfield_player1.setText(Label_player1.getText());

    }

    @FXML
    void Click_On_Player2(MouseEvent event) {
    	Click_On_image_under_players_info(event);
    	Label_player2.setVisible(false);
    	textfield_player2.setVisible(true);
    	textfield_player2.setText(Label_player2.getText());
    }

    @FXML
    void Click_On_Player3(MouseEvent event) {
    	Click_On_image_under_players_info(event);
    	Label_player3.setVisible(false);
    	textfield_player3.setVisible(true);
    	textfield_player3.setText(Label_player3.getText());
    }

    @FXML
    void Click_On_Player4(MouseEvent event) {
    	Click_On_image_under_players_info(event);
    	Label_player4.setVisible(false);
    	textfield_player4.setVisible(true);
    	textfield_player4.setText(Label_player4.getText());
    }

    @FXML
    void Click_On_Player5(MouseEvent event) {
    	Click_On_image_under_players_info(event);
    	Label_player5.setVisible(false);
    	textfield_player5.setVisible(true);
    	textfield_player5.setText(Label_player5.getText());	
    }

    @FXML
    void Click_On_Player6(MouseEvent event) {
    	Click_On_image_under_players_info(event);
    	Label_player6.setVisible(false);
    	textfield_player6.setVisible(true);
    	textfield_player6.setText(Label_player6.getText());
    }

    @FXML
    void Click_On_Player7(MouseEvent event) {
    	Click_On_image_under_players_info(event);
    	Label_player7.setVisible(false);
    	textfield_player7.setVisible(true);
    	textfield_player7.setText(Label_player7.getText());
    }

    @FXML
    void Click_On_Player8(MouseEvent event) {
    	Label_player8.setVisible(false);
    	textfield_player8.setVisible(true);
    	textfield_player8.setText(Label_player8.getText());
    }
    @FXML
    void Click_On_image_under_players_info(MouseEvent event) {
    	// Don't use Else because we have to make sure that all txtfield is disabled
    	if(textfield_player1.isVisible()) {
    		//player1
    		Label_player1.setVisible(true);
        	Label_player1.setText(textfield_player1.getText());
        	textfield_player1.setVisible(false);
    	}if(textfield_player2.isVisible()){
    		//player2
    		Label_player2.setVisible(true);
        	Label_player2.setText(textfield_player2.getText());
        	textfield_player2.setVisible(false);
    		
    	}if(textfield_player3.isVisible()){
    		//player3
    		Label_player3.setVisible(true);
        	Label_player3.setText(textfield_player3.getText());
        	textfield_player3.setVisible(false);
    	}if(textfield_player4.isVisible()){
    		//player4
    		Label_player4.setVisible(true);
        	Label_player4.setText(textfield_player4.getText());
        	textfield_player4.setVisible(false);
    	}if(textfield_player5.isVisible()){
    		//player5
    		Label_player5.setVisible(true);
        	Label_player5.setText(textfield_player5.getText());
        	textfield_player5.setVisible(false);
    	}if(textfield_player6.isVisible()){
    		//player6
    		Label_player6.setVisible(true);
        	Label_player6.setText(textfield_player6.getText());
        	textfield_player6.setVisible(false);
    	}if(textfield_player7.isVisible()){
    		//player7
    		Label_player7.setVisible(true);
        	Label_player7.setText(textfield_player7.getText());
        	textfield_player7.setVisible(false);
    	}if(textfield_player8.isVisible()){
    		//player8
    		Label_player8.setVisible(true);
        	Label_player8.setText(textfield_player8.getText());
        	textfield_player8.setVisible(false);
    	}
    	


    }
	@FXML
    void Click_On_Back(MouseEvent event) {
		player_loop=0;
		root.setVisible(true);
		root.setOpacity(1);
		((Stage)(((ImageView)event.getSource()).getScene().getWindow())).close();
		FadeTransition trans1 = new FadeTransition(Duration.seconds(1), root);
        trans1.setFromValue(0);
        trans1.setToValue(1);
        trans1.play();
    }
	
	Instanciate_Owned_Places_To_False setting_places = new Instanciate_Owned_Places_To_False();
	void Determination_players(int number_of_players,int amount) {
		switch (number_of_players) {
		case 3:
			Gamer1= new PlayerArea("Player 1",Main.players_amount,Domino_A,Arrow_1,1,Label_player1_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer1);
			Gamer2= new PlayerArea("Player 2",Main.players_amount,Domino_B,Arrow_2,1,Label_player2_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer2);
			Gamer3= new PlayerArea("Player 3",Main.players_amount,Domino_C,Arrow_3,1,Label_player3_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer3);
			System.out.println("GAmer 3 succefully instantiated");
			Label_player1.setVisible(true);
			Label_Amount_player1.setVisible(true);
			Label_player1_Amount.setVisible(true);
			Label_player1_Amount.setText(String.valueOf(amount)+" $");
			Player1_smbole.setVisible(true);
			Line_Player1.setVisible(true);
			Arrow_1.setVisible(true);
											//player2
			Label_player2.setVisible(true);
			Label_Amount_player2.setVisible(true);
			Label_player2_Amount.setVisible(true);
			Label_player2_Amount.setText(String.valueOf(amount)+" $");
			Player2_smbole.setVisible(true);
			Line_Player2.setVisible(true);
			Arrow_2.setVisible(false);
			//player3
			Label_player3.setVisible(true);
			Label_Amount_player3.setVisible(true);
			Label_player3_Amount.setVisible(true);
			Label_player3_Amount.setText(String.valueOf(amount)+" $");
			Player3_smbole.setVisible(true);
			Line_Player3.setVisible(true);
			Arrow_3.setVisible(false);
			//player4
			Label_player4.setVisible(false);
			Label_Amount_player4.setVisible(false);
			Label_player4_Amount.setVisible(false);
			Player4_smbole.setVisible(false);
			Line_Player4.setVisible(false);
			Arrow_4.setVisible(false);
			//player5
			Label_player5.setVisible(false);
			Label_Amount_player5.setVisible(false);
			Label_player5_Amount.setVisible(false);
			Player5_smbole.setVisible(false);
			Line_Player5.setVisible(false);
			Arrow_5.setVisible(false);
			//player6
			Label_player6.setVisible(false);
			Label_Amount_player6.setVisible(false);
			Label_player6_Amount.setVisible(false);
			Player6_smbole.setVisible(false);
			Line_Player6.setVisible(false);
			Arrow_6.setVisible(false);
			//player7
			Label_player7.setVisible(false);
			Label_Amount_player7.setVisible(false);
			Label_player7_Amount.setVisible(false);
			Player7_smbole.setVisible(false);
			Line_Player7.setVisible(false);
			Arrow_7.setVisible(false);
			//player8
			Label_player8.setVisible(false);
			Label_Amount_player8.setVisible(false);
			Label_player8_Amount.setVisible(false);
			Player8_smbole.setVisible(false);
			Arrow_8.setVisible(false);
		break;
		case 4:
			Gamer1= new PlayerArea("Player 1",Main.players_amount,Domino_A,Arrow_1,1,Label_player1_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer1);
			Gamer2= new PlayerArea("Player 2",Main.players_amount,Domino_B,Arrow_2,1,Label_player2_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer2);
			Gamer3= new PlayerArea("Player 3",Main.players_amount,Domino_C,Arrow_3,1,Label_player3_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer3);
			Gamer4= new PlayerArea("Player 4",Main.players_amount,Domino_D,Arrow_4,1,Label_player4_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer4);
			Label_player1.setVisible(true);
			Label_Amount_player1.setVisible(true);
			Label_player1_Amount.setVisible(true);
			Label_player1_Amount.setText(String.valueOf(amount)+" $");
			Player1_smbole.setVisible(true);
			Line_Player1.setVisible(true);
			Arrow_1.setVisible(true);
											//player2
			Label_player2.setVisible(true);
			Label_Amount_player2.setVisible(true);
			Label_player2_Amount.setVisible(true);
			Label_player2_Amount.setText(String.valueOf(amount)+" $");
			Player2_smbole.setVisible(true);
			Line_Player2.setVisible(true);
			Arrow_2.setVisible(false);
			//player3
			Label_player3.setVisible(true);
			Label_Amount_player3.setVisible(true);
			Label_player3_Amount.setVisible(true);
			Label_player3_Amount.setText(String.valueOf(amount)+" $");
			Player3_smbole.setVisible(true);
			Line_Player3.setVisible(true);
			Arrow_3.setVisible(false);
			//player4
			Label_player4.setVisible(true);
			Label_Amount_player4.setVisible(true);
			Label_player4_Amount.setVisible(true);
			Label_player4_Amount.setText(String.valueOf(amount)+" $");
			Player4_smbole.setVisible(true);
			Line_Player4.setVisible(true);
			Arrow_4.setVisible(false);
			//player5
			Label_player5.setVisible(false);
			Label_Amount_player5.setVisible(false);
			Label_player5_Amount.setVisible(false);
			Player5_smbole.setVisible(false);
			Line_Player5.setVisible(false);
			Arrow_5.setVisible(false);
			//player6
			Label_player6.setVisible(false);
			Label_Amount_player6.setVisible(false);
			Label_player6_Amount.setVisible(false);
			Player6_smbole.setVisible(false);
			Line_Player6.setVisible(false);
			Arrow_6.setVisible(false);
			//player7
			Label_player7.setVisible(false);
			Label_Amount_player7.setVisible(false);
			Label_player7_Amount.setVisible(false);
			Player7_smbole.setVisible(false);
			Line_Player7.setVisible(false);
			Arrow_7.setVisible(false);
			//playr8
			Label_player8.setVisible(false);
			Label_Amount_player8.setVisible(false);
			Label_player8_Amount.setVisible(false);
			Player8_smbole.setVisible(false);
			Arrow_8.setVisible(false);
			break;
		case 5:
			Gamer1= new PlayerArea("Player 1",Main.players_amount,Domino_A,Arrow_1,1,Label_player1_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer1);
			Gamer2= new PlayerArea("Player 2",Main.players_amount,Domino_B,Arrow_2,1,Label_player2_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer2);
			Gamer3= new PlayerArea("Player 3",Main.players_amount,Domino_C,Arrow_3,1,Label_player3_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer3);
			Gamer4= new PlayerArea("Player 4",Main.players_amount,Domino_D,Arrow_4,1,Label_player4_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer4);
			Gamer5= new PlayerArea("Player 5",Main.players_amount,Domino_E,Arrow_5,1,Label_player5_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer5);
			Label_player1.setVisible(true);
			Label_Amount_player1.setVisible(true);
			Label_player1_Amount.setVisible(true);
			Label_player1_Amount.setText(String.valueOf(amount)+" $");
			Player1_smbole.setVisible(true);
			Line_Player1.setVisible(true);
			Arrow_1.setVisible(true);
											//player2
			Label_player2.setVisible(true);
			Label_Amount_player2.setVisible(true);
			Label_player2_Amount.setVisible(true);
			Label_player2_Amount.setText(String.valueOf(amount)+" $");
			Player2_smbole.setVisible(true);
			Line_Player2.setVisible(true);
			Arrow_2.setVisible(false);
			//player3
			Label_player3.setVisible(true);
			Label_Amount_player3.setVisible(true);
			Label_player3_Amount.setVisible(true);
			Label_player3_Amount.setText(String.valueOf(amount)+" $");
			Player3_smbole.setVisible(true);
			Line_Player3.setVisible(true);
			Arrow_3.setVisible(false);
			//player4
			Label_player4.setVisible(true);
			Label_Amount_player4.setVisible(true);
			Label_player4_Amount.setVisible(true);
			Label_player4_Amount.setText(String.valueOf(amount)+" $");
			Player4_smbole.setVisible(true);
			Line_Player4.setVisible(true);
			Arrow_4.setVisible(false);
			//player5
			Label_player5.setVisible(true);
			Label_Amount_player5.setVisible(true);
			Label_player5_Amount.setVisible(true);
			Label_player5_Amount.setText(String.valueOf(amount)+" $");
			Player5_smbole.setVisible(true);
			Line_Player5.setVisible(true);
			Arrow_5.setVisible(false);
			//player6
			Label_player6.setVisible(false);
			Label_Amount_player6.setVisible(false);
			Label_player6_Amount.setVisible(false);
			Player6_smbole.setVisible(false);
			Line_Player6.setVisible(false);
			Arrow_6.setVisible(false);
			//player7
			Label_player7.setVisible(false);
			Label_Amount_player7.setVisible(false);
			Label_player7_Amount.setVisible(false);
			Player7_smbole.setVisible(false);
			Line_Player7.setVisible(false);
			Arrow_7.setVisible(false);
			//playr8
			Label_player8.setVisible(false);
			Label_Amount_player8.setVisible(false);
			Label_player8_Amount.setVisible(false);
			Player8_smbole.setVisible(false);
			Arrow_8.setVisible(false);
			break;
		case 6:
			Gamer1= new PlayerArea("Player 1",Main.players_amount,Domino_A,Arrow_1,1,Label_player1_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer1);
			Gamer2= new PlayerArea("Player 2",Main.players_amount,Domino_B,Arrow_2,1,Label_player2_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer2);
			Gamer3= new PlayerArea("Player 3",Main.players_amount,Domino_C,Arrow_3,1,Label_player3_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer3);
			Gamer4= new PlayerArea("Player 4",Main.players_amount,Domino_D,Arrow_4,1,Label_player4_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer4);
			Gamer5= new PlayerArea("Player 5",Main.players_amount,Domino_E,Arrow_5,1,Label_player5_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer5);
			Gamer6= new PlayerArea("Player 6",Main.players_amount,Domino_F,Arrow_6,1,Label_player6_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer6);
			Label_player1.setVisible(true);
			Label_Amount_player1.setVisible(true);
			Label_player1_Amount.setVisible(true);
			Label_player1_Amount.setText(String.valueOf(amount)+" $");
			Player1_smbole.setVisible(true);
			Line_Player1.setVisible(true);
			Arrow_1.setVisible(true);
											//player2
			Label_player2.setVisible(true);
			Label_Amount_player2.setVisible(true);
			Label_player2_Amount.setVisible(true);
			Label_player2_Amount.setText(String.valueOf(amount)+" $");
			Player2_smbole.setVisible(true);
			Line_Player2.setVisible(true);
			Arrow_2.setVisible(false);
			//player3
			Label_player3.setVisible(true);
			Label_Amount_player3.setVisible(true);
			Label_player3_Amount.setVisible(true);
			Label_player3_Amount.setText(String.valueOf(amount)+" $");
			Player3_smbole.setVisible(true);
			Line_Player3.setVisible(true);
			Arrow_3.setVisible(false);
			//player4
			Label_player4.setVisible(true);
			Label_Amount_player4.setVisible(true);
			Label_player4_Amount.setVisible(true);
			Label_player4_Amount.setText(String.valueOf(amount)+" $");
			Player4_smbole.setVisible(true);
			Line_Player4.setVisible(true);
			Arrow_4.setVisible(false);
			//player5
			Label_player5.setVisible(true);
			Label_Amount_player5.setVisible(true);
			Label_player5_Amount.setVisible(true);
			Label_player5_Amount.setText(String.valueOf(amount)+" $");
			Player5_smbole.setVisible(true);
			Line_Player5.setVisible(true);
			Arrow_5.setVisible(false);
			//player6
			Label_player6.setVisible(true);
			Label_Amount_player6.setVisible(true);
			Label_player6_Amount.setVisible(true);
			Label_player6_Amount.setText(String.valueOf(amount)+" $");
			Player6_smbole.setVisible(true);
			Line_Player6.setVisible(true);
			Arrow_6.setVisible(false);
			//player7
			Label_player7.setVisible(false);
			Label_Amount_player7.setVisible(false);
			Label_player7_Amount.setVisible(false);
			Player7_smbole.setVisible(false);
			Line_Player7.setVisible(false);
			Arrow_7.setVisible(false);
			//player8
			Label_player8.setVisible(false);
			Label_Amount_player8.setVisible(false);
			Label_player8_Amount.setVisible(false);
			Player8_smbole.setVisible(false);
			Arrow_8.setVisible(false);
			break;
		case 7:
			Gamer1= new PlayerArea("Player 1",Main.players_amount,Domino_A,Arrow_1,1,Label_player1_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer1);
			Gamer2= new PlayerArea("Player 2",Main.players_amount,Domino_B,Arrow_2,1,Label_player2_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer2);
			Gamer3= new PlayerArea("Player 3",Main.players_amount,Domino_C,Arrow_3,1,Label_player3_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer3);
			Gamer4= new PlayerArea("Player 4",Main.players_amount,Domino_D,Arrow_4,1,Label_player4_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer4);
			Gamer5= new PlayerArea("Player 5",Main.players_amount,Domino_E,Arrow_5,1,Label_player5_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer5);
			Gamer6= new PlayerArea("Player 6",Main.players_amount,Domino_F,Arrow_6,1,Label_player6_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer6);
			Gamer7= new PlayerArea("Player 7",Main.players_amount,Domino_G,Arrow_7,1,Label_player7_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer7);
			Label_player1.setVisible(true);
			Label_Amount_player1.setVisible(true);
			Label_player1_Amount.setVisible(true);
			Label_player1_Amount.setText(String.valueOf(amount)+" $");
			Player1_smbole.setVisible(true);
			Line_Player1.setVisible(true);
			Arrow_1.setVisible(true);
											//player2
			Label_player2.setVisible(true);
			Label_Amount_player2.setVisible(true);
			Label_player2_Amount.setVisible(true);
			Label_player2_Amount.setText(String.valueOf(amount)+" $");
			Player2_smbole.setVisible(true);
			Line_Player2.setVisible(true);
			Arrow_2.setVisible(false);
			//player3
			Label_player3.setVisible(true);
			Label_Amount_player3.setVisible(true);
			Label_player3_Amount.setVisible(true);
			Label_player3_Amount.setText(String.valueOf(amount)+" $");
			Player3_smbole.setVisible(true);
			Line_Player3.setVisible(true);
			Arrow_3.setVisible(false);
			//player4
			Label_player4.setVisible(true);
			Label_Amount_player4.setVisible(true);
			Label_player4_Amount.setVisible(true);
			Label_player4_Amount.setText(String.valueOf(amount)+" $");
			Player4_smbole.setVisible(true);
			Line_Player4.setVisible(true);
			Arrow_4.setVisible(false);
			//player5
			Label_player5.setVisible(true);
			Label_Amount_player5.setVisible(true);
			Label_player5_Amount.setVisible(true);
			Label_player5_Amount.setText(String.valueOf(amount)+" $");
			Player5_smbole.setVisible(true);
			Line_Player5.setVisible(true);
			Arrow_5.setVisible(false);
			//player6
			Label_player6.setVisible(true);
			Label_Amount_player6.setVisible(true);
			Label_player6_Amount.setVisible(true);
			Label_player6_Amount.setText(String.valueOf(amount)+" $");
			Player6_smbole.setVisible(true);
			Line_Player6.setVisible(true);
			Arrow_6.setVisible(false);
			//player7
			Label_player7.setVisible(true);
			Label_Amount_player7.setVisible(true);
			Label_player7_Amount.setVisible(true);
			Label_player7_Amount.setText(String.valueOf(amount)+" $");
			Player7_smbole.setVisible(true);
			Line_Player7.setVisible(true);
			Arrow_7.setVisible(false);
			//player8
			Label_player8.setVisible(false);
			Label_Amount_player8.setVisible(false);
			Label_player8_Amount.setVisible(false);
			Player8_smbole.setVisible(false);
			Arrow_8.setVisible(false);
			break;
		case 8:
			Gamer1= new PlayerArea("Player 1",Main.players_amount,Domino_A,Arrow_1,1,Label_player1_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer1);
			Gamer2= new PlayerArea("Player 2",Main.players_amount,Domino_B,Arrow_2,1,Label_player2_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer2);
			Gamer3= new PlayerArea("Player 3",Main.players_amount,Domino_C,Arrow_3,1,Label_player3_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer3);
			Gamer4= new PlayerArea("Player 4",Main.players_amount,Domino_D,Arrow_4,1,Label_player4_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer4);
			Gamer5= new PlayerArea("Player 5",Main.players_amount,Domino_E,Arrow_5,1,Label_player5_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer5);
			Gamer6= new PlayerArea("Player 6",Main.players_amount,Domino_F,Arrow_6,1,Label_player6_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer6);
			Gamer7= new PlayerArea("Player 7",Main.players_amount,Domino_G,Arrow_7,1,Label_player7_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer7);
			Gamer8= new PlayerArea("Player 8",Main.players_amount,Domino_H,Arrow_8,1,Label_player8_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer8);
			Label_player1.setVisible(true);
			Label_Amount_player1.setVisible(true);
			Label_player1_Amount.setVisible(true);
			Label_player1_Amount.setText(String.valueOf(amount)+" $");
			Player1_smbole.setVisible(true);
			Line_Player1.setVisible(true);
			Arrow_1.setVisible(true);
											//player2
			Label_player2.setVisible(true);
			Label_Amount_player2.setVisible(true);
			Label_player2_Amount.setVisible(true);
			Label_player2_Amount.setText(String.valueOf(amount)+" $");
			Player2_smbole.setVisible(true);
			Line_Player2.setVisible(true);
			Arrow_2.setVisible(false);
			//player3
			Label_player3.setVisible(true);
			Label_Amount_player3.setVisible(true);
			Label_player3_Amount.setVisible(true);
			Label_player3_Amount.setText(String.valueOf(amount)+" $");
			Player3_smbole.setVisible(true);
			Line_Player3.setVisible(true);
			Arrow_3.setVisible(false);
			//player4
			Label_player4.setVisible(true);
			Label_Amount_player4.setVisible(true);
			Label_player4_Amount.setVisible(true);
			Label_player4_Amount.setText(String.valueOf(amount)+" $");
			Player4_smbole.setVisible(true);
			Line_Player4.setVisible(true);
			Arrow_4.setVisible(false);
			//player5
			Label_player5.setVisible(true);
			Label_Amount_player5.setVisible(true);
			Label_player5_Amount.setVisible(true);
			Label_player5_Amount.setText(String.valueOf(amount)+" $");
			Player5_smbole.setVisible(true);
			Line_Player5.setVisible(true);
			Arrow_5.setVisible(false);
			//player6
			Label_player6.setVisible(true);
			Label_Amount_player6.setVisible(true);
			Label_player6_Amount.setVisible(true);
			Label_player6_Amount.setText(String.valueOf(amount)+" $");
			Player6_smbole.setVisible(true);
			Line_Player6.setVisible(true);
			Arrow_6.setVisible(false);
			//player7
			Label_player7.setVisible(true);
			Label_Amount_player7.setVisible(true);
			Label_player7_Amount.setVisible(true);
			Label_player7_Amount.setText(String.valueOf(amount)+" $");
			Player7_smbole.setVisible(true);
			Line_Player7.setVisible(true);
			Arrow_7.setVisible(false);
			//player8
			Label_player8.setVisible(true);
			Label_Amount_player8.setVisible(true);
			Label_player8_Amount.setVisible(true);
			Label_player8_Amount.setText(String.valueOf(amount)+" $");
			Player8_smbole.setVisible(true);
			Arrow_8.setVisible(false);
			break;
		default:
			Gamer1= new PlayerArea("Player 1",Main.players_amount,Domino_A,Arrow_1,1,Label_player1_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer1);
			Gamer2= new PlayerArea("Player 2",Main.players_amount,Domino_B,Arrow_2,1,Label_player2_Amount);
			setting_places = new Instanciate_Owned_Places_To_False(Gamer2);
											//player1
			Label_player1.setVisible(true);
			Label_Amount_player1.setVisible(true);
			Label_player1_Amount.setVisible(true);
			Label_player1_Amount.setText(String.valueOf(amount)+" $");
			Player1_smbole.setVisible(true);
			Line_Player1.setVisible(true);
			Arrow_1.setVisible(true);
											//player2
			Label_player2.setVisible(true);
			Label_Amount_player2.setVisible(true);
			Label_player2_Amount.setVisible(true);
			Label_player2_Amount.setText(String.valueOf(amount)+" $");
			Player2_smbole.setVisible(true);
			Line_Player2.setVisible(true);
			Arrow_2.setVisible(false);
			//player3
			Label_player3.setVisible(false);
			Label_Amount_player3.setVisible(false);
			Label_player3_Amount.setVisible(false);
			Player3_smbole.setVisible(false);
			Line_Player3.setVisible(false);
			Arrow_3.setVisible(false);
			//player4
			Label_player4.setVisible(false);
			Label_Amount_player4.setVisible(false);
			Label_player4_Amount.setVisible(false);
			Player4_smbole.setVisible(false);
			Line_Player4.setVisible(false);
			Arrow_4.setVisible(false);
			//player5
			Label_player5.setVisible(false);
			Label_Amount_player5.setVisible(false);
			Label_player5_Amount.setVisible(false);
			Player5_smbole.setVisible(false);
			Line_Player5.setVisible(false);
			Arrow_5.setVisible(false);
			//player6
			Label_player6.setVisible(false);
			Label_Amount_player6.setVisible(false);
			Label_player6_Amount.setVisible(false);
			Player6_smbole.setVisible(false);
			Line_Player6.setVisible(false);
			Arrow_6.setVisible(false);
			//player7
			Label_player7.setVisible(false);
			Label_Amount_player7.setVisible(false);
			Label_player7_Amount.setVisible(false);
			Player7_smbole.setVisible(false);
			Line_Player7.setVisible(false);
			Arrow_7.setVisible(false);
			//player8
			Label_player8.setVisible(false);
			Label_Amount_player8.setVisible(false);
			Label_player8_Amount.setVisible(false);
			Player8_smbole.setVisible(false);
			Arrow_8.setVisible(false);
			
		}
		
	}
	
	@FXML
    void Click_ON_Symbole_Player1(MouseEvent event) {
		
		
		if(Domino_A.isVisible()) {
			verifying_same_places (Gamer1,1);
			show_where_is_Domino_if_visible(Domino_A);
		}else {
			show_where_is_Domino_if_Notvisible(Domino_A);
		}

    }

    @FXML
    void Click_ON_Symbole_Player2(MouseEvent event) {
    	if(Domino_B.isVisible()) {
    		verifying_same_places (Gamer2,2);
			show_where_is_Domino_if_visible(Domino_B);
		}else {
			show_where_is_Domino_if_Notvisible(Domino_B);
		}
    }

    @FXML
    void Click_ON_Symbole_Player3(MouseEvent event) {
    	if(Domino_C.isVisible()) {
    		verifying_same_places (Gamer3,3);
			show_where_is_Domino_if_visible(Domino_C);
		}else {
			show_where_is_Domino_if_Notvisible(Domino_C);
		}
    }

    @FXML
    void Click_ON_Symbole_Player4(MouseEvent event) {
    	if(Domino_D.isVisible()) {
    		verifying_same_places (Gamer4,4);
			show_where_is_Domino_if_visible(Domino_D);
		}else {
			show_where_is_Domino_if_Notvisible(Domino_D);
		}
    }

    @FXML
    void Click_ON_Symbole_Player5(MouseEvent event) {
    	if(Domino_E.isVisible()) {
    		verifying_same_places (Gamer5,5);
			show_where_is_Domino_if_visible(Domino_E);
		}else {
			show_where_is_Domino_if_Notvisible(Domino_E);
		}
    }

    @FXML
    void Click_ON_Symbole_Player6(MouseEvent event) {
    	if(Domino_F.isVisible()) {
    		verifying_same_places (Gamer6,6);
			show_where_is_Domino_if_visible(Domino_F);
		}else {
			show_where_is_Domino_if_Notvisible(Domino_F);
		}
    }

    @FXML
    void Click_ON_Symbole_Player7(MouseEvent event) {
    	if(Domino_G.isVisible()) {
    		verifying_same_places (Gamer7,7);
			show_where_is_Domino_if_visible(Domino_G);
		}else {
			show_where_is_Domino_if_Notvisible(Domino_G);
		}
    }

    @FXML
    void Click_ON_Symbole_Player8(MouseEvent event) {
    	if(Domino_H.isVisible()) {
    		verifying_same_places (Gamer8,8);
			show_where_is_Domino_if_visible(Domino_H);
		}else {
			show_where_is_Domino_if_Notvisible(Domino_H);
		}
    }
    
    void show_where_is_Domino_if_visible(ImageView image) {
    	FadeTransition trans5 = new FadeTransition(Duration.millis(50), image);
    	trans5.setFromValue(1);
        trans5.setToValue(0);
        trans5.setAutoReverse(true);
        trans5.setCycleCount(8);
        trans5.play();
    }
    void show_where_is_Domino_if_Notvisible(ImageView image) {
    	image.setVisible(true);
    	FadeTransition trans5 = new FadeTransition(Duration.millis(70), image);
    	trans5.setFromValue(1);
        trans5.setToValue(0);
        trans5.setAutoReverse(true);
        trans5.setCycleCount(8);
        trans5.play();
        PauseTransition p = new PauseTransition(Duration.millis(70*8));
		p.setOnFinished(e -> return_domino_to_hide_mode(image));
        p.play();
        
    }
    void return_domino_to_hide_mode(ImageView image) {
    	image.setVisible(false);
    }
    
    void verifying_same_places (PlayerArea player,int number){
    	int places[] = new int[9];
    	PlayerArea objects[] = {Gamer1,Gamer1,Gamer2,Gamer3,Gamer4,Gamer5,Gamer6,Gamer7,Gamer8};
    	for(int i=1;i<=8;i++) {
    		if((i==number)==false) {
    			places[i]=objects[i].getPlayer_place();
    		}
    		
    	}
    	for(int i=1;i<=8;i++) {
    		if(places[i]==player.getPlayer_place()) {
    			objects[i].getDomino().setVisible(false);
    			
    		}
    	}
    }
	@FXML
    void Click_On_Arena(MouseEvent event) {
		Click_On_image_under_players_info(event);
    }
}

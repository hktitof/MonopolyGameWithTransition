package FXML_Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;

import MediaClass.PlayNewMedia;
import Transitions.FadeTransitionClass;
import Transitions.FadetransitionOnetime;
import Transitions.ITransitionStrategy;
import Transitions.PauseTransitionClass;
import Transitions.ScaleTransitionClass;
import Transitions.TranslateTransitionClass;
import application.Main;
import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


public class FirstPage extends Main implements Initializable{
	
	
	@FXML
    private AnchorPane Center_AnchorPane;

    @FXML
    private ImageView image_exit;

    @FXML
    private ImageView image_start;

    @FXML
    private AnchorPane AnchorPane_start;

    @FXML
    private ImageView image_body;

    @FXML
    private ImageView image_header;

    @FXML
    private ImageView image_button_back;

    @FXML
    private ImageView image_button_new;

    @FXML
    private ImageView image_bar_select_player;

    @FXML
    private ImageView image_number_of_players;

    @FXML
    private ImageView image_select_6;

    @FXML
    private ImageView image_select_5;

    @FXML
    private ImageView image_select_4;

    @FXML
    private ImageView image_select_3;

    @FXML
    private ImageView image_select_2;

    @FXML
    private ImageView image_select_1;

    @FXML
    private ImageView image_select_7;

    @FXML
    private ImageView image_select_8;

    @FXML
    private ImageView image_triangle;

    @FXML
    private JFXTextField textfield_amount;

    @FXML
    private ImageView image_amount_label;

    @FXML
    private ImageView image_dollar_symbole;
	
	
	
    
    public static int number_of_player;
    public static int amount;
	PlayNewMedia player = new PlayNewMedia();
	ITransitionStrategy trans = new TranslateTransitionClass();
	PauseTransitionClass pause_trans = new PauseTransitionClass();
	@Override
	public void initialize(URL location, ResourceBundle arg1) {
		  AnchorPane_start.setVisible(false);
		  image_body.setY(-650);
		  image_header.setY(-190);
		  image_button_back.setX(-300);
		  image_button_new.setX(-500);
		  image_bar_select_player.setVisible(false);
		  image_bar_select_player.setOpacity(0);
		  image_number_of_players.setVisible(false);
		  image_number_of_players.setOpacity(0);
		  image_select_1.setVisible(false);
		  image_select_1.setOpacity(0);
		  image_select_2.setVisible(false);
		  image_select_2.setOpacity(0);
		  image_select_3.setVisible(false);
		  image_select_3.setOpacity(0);
		  image_select_4.setVisible(false);
		  image_select_4.setOpacity(0);
		  image_select_5.setVisible(false);
		  image_select_5.setOpacity(0);
		  image_select_6.setVisible(false);
		  image_select_6.setOpacity(0);
		  image_select_7.setVisible(false);
		  image_select_7.setOpacity(0);
		  image_select_8.setVisible(false);
		  image_select_8.setOpacity(0);
		  image_triangle.setVisible(false);
		  image_triangle.setOpacity(0);
		  image_amount_label.setVisible(false);
		  image_amount_label.setOpacity(0);
		  textfield_amount.setVisible(false);
		  textfield_amount.setOpacity(0);
		  image_dollar_symbole.setVisible(false);
		  image_dollar_symbole.setOpacity(0);
		  
		  Main.players_number=2;
		  
        
		
	}
	
	

    
	@FXML
    void clicked_Start(MouseEvent event) throws InterruptedException {
		player = new PlayNewMedia("/sound/clicked start.mp3");
		player.run();
        trans = new TranslateTransitionClass(1000,image_start,-400f,true);
        trans.run();
        trans = new TranslateTransitionClass(1000, image_exit, -400f,true);
        pause_trans = new PauseTransitionClass(400,trans);
        pause_trans.run();
        trans = new ScaleTransitionClass(500, Center_AnchorPane, 0.6, 0.7);
        pause_trans = new PauseTransitionClass(800,trans);
        pause_trans.run();
        trans = new TranslateTransitionClass(800, image_body, 650f, false,AnchorPane_start);
        pause_trans = new PauseTransitionClass(1500,trans);
        pause_trans.run();
        player = new PlayNewMedia("/sound/wind movement 1.mp3");
        pause_trans = new PauseTransitionClass(1500,player);
        pause_trans.run();
        trans = new TranslateTransitionClass(500, image_header, 190f, false);
        pause_trans = new PauseTransitionClass(2200,trans);
        pause_trans.run();
        player = new PlayNewMedia("/sound/wind movement 1.mp3");
        pause_trans = new PauseTransitionClass(2200,player);
        pause_trans.run();
        trans = new TranslateTransitionClass(700, image_button_new, 500f, true);
        pause_trans = new PauseTransitionClass(3000,trans);
        pause_trans.run();
        player = new PlayNewMedia("/sound/wind movement 2.mp3");
        pause_trans = new PauseTransitionClass(3000,player);
        pause_trans.run();
        trans = new TranslateTransitionClass(600, image_button_back, 300f, true);
        pause_trans = new PauseTransitionClass(3500,trans);
        pause_trans.run();
        player = new PlayNewMedia("/sound/wind movement 2.mp3");
        pause_trans = new PauseTransitionClass(3500,player);
        pause_trans.run();
        image_number_of_players.setVisible(true);
        trans = new FadetransitionOnetime(500, image_number_of_players,"image");
        pause_trans = new PauseTransitionClass(4200,trans);
        pause_trans.run();
        image_bar_select_player.setVisible(true);
        trans = new FadetransitionOnetime(500, image_bar_select_player,"image");
        pause_trans = new PauseTransitionClass(4900,trans);
        pause_trans.run();
        image_select_1.setVisible(true);
        trans = new FadetransitionOnetime(200, image_select_1,"image");
        pause_trans = new PauseTransitionClass(5000,trans);
        pause_trans.run();
        image_select_2.setVisible(true);
        trans = new FadetransitionOnetime(200, image_select_2,"image");
        pause_trans = new PauseTransitionClass(5200,trans);
        pause_trans.run();
        image_select_3.setVisible(true);
        trans = new FadetransitionOnetime(200, image_select_3,"image");
        pause_trans = new PauseTransitionClass(5400,trans);
        pause_trans.run();
        image_select_4.setVisible(true);
        trans = new FadetransitionOnetime(200, image_select_4,"image");
        pause_trans = new PauseTransitionClass(5600,trans);
        pause_trans.run();
        image_select_5.setVisible(true);
        trans = new FadetransitionOnetime(200, image_select_5,"image");
        pause_trans = new PauseTransitionClass(5800,trans);
        pause_trans.run();
        image_select_6.setVisible(true);
        trans = new FadetransitionOnetime(200, image_select_6,"image");
        pause_trans = new PauseTransitionClass(6000,trans);
        pause_trans.run();
        image_select_7.setVisible(true);
        trans = new FadetransitionOnetime(200, image_select_7,"image");
        pause_trans = new PauseTransitionClass(6200,trans);
        pause_trans.run();
        image_select_8.setVisible(true);
        trans = new FadetransitionOnetime(200, image_select_8,"image");
        pause_trans = new PauseTransitionClass(6400,trans);
        pause_trans.run();
        image_triangle.setVisible(true);
        trans = new FadetransitionOnetime(200, image_triangle,"image");
        pause_trans = new PauseTransitionClass(6800,trans);
        pause_trans.run();
        image_amount_label.setVisible(true);
        trans = new FadetransitionOnetime(200, image_amount_label,"image");
        pause_trans = new PauseTransitionClass(7300,trans);
        pause_trans.run();
        textfield_amount.setVisible(true);
        trans = new FadetransitionOnetime(200, textfield_amount,"textfield");
        pause_trans = new PauseTransitionClass(7600,trans);
        pause_trans.run();
        image_dollar_symbole.setVisible(true);
        trans = new FadetransitionOnetime(200, image_dollar_symbole,"image");
        pause_trans = new PauseTransitionClass(7800,trans);
        pause_trans.run();
        
        
        
        
        
        

    }
	
	
	
	@FXML
    void MouseEntred_New_Button(MouseEvent event) {
		trans = new FadeTransitionClass(50, 4, image_button_new);
    	trans.run();
        player = new PlayNewMedia("/sound/start entred.mp3");
        player.run();
    }
	@FXML
    void MouseEntred_Back_Button(MouseEvent event) {
		trans = new FadeTransitionClass(50, 4, image_button_back);
    	trans.run();
        player = new PlayNewMedia("/sound/quit exited.mp3");
        player.run();
    }
	
   
   
    @FXML
    void MouseEnteredOnStart(MouseEvent event) throws InterruptedException {
    	trans = new FadeTransitionClass(50, 4, image_start);
    	trans.run();
        player = new PlayNewMedia("/sound/start entred.mp3");
        player.run();
    }
    
    @FXML
    void ClickedOnnew(MouseEvent event) throws IOException {
    	Main.players_amount=Integer.parseInt(textfield_amount.getText().toString());
    	root.setVisible(false);
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML_files/SecondPage.fxml"));
		Scene scene = new Scene(root,1100,980);
		scene.setFill(Color.TRANSPARENT);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
        primaryStage.show();
        FadeTransition trans1 = new FadeTransition(Duration.seconds(0.1), root);
        trans1.setFromValue(0);
        trans1.setToValue(1);
        trans1.play();
        player = new PlayNewMedia("/sound/Popup_SecondPage.mp3");
		player.run();
        
    }
    
    @FXML
    void Clicked_On_Back(MouseEvent event) throws IOException {
    	Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML_files/SecondPage.fxml"));
		Scene scene = new Scene(root,1100,980);
		scene.setFill(Color.TRANSPARENT);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
        primaryStage.show();

    }

    @FXML
    void MouseExitedOnStart(MouseEvent event) {
    	
    	
    	
    }
    
    @FXML
    void MouseEntred_Exit(MouseEvent event) {
    	trans = new FadeTransitionClass(50, 4, image_exit);
    	trans.run();
    	player = new PlayNewMedia("/sound/quit exited.mp3");
    	player.run();

    	
    }
    
    @FXML
    void mouse_clickOn_2(MouseEvent event) {
    	image_triangle.setX(0);
    	player = new PlayNewMedia("/sound/Select number of players.mp3");
    	player.run();
    	Main.players_number=2;
    	

    }

    @FXML
    void mouse_clickOn_3(MouseEvent event) {
    	image_triangle.setX(40.8);
    	player = new PlayNewMedia("/sound/Select number of players.mp3");
    	player.run();
    	Main.players_number=3;
    }

    @FXML
    void mouse_clickOn_4(MouseEvent event) {
    	image_triangle.setX(81);
    	player = new PlayNewMedia("/sound/Select number of players.mp3");
    	player.run();
    	Main.players_number=4;
    }

    @FXML
    void mouse_clickOn_5(MouseEvent event) {
    	image_triangle.setX(119.7);
    	player = new PlayNewMedia("/sound/Select number of players.mp3");
    	player.run();
    	Main.players_number=5;
    }

    @FXML
    void mouse_clickOn_6(MouseEvent event) {
    	image_triangle.setX(160);
    	player = new PlayNewMedia("/sound/Select number of players.mp3");
    	player.run();
    	Main.players_number=6;
    }

    @FXML
    void mouse_clickOn_7(MouseEvent event) {
    	image_triangle.setX(195);
    	player = new PlayNewMedia("/sound/Select number of players.mp3");
    	player.run();
    	Main.players_number=7;
    }

    @FXML
    void mouse_clickOn_8(MouseEvent event) {
    	image_triangle.setX(230);
    	player = new PlayNewMedia("/sound/Select number of players.mp3");
    	player.run();
    	Main.players_number=8;
    }
	

}


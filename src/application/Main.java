package application;
	

import Rules_Of_The_game.PlayerArea;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


public class Main extends Application {
	public static int players_number;
	public static int players_amount;
	public static Parent root;
	public static Stage primaryStage;
	public static Label Static_PopUp_Label= new Label("Edited From Main");
	public static int Building_price;
	public static PlayerArea static_player;
	public static PlayerArea Gamer1 = new PlayerArea();
    public static PlayerArea Gamer2 = new PlayerArea();
    public static PlayerArea Gamer3 = new PlayerArea();
    public static PlayerArea Gamer4 = new PlayerArea();
    public static PlayerArea Gamer5 = new PlayerArea();
    public static PlayerArea Gamer6 = new PlayerArea();
    public static PlayerArea Gamer7 = new PlayerArea();
    public static PlayerArea Gamer8 = new PlayerArea();
    public static int player_turn;
    public static int static_player_place;
    public static ImageView images_owned_buildings[]=new ImageView[41];
	@Override
	public void start(Stage primaryStage) {
		try {
			Main.primaryStage=primaryStage;
			root = FXMLLoader.load(getClass().getResource("/FXML_files/FirstPage.fxml"));
			Scene scene = new Scene(root,600,700);
			scene.setFill(Color.TRANSPARENT);
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
			Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
	        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
	        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
	        primaryStage.show();
	        FadeTransition trans = new FadeTransition(Duration.seconds(3), root);
	        trans.setFromValue(0);
	        trans.setToValue(1);
	        trans.play();
	        
	        
	        
	        
	        
	        
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

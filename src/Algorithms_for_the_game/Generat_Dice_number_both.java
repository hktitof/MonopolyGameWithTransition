package Algorithms_for_the_game;

import java.io.IOException;
import java.util.Random;

import FXML_Controllers.SecondPage;
import MediaClass.PlayNewMedia;
import Rules_Of_The_game.Player;
import Rules_Of_The_game.PlayerArea;
import Transitions.DominoTransitions;
import Transitions.ITransitionStrategy;
import application.Main;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Generat_Dice_number_both extends SecondPage{

	private ImageView image1;
	private ImageView image2;
	private ImageView image3;
	private ImageView image4;
	private ImageView image5;
	private ImageView image6;
	private ImageView Dice_var1;
	private ImageView Dice_var2;
	private ImageView domino_A;
	private int first_time_var=0;
	private int myArray[] = {1,2,3,4,5,6};
	private int get_values_for_dice[] = new int[2];
	
	
	private PlayerArea the_player = new PlayerArea();
	private int store_player_loop_static;
	PlayNewMedia player = new PlayNewMedia();
			
			
	public Generat_Dice_number_both(ImageView image1, ImageView image2, ImageView image3, ImageView image4,
			ImageView image5, ImageView image6, ImageView dice_var1, ImageView dice_var2,ImageView domino_A) {
		super();
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		this.image6 = image6;
		Dice_var1 = dice_var1;
		Dice_var2 = dice_var2;
		this.first_time_var=0;
		this.domino_A=domino_A;
	}

	public void run() {
		
		if(this.first_time_var==0) {
			PauseTransition p = new PauseTransition(Duration.millis(3000));
			p.setOnFinished(e -> this.run());
	        p.play();
	        this.first_time_var=1;
		}else {
			get_values_for_dice[0]=get_dice_var_numbe();
			switch(get_values_for_dice[0]) {
		  	  case 1:
		  	    this.Dice_var1.setImage(this.image1.getImage());
		  	    break;
		  	  case 2:
		  		this.Dice_var1.setImage(this.image2.getImage());
		  	    break;
		  	  case 3:
		  		this.Dice_var1.setImage(this.image3.getImage());
		  	    break;
		  	  case 4:
		  		this.Dice_var1.setImage(this.image4.getImage());
		  	    break;
		  	  case 5:
		  		this.Dice_var1.setImage(this.image5.getImage());
		  	    break;
		  	  case 6:
		  		this.Dice_var1.setImage(this.image6.getImage());
		  	    break;
		  	}
			get_values_for_dice[1]=get_dice_var_numbe();
			switch(get_values_for_dice[1]) {
		  	  case 1:
		  	    this.Dice_var2.setImage(this.image1.getImage());
		  	    break;
		  	  case 2:
		  		this.Dice_var2.setImage(this.image2.getImage());
		  	    break;
		  	  case 3:
		  		this.Dice_var2.setImage(this.image3.getImage());
		  	    break;
		  	  case 4:
		  		this.Dice_var2.setImage(this.image4.getImage());
		  	    break;
		  	  case 5:
		  		this.Dice_var2.setImage(this.image5.getImage());
		  	    break;
		  	  case 6:
		  		this.Dice_var2.setImage(this.image6.getImage());
		  	    break;
		  	}
			
			Mov_player();

		}
		
		
	}
	
	void Mov_player() {
		
			player_loop++;
			getting_values();
			DominoTransitions Move_Domino_obj = new DominoTransitions(the_player.getDomino(),the_player.getPlayer_place(),this.get_values_for_dice[0]+this.get_values_for_dice[1]);
	    	Move_Domino_obj.run();
	    	the_player.setPlayer_place(the_player.getPlayer_place()+this.get_values_for_dice[0]+this.get_values_for_dice[1]);
	    	if(the_player.getPlayer_place()>40) {
	    		the_player.setPlayer_place(the_player.getPlayer_place()-40);
	    	}
	    	setting_values();
	    	
	    	PauseTransition p = new PauseTransition(Duration.millis((this.get_values_for_dice[0]+this.get_values_for_dice[1])*200));
			p.setOnFinished(e -> this.last_action_after_moving_Domino_activate_arrow_and_false_visible_current_Domino());
	        p.play();
			
		
		
		
    	
//    	DominoTransitions Move_Domino_obj = new DominoTransitions(this.domino_A,Place_Domino_A,this.get_values_for_dice[0]+this.get_values_for_dice[1]);
//    	Move_Domino_obj.run();
//		Place_Domino_A=Place_Domino_A+this.get_values_for_dice[0]+this.get_values_for_dice[1];
//    	if(Place_Domino_A>40) {
//    		Place_Domino_A=Place_Domino_A-40;
//    	}
    	
    	
		
	}
	
	void last_action_after_moving_Domino_activate_arrow_and_false_visible_current_Domino() {
//		FadeTransition trans = new FadeTransition(Duration.millis(1000), the_player.getDomino());
//    	trans.setFromValue(1);
//        trans.setToValue(0);
//        trans.play();
//        PauseTransition p = new PauseTransition(Duration.millis(1000));
//		p.setOnFinished(e -> make_current_domino_Hide());
//        p.play();
		
//		FadeTransition trans = new FadeTransition(Duration.millis(1000), the_player.getDomino());
//    	trans.setFromValue(1);
//        trans.setToValue(0);
//        trans.play();
        PauseTransition p = new PauseTransition(Duration.millis(0));
		p.setOnFinished(e -> {
			try {
				make_current_domino_Hide();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
        p.play();
		
		
	}
	void make_current_domino_Hide() throws IOException {
		
		Cheking_place_area();
		
		
//		the_player.getDomino().setVisible(false);
		the_player.getArrow().setVisible(false);
//		the_player.getDomino().setOpacity(1);
		if((player_loop+1)>players_number) {
			player_loop=1;
			getting_values();
			the_player.getArrow().setVisible(true);
			FadeTransition trans = new FadeTransition(Duration.millis(50), the_player.getDomino());
	    	trans.setFromValue(1);
	        trans.setToValue(0);
	        trans.setAutoReverse(true);
	        trans.setCycleCount(8);
	        trans.play();
			the_player.getDomino().setVisible(true);
			player_loop=0;
		}else {
			player_loop++;
			getting_values();
			the_player.getArrow().setVisible(true);
			FadeTransition trans = new FadeTransition(Duration.millis(100), the_player.getDomino());
	    	trans.setFromValue(1);
	        trans.setToValue(0);
	        trans.setAutoReverse(true);
	        trans.setCycleCount(8);
	        trans.play();
			the_player.getDomino().setVisible(true);
			player_loop--;
		}
		
		
		
		
//		the_player.getDomino().setVisible(false);
//		the_player.getArrow().setVisible(false);
//		the_player.getDomino().setOpacity(1);
//		if((player_loop+1)>players_number) {
//			player_loop=1;
//			getting_values();
//			the_player.getArrow().setVisible(true);
//			FadeTransition trans = new FadeTransition(Duration.millis(50), the_player.getDomino());
//	    	trans.setFromValue(1);
//	        trans.setToValue(0);
//	        trans.setAutoReverse(true);
//	        trans.setCycleCount(8);
//	        trans.play();
//			the_player.getDomino().setVisible(true);
//			player_loop=0;
//		}else {
//			player_loop++;
//			getting_values();
//			the_player.getArrow().setVisible(true);
//			FadeTransition trans = new FadeTransition(Duration.millis(100), the_player.getDomino());
//	    	trans.setFromValue(1);
//	        trans.setToValue(0);
//	        trans.setAutoReverse(true);
//	        trans.setCycleCount(8);
//	        trans.play();
//			the_player.getDomino().setVisible(true);
//			player_loop--;
//		}
	}
	
	
	Boolean BuildingArea[] = {false,false,true,false,true,false,false,true,false,true,true,false,true,false,true,true,false,true,false,true
				,true,false,true,false,true,true,false,true,true,false,true,false,true,true,false,true,false,false,true,false,true};
	int BuildingArea_Price[] = {0,0,60,0,60,0,0,100,0,100,120,0,140,0,140,160,0,180,0,180,200,0,220,0,220,240,0,260,260,0,280,0,300,300,0,320,0,0,350,0,400};
	
	
	void Cheking_place_area() throws IOException {
		System.out.println("Building values before checking : "+BuildingArea[the_player.getPlayer_place()]);
		int i;int j;
		PlayerArea Gamer[] = {Gamer1,Gamer1,Gamer2,Gamer3,Gamer4,Gamer5,Gamer6,Gamer7,Gamer8};
		
		

		
//		for(i=1;i<=players_number;i++) {
//			for(j=1;j<=40;j++) {
//				if(BuildingArea[j]=true && the_player.getPlayer_place()==j && i!=player_loop) {
//					
//						if(Gamer[i].getPlayers_owned_places()[j]) {
//							the_player.setPlayer_amount(the_player.getPlayer_amount()- BuildingArea_Price[j]);
//							the_player.getLabel_amount().setText(String.valueOf(the_player.getPlayer_amount())+" $");
//						}
//					
//				}
//				
//				
//			}
//		}
		Boolean Not_Owned_cheking_1=false ;
		Boolean Not_Owned_cheking_2=false ;
		Boolean Not_Owned_cheking_3=false ;
		Boolean Not_Owned_cheking_4=false ;
		Boolean Not_Owned_cheking_5=false ;
		Boolean Not_Owned_cheking_6=false ;
		Boolean Not_Owned_cheking_7=false ;
		Boolean Not_Owned_cheking_8=false ;
		Boolean Not_Owned_cheking=false ;
		
		Boolean it_is_Owned[] = {false,false,false,false,false,false,false,false,false};
		int integer_values_Total_is_0_or_1[]=new int[9];
		int total_value=0;
		Main.Building_price=0;
		
				if(BuildingArea[the_player.getPlayer_place()]) {
					System.out.println("You are Not in a Building");
					for(j=1;j<=players_number;j++) {
//						if() {
//							Not_Owned_cheking=true;
//						}
						switch(j) {
						case 1:
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								it_is_Owned[j]=true;
							}else {
								it_is_Owned[j]=false;
							}
							
						break;
						case 2:
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								it_is_Owned[j]=true;
							}else {
								it_is_Owned[j]=false;
							}
						break;
						case 3:
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								it_is_Owned[j]=true;
							}else {
								it_is_Owned[j]=false;
							}
						break;
						case 4:
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								it_is_Owned[j]=true;
							}else {
								it_is_Owned[j]=false;
							}
						break;
						case 5:
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								it_is_Owned[j]=true;
							}else {
								it_is_Owned[j]=false;
							}
						break;
						case 6:
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								it_is_Owned[j]=true;
							}else {
								it_is_Owned[j]=false;
							}
						break;
						case 7:
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								it_is_Owned[j]=true;
							}else {
								it_is_Owned[j]=false;
							}
						break;
						case 8:
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								it_is_Owned[j]=true;
							}else {
								it_is_Owned[j]=false;
							}
						break;
						}
					}
					for(j=1;j<=players_number;j++) {
						if(it_is_Owned[j]) {
							total_value=1;
						}
						
					}
				
					if(total_value==0) {
						Main.Building_price=BuildingArea_Price[the_player.getPlayer_place()];
						static_player_place=the_player.getPlayer_place();
						player_turn=player_loop;
						Static_PopUp_Label.setText("Do you wanna Buy this Place for "+Main.Building_price+" $");
						Stage primaryStage=new Stage();
						root = FXMLLoader.load(getClass().getResource("/FXML_files/PoPupPage.fxml"));
						Scene scene = new Scene(root,500,200);
						scene.setFill(Color.TRANSPARENT);
						primaryStage.setScene(scene);
						primaryStage.initStyle(StageStyle.TRANSPARENT);
						primaryStage.show();
						Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
				        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
				        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
				        primaryStage.show();
				        FadeTransition trans = new FadeTransition(Duration.seconds(0.2), root);
				        trans.setFromValue(0);
				        trans.setToValue(1);
				        trans.play();
				        player = new PlayNewMedia("/sound/Buy.mp3");
				        player.run();
					}else {
						for(j=1;j<=players_number;j++) {
							if(Gamer[j].getPlayers_owned_places()[the_player.getPlayer_place()]) {
								System.out.println("You are fucked Hahaha");
								the_player.setPlayer_amount(the_player.getPlayer_amount()-20);
								the_player.getLabel_amount().setText(String.valueOf(the_player.getPlayer_amount())+" $");
								Gamer[j].setPlayer_amount(Gamer[j].getPlayer_amount()+20);
								Gamer[j].getLabel_amount().setText(String.valueOf(Gamer[j].getPlayer_amount())+" $");
								player = new PlayNewMedia("/sound/Failed.mp3");
						        player.run();
						        FadeTransition transition = new FadeTransition(Duration.millis(100), the_player.getLabel_amount());
						        transition.setFromValue(1);
						        transition.setToValue(0);
						        transition.setCycleCount(12);
						        transition.setAutoReverse(true);
						        transition.play();
							}
						}
						
					}
					
				
				
				
				}else {
					other();
				}
		
		
		
		
		
		
		
		
	}
	
	void other() throws IOException {
		
		if(the_player.getPlayer_place()==5) {
			the_player.setPlayer_amount(the_player.getPlayer_amount()-200);
			the_player.getLabel_amount().setText(String.valueOf(the_player.getPlayer_amount())+" $");
			player = new PlayNewMedia("/sound/Failed.mp3");
	        player.run();
	        FadeTransition transition = new FadeTransition(Duration.millis(100), the_player.getLabel_amount());
	        transition.setFromValue(1);
	        transition.setToValue(0);
	        transition.setCycleCount(12);
	        transition.setAutoReverse(true);
	        transition.play();
		}
		if(the_player.getPlayer_place()==8 || the_player.getPlayer_place()==23 || the_player.getPlayer_place()==37){
			int award=get_awards();
			Static_PopUp_Label.setText("You have got "+award+" $");
			the_player.getLabel_amount().setText(String.valueOf(the_player.getPlayer_amount()+award)+" $");;
			Stage primaryStage=new Stage();
			root = FXMLLoader.load(getClass().getResource("/FXML_files/Chance_page.fxml"));
			Scene scene = new Scene(root,500,200);
			scene.setFill(Color.TRANSPARENT);
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
			Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
	        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
	        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
	        primaryStage.show();
	        FadeTransition trans = new FadeTransition(Duration.seconds(0.2), root);
	        trans.setFromValue(0);
	        trans.setToValue(1);
	        trans.play();
	        player = new PlayNewMedia("/sound/Chance_audio.mp3");
	        player.run();
		}
	}
	int awards[] = {50,100,150,200};
	int get_awards() {
    	Random generator = new Random();
    	int randomIndex = generator.nextInt(awards.length);
    	return awards[randomIndex];
    }
	
	void getting_values() {
		switch (player_loop) {
		case 1:
			this.the_player.setArrow(SecondPage.Gamer1.getArrow());
			this.the_player.setDomino(SecondPage.Gamer1.getDomino());
			this.the_player.setPlayer_amount(SecondPage.Gamer1.getPlayer_amount());
			this.the_player.setPlayer_name(SecondPage.Gamer1.getPlayer_name());
			this.the_player.setPlayer_place(SecondPage.Gamer1.getPlayer_place());
			this.the_player.setPlayers_owned_places(SecondPage.Gamer1.getPlayers_owned_places());
			this.the_player.setLabel_amount(SecondPage.Gamer1.getLabel_amount());
			break;
		case 2:
			this.the_player.setArrow(SecondPage.Gamer2.getArrow());
			this.the_player.setDomino(SecondPage.Gamer2.getDomino());
			this.the_player.setPlayer_amount(SecondPage.Gamer2.getPlayer_amount());
			this.the_player.setPlayer_name(SecondPage.Gamer2.getPlayer_name());
			this.the_player.setPlayer_place(SecondPage.Gamer2.getPlayer_place());
			this.the_player.setPlayers_owned_places(SecondPage.Gamer2.getPlayers_owned_places());
			this.the_player.setLabel_amount(SecondPage.Gamer2.getLabel_amount());
			break;
		case 3:
			this.the_player.setArrow(SecondPage.Gamer3.getArrow());
			this.the_player.setDomino(SecondPage.Gamer3.getDomino());
			this.the_player.setPlayer_amount(SecondPage.Gamer3.getPlayer_amount());
			this.the_player.setPlayer_name(SecondPage.Gamer3.getPlayer_name());
			this.the_player.setPlayer_place(SecondPage.Gamer3.getPlayer_place());
			this.the_player.setPlayers_owned_places(SecondPage.Gamer3.getPlayers_owned_places());
			this.the_player.setLabel_amount(SecondPage.Gamer3.getLabel_amount());
			break;
		case 4:
			this.the_player.setArrow(SecondPage.Gamer4.getArrow());
			this.the_player.setDomino(SecondPage.Gamer4.getDomino());
			this.the_player.setPlayer_amount(SecondPage.Gamer4.getPlayer_amount());
			this.the_player.setPlayer_name(SecondPage.Gamer4.getPlayer_name());
			this.the_player.setPlayer_place(SecondPage.Gamer4.getPlayer_place());
			this.the_player.setPlayers_owned_places(SecondPage.Gamer4.getPlayers_owned_places());
			this.the_player.setLabel_amount(SecondPage.Gamer4.getLabel_amount());
			break;
		case 5:
			this.the_player.setArrow(SecondPage.Gamer5.getArrow());
			this.the_player.setDomino(SecondPage.Gamer5.getDomino());
			this.the_player.setPlayer_amount(SecondPage.Gamer5.getPlayer_amount());
			this.the_player.setPlayer_name(SecondPage.Gamer5.getPlayer_name());
			this.the_player.setPlayer_place(SecondPage.Gamer5.getPlayer_place());
			this.the_player.setPlayers_owned_places(SecondPage.Gamer5.getPlayers_owned_places());
			this.the_player.setLabel_amount(SecondPage.Gamer5.getLabel_amount());
			break;
		case 6:
			this.the_player.setArrow(SecondPage.Gamer6.getArrow());
			this.the_player.setDomino(SecondPage.Gamer6.getDomino());
			this.the_player.setPlayer_amount(SecondPage.Gamer6.getPlayer_amount());
			this.the_player.setPlayer_name(SecondPage.Gamer6.getPlayer_name());
			this.the_player.setPlayer_place(SecondPage.Gamer6.getPlayer_place());
			this.the_player.setPlayers_owned_places(SecondPage.Gamer6.getPlayers_owned_places());
			this.the_player.setLabel_amount(SecondPage.Gamer6.getLabel_amount());
			break;
		case 7:
			this.the_player.setArrow(SecondPage.Gamer7.getArrow());
			this.the_player.setDomino(SecondPage.Gamer7.getDomino());
			this.the_player.setPlayer_amount(SecondPage.Gamer7.getPlayer_amount());
			this.the_player.setPlayer_name(SecondPage.Gamer7.getPlayer_name());
			this.the_player.setPlayer_place(SecondPage.Gamer7.getPlayer_place());
			this.the_player.setPlayers_owned_places(SecondPage.Gamer7.getPlayers_owned_places());
			this.the_player.setLabel_amount(SecondPage.Gamer7.getLabel_amount());
			break;
		case 8:
			this.the_player.setArrow(SecondPage.Gamer8.getArrow());
			this.the_player.setDomino(SecondPage.Gamer8.getDomino());
			this.the_player.setPlayer_amount(SecondPage.Gamer8.getPlayer_amount());
			this.the_player.setPlayer_name(SecondPage.Gamer8.getPlayer_name());
			this.the_player.setPlayer_place(SecondPage.Gamer8.getPlayer_place());
			this.the_player.setPlayers_owned_places(SecondPage.Gamer8.getPlayers_owned_places());
			this.the_player.setLabel_amount(SecondPage.Gamer8.getLabel_amount());
			break;
			
		}
	}
	
	void setting_values() {
		switch(player_loop) {
		case 1:
			SecondPage.Gamer1.setPlayers_owned_places(the_player.getPlayers_owned_places());
			SecondPage.Gamer1.setPlayer_amount(the_player.getPlayer_amount());
			SecondPage.Gamer1.setPlayer_place(the_player.getPlayer_place());
			break;
		case 2:
			SecondPage.Gamer2.setPlayers_owned_places(the_player.getPlayers_owned_places());
			SecondPage.Gamer2.setPlayer_amount(the_player.getPlayer_amount());
			SecondPage.Gamer2.setPlayer_place(the_player.getPlayer_place());
			break;
		case 3:
			SecondPage.Gamer3.setPlayers_owned_places(the_player.getPlayers_owned_places());
			SecondPage.Gamer3.setPlayer_amount(the_player.getPlayer_amount());
			SecondPage.Gamer3.setPlayer_place(the_player.getPlayer_place());
			break;
		case 4:
			SecondPage.Gamer4.setPlayers_owned_places(the_player.getPlayers_owned_places());
			SecondPage.Gamer4.setPlayer_amount(the_player.getPlayer_amount());
			SecondPage.Gamer4.setPlayer_place(the_player.getPlayer_place());
			break;
		case 5:
			SecondPage.Gamer5.setPlayers_owned_places(the_player.getPlayers_owned_places());
			SecondPage.Gamer5.setPlayer_amount(the_player.getPlayer_amount());
			SecondPage.Gamer5.setPlayer_place(the_player.getPlayer_place());
			break;
		case 6:
			SecondPage.Gamer6.setPlayers_owned_places(the_player.getPlayers_owned_places());
			SecondPage.Gamer6.setPlayer_amount(the_player.getPlayer_amount());
			SecondPage.Gamer6.setPlayer_place(the_player.getPlayer_place());
			break;
		case 7:
			SecondPage.Gamer7.setPlayers_owned_places(the_player.getPlayers_owned_places());
			SecondPage.Gamer7.setPlayer_amount(the_player.getPlayer_amount());
			SecondPage.Gamer7.setPlayer_place(the_player.getPlayer_place());
			break;
		case 8:
			SecondPage.Gamer8.setPlayers_owned_places(the_player.getPlayers_owned_places());
			SecondPage.Gamer8.setPlayer_amount(the_player.getPlayer_amount());
			SecondPage.Gamer8.setPlayer_place(the_player.getPlayer_place());
			break;
		
		}
		
	}
	
	int get_dice_var_numbe() {
    	Random generator = new Random();
    	int randomIndex = generator.nextInt(myArray.length);
    	return myArray[randomIndex];
    }
	
	

}

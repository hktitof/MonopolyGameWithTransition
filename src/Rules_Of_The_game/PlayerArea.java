package Rules_Of_The_game;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class PlayerArea implements Player{
	private String player_name;
	private int Player_amount;
	private ImageView Domino;
	private ImageView Arrow;
	private int player_place;
	private Boolean[] players_owned_places = new Boolean[41];
	private Label label_amount;
	public PlayerArea(String player_name, int player_amount, ImageView domino, ImageView arrow, int player_place,Label label_amount) {
		super();
		this.player_name = player_name;
		Player_amount = player_amount;
		Domino = domino;
		Arrow = arrow;
		this.label_amount=label_amount;
		this.player_place = player_place;
		for(int i=1;i<=40;i++) {
			players_owned_places[i]=false;
		}
		
	}
	public Label getLabel_amount() {
		return label_amount;
	}
	public void setLabel_amount(Label label_amount) {
		this.label_amount = label_amount;
	}
	public PlayerArea() {
		
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getPlayer_amount() {
		return Player_amount;
	}
	public void setPlayer_amount(int player_amount) {
		Player_amount = player_amount;
	}
	public ImageView getDomino() {
		return Domino;
	}
	public void setDomino(ImageView domino) {
		Domino = domino;
	}
	public ImageView getArrow() {
		return Arrow;
	}
	public void setArrow(ImageView arrow) {
		Arrow = arrow;
	}
	public int getPlayer_place() {
		return player_place;
	}
	public void setPlayer_place(int player_place) {
		this.player_place = player_place;
	}
	public Boolean[] getPlayers_owned_places() {
		return players_owned_places;
	}
	public void setPlayers_owned_places(Boolean[] players_owned_places) {
		this.players_owned_places = players_owned_places;
	}
	
	

}

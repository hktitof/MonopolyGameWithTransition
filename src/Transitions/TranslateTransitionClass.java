package Transitions;

import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class TranslateTransitionClass implements ITransitionStrategy{
	private int duration_time_in_millis;
	private Duration object_dur;
	private ImageView image;
	private Float X_movement;
	private Boolean x_or_y; // X = True  Y = False
	private AnchorPane anchorpane=null;
	private Parent root;
	private String type;
	
	public TranslateTransitionClass() {
		
	}
	public TranslateTransitionClass(int duration_time_in_millis,ImageView image_id, Float X,Boolean x_or_y) {
		super();
		this.duration_time_in_millis = duration_time_in_millis;
		this.object_dur = new Duration(this.duration_time_in_millis);
		this.image= image_id;
		this.X_movement=X;
		this.x_or_y=x_or_y;
	}
	public TranslateTransitionClass(int duration_time_in_millis,ImageView image_id, Float X,Boolean x_or_y,AnchorPane anchorpane) {
		super();
		this.duration_time_in_millis = duration_time_in_millis;
		this.object_dur = new Duration(this.duration_time_in_millis);
		this.image= image_id;
		this.X_movement=X;
		this.x_or_y=x_or_y;
		this.anchorpane=anchorpane;
	}
	public TranslateTransitionClass(int duration_time_in_millis,Parent root, Float X,String type,Boolean x_or_y) {
		super();
		this.duration_time_in_millis = duration_time_in_millis;
		this.object_dur = new Duration(this.duration_time_in_millis);
		this.X_movement=X;
		this.type=type;
		this.x_or_y=x_or_y;
	}
	
	
	public void run() {
			if(this.anchorpane!=null) {
				this.anchorpane.setVisible(true);
			}
			TranslateTransition trans = new TranslateTransition(object_dur, image);
			if(this.x_or_y) {
				trans.setByX(X_movement);
			}else {
				trans.setByY(X_movement);
			}
			trans.play();
	}
	
	
	

}

package Transitions;

import MediaClass.PlayNewMedia;
import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class DominoTransitions implements ITransitionStrategy{
	
	private int duration_time_in_millis=200;
	private Duration object_dur;
	private ImageView image;
	private int current_X_Y;
	private int next_position;
	private Boolean type_detected;
	private Duration object_dur_for_Pause;
	private int var_jump;
	private int Multiply_Pause_Time=1;
	private Double position[] = {0d,0d,-115d,-89d,-89d,-89d,-89d,-94d,-89d,-89d,-89d,-123d
								   ,-92d,-68d,-66d,-69d,-65d,-70d,-65d,-70d,-68d,-92d
								   ,115d,89d,89d,89d,89d,94d,89d,89d,89d,123d
								   ,92d,68d,66d,69d,65d,70d,65d,70d,68d,92d, };

	public DominoTransitions(ImageView image,int current_X_Y,int var_jump) {
		super();
		this.object_dur = new Duration(this.duration_time_in_millis);
		this.image = image;
		this.current_X_Y=current_X_Y;
		this.var_jump=var_jump;
		trans = new TranslateTransition(this.object_dur, this.image);
	}

	
	TranslateTransition trans = new TranslateTransition();
	PauseTransitionClass pause_trans = new PauseTransitionClass();
	PlayNewMedia player = new PlayNewMedia("/sound/Domino Jumping1.mp3");
	@Override
	public void run() {
		
		determin_type_of_transition();
		if(this.type_detected) {
			for(int i=1;i<=41;i++) {
				if(i==this.next_position) {
					trans.setByX(position[i]);
					trans.setByY(0);

				}
			}
		}else {
			for(int i=1;i<=41;i++) {
				if(i==this.next_position) {
					trans.setByY(position[i]);
					trans.setByX(0);
				}
			}
		}
		trans.play();
		player.run();
		
		if(this.var_jump>1) {
			this.object_dur_for_Pause=new Duration(200);
			PauseTransition p = new PauseTransition(this.object_dur_for_Pause);
			p.setOnFinished(e -> this.run());
	        p.play();
	        this.var_jump=this.var_jump-1;
	        this.Multiply_Pause_Time=this.Multiply_Pause_Time+1;
		}else {
			this.Multiply_Pause_Time=1;
		}
		
	}
	
	
	
	void determin_type_of_transition() {
		if(this.current_X_Y<=40) {
			this.next_position=this.current_X_Y+1;
		}else {
			this.next_position=1;
		}
		if((this.current_X_Y<=10 || this.current_X_Y>=1) && (this.next_position <=11)) {
			this.type_detected=true;
		}else if((this.current_X_Y<=20 || this.current_X_Y>=11) && (this.next_position <=21)){
			this.type_detected=false;
		}else if((this.current_X_Y<=30 || this.current_X_Y>=21) && (this.next_position <=31)){
			this.type_detected=true;
		}else if((this.current_X_Y<=40 || this.current_X_Y>=31)){
			this.type_detected=false;
		}
		if(this.current_X_Y==40) {
			this.current_X_Y=1;
		}else {
			this.current_X_Y=this.current_X_Y+1;
		}
		
	}
	

}

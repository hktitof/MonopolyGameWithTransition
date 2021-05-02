package Transitions;

import com.jfoenix.controls.JFXTextField;

import javafx.animation.FadeTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class FadetransitionOnetime implements ITransitionStrategy{
	private int duration_time_in_millis;
	private Duration object_dur;
	private ImageView image;
	private JFXTextField textfield;
	
	private String type;
	public FadetransitionOnetime (int duration_time_in_millis,ImageView image,String type) {
		super();
		this.duration_time_in_millis = duration_time_in_millis;
		this.object_dur = new Duration(this.duration_time_in_millis);
		this.image=image;
		this.type=type;
		
	}
	public FadetransitionOnetime (int duration_time_in_millis,JFXTextField textfield,String type) {
		super();
		this.duration_time_in_millis = duration_time_in_millis;
		this.object_dur = new Duration(this.duration_time_in_millis);
		this.textfield=textfield;
		this.type=type;
	}
	
	@Override
	public void run() {
		if(this.type == "image") {
			FadeTransition trans = new FadeTransition(this.object_dur, this.image);
	    	trans.setFromValue(0);
	        trans.setToValue(1);
	        trans.play();
		}else if(this.type=="textfield") {
			FadeTransition trans = new FadeTransition(this.object_dur, this.textfield);
	    	trans.setFromValue(0);
	        trans.setToValue(1);
	        trans.play();
		}
		
		
	}
	

}

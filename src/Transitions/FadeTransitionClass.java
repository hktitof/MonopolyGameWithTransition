package Transitions;

import javafx.animation.FadeTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class FadeTransitionClass implements ITransitionStrategy{
	private int duration_time_in_millis;
	private Duration object_dur;
	private ImageView image;
	private int cyclecount;
	public FadeTransitionClass (int duration_time_in_millis,int Cyclecount,ImageView image) {
		super();
		this.duration_time_in_millis = duration_time_in_millis;
		this.object_dur = new Duration(this.duration_time_in_millis);
		this.cyclecount=Cyclecount;
		this.image=image;
	}
	
	
	
	
	
	
	
	
	@Override
	public void run() {
		FadeTransition trans = new FadeTransition(this.object_dur, this.image);
    	trans.setFromValue(1);
        trans.setToValue(0);
        trans.setCycleCount(FadeTransition.INDEFINITE);
        trans.setAutoReverse(true);                                                                         
        trans.setCycleCount(this.cyclecount);
        trans.play();
		
	}
	

}

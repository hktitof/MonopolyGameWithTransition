package Transitions;


import javafx.animation.ScaleTransition;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class ScaleTransitionClass implements ITransitionStrategy{
	private int duration_time_in_millis;
	private Duration object_dur;
	private AnchorPane anchorpane;
	private double X;
	private double Y;
	
	
	public ScaleTransitionClass(int duration_time_in_millis,AnchorPane anchorpane,double X,double Y) {
		super();
		this.duration_time_in_millis = duration_time_in_millis;
		this.object_dur = new Duration(this.duration_time_in_millis);
		this.anchorpane=anchorpane;
		this.X=X;
		this.Y=Y;
	}

	@Override
	public void run() {
		ScaleTransition st = new ScaleTransition(this.object_dur, this.anchorpane);
	     st.setByX(this.X);
	     st.setByY(this.Y);
	     st.play();
		
	}
	

}

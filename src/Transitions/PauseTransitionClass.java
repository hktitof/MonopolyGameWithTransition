package Transitions;

import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class PauseTransitionClass {
	
	private int duration_time_in_millis;
	private Duration object_dur;
	private ITransitionStrategy trans;
	PauseTransition p = new PauseTransition();
	
	public PauseTransitionClass() {
		
		
	}
	
	public PauseTransitionClass(int Pass_duration_in_millis, ITransitionStrategy trans) {
		super();
		this.duration_time_in_millis = Pass_duration_in_millis;
		this.object_dur=new Duration(duration_time_in_millis);
		this.trans=trans;
		
	}

	public void run() {
		p = new PauseTransition(this.object_dur);
		p.setOnFinished(e -> this.trans.run());
        p.play();
	}

}

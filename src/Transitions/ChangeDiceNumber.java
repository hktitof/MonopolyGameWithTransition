package Transitions;

import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class ChangeDiceNumber implements ITransitionStrategy{
	private ImageView images[]= new ImageView[6];
	private ImageView dice1;
	private ImageView dice2;
	private int var_show_images=0;

	public ChangeDiceNumber(ImageView image1,ImageView image2,ImageView image3,ImageView image4,ImageView image5,ImageView image6,ImageView dice1,ImageView dice2) {
		super();
		this.images[1-1]=image1;
		this.images[2-1]=image2;
		this.images[3-1]=image3;
		this.images[4-1]=image4;
		this.images[5-1]=image5;
		this.images[6-1]=image6;
		this.dice1=dice1;
		this.dice2=dice2;
		
	}

	@Override
	public void run() {
		if(this.var_show_images<6) {
			this.var_show_images++;
			if(this.var_show_images==2) {
				this.dice1.setImage(this.images[6-1].getImage());
				this.dice2.setImage(this.images[6-1].getImage());
			}else {
				this.dice1.setImage(this.images[this.var_show_images-1].getImage());
				this.dice2.setImage(this.images[this.var_show_images-1].getImage());
			}
			PauseTransition p = new PauseTransition(Duration.millis(500));
			p.setOnFinished(e -> this.run());
	        p.play();
		}else {
			this.var_show_images=0;
		}
    	
		
	}
	
}

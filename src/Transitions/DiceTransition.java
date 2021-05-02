package Transitions;

import java.util.Random;

import MediaClass.PlayNewMedia;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class DiceTransition implements ITransitionStrategy{
	
	
	private ImageView image1;
	private ImageView image2;
	private int number_of_mouse_click;
	
	public DiceTransition() {
		
	}

	public DiceTransition(ImageView image1, ImageView image2,int number_of_mouse_click) {
		super();
		this.image1 = image1;
		this.image2 = image2;
		this.number_of_mouse_click=number_of_mouse_click;
	}
	
	Double getRondomX() {
		Random X = new Random();
		return X.nextDouble();
	}
	
	Double getRondomY() {
		Random X = new Random();
		return X.nextDouble();
	}
	
	PlayNewMedia player = new PlayNewMedia("/sound/Dice Rolling.mp3");

	@Override
	public void run() {
		RotateTransition rotate1 = new RotateTransition();
		RotateTransition rotate2 = new RotateTransition(); 
        rotate1.setAxis(Rotate.Z_AXIS);   
        rotate1.setByAngle(8000); 
        rotate1.setDuration(Duration.millis(3000)); 
        rotate1.setNode(this.image1);  
        rotate2.setAxis(Rotate.Z_AXIS);  
        rotate2.setByAngle(8000);
        rotate2.setDuration(Duration.millis(3000));  
        rotate2.setNode(this.image2);  
        rotate1.play(); 
        rotate2.play();
        player.run();
        
        	TranslateTransition trans1 = new TranslateTransition(Duration.millis(3000),this.image1);
        	TranslateTransition trans2 = new TranslateTransition(Duration.millis(3000),this.image2);
    		if(1==this.number_of_mouse_click) {
    			trans1.setByX(-200);
        		trans1.setByY(-200);
        		trans2.setByX(200);
        		trans2.setByY(200);
        		trans1.play();
        		trans2.play();
    		}else if(2==this.number_of_mouse_click) {
    			trans1.setByX(300);
        		trans1.setByY(300);
        		trans2.setByX(-300);
        		trans2.setByY(-300);
        		trans1.play();
        		trans2.play();
    		}else if(3==this.number_of_mouse_click) {
    			trans1.setByX(-300);
        		trans1.setByY(-300);
        		trans2.setByX(300);
        		trans2.setByY(300);
        		trans1.play();
        		trans2.play();
    			
    		}else if(4==this.number_of_mouse_click) {
    			trans1.setByX(400);
        		trans1.setByY(400);
        		trans2.setByX(-500);
        		trans2.setByY(-400);
        		trans1.play();
        		trans2.play();
    			
    		}else if(5==this.number_of_mouse_click) {
    			trans1.setByX(-400);
        		trans1.setByY(-400);
        		trans2.setByX(500);
        		trans2.setByY(400);
        		trans1.play();
        		trans2.play();
    			
    		}else if(6==this.number_of_mouse_click) {
    			trans1.setByX(400);
        		trans1.setByY(400);
        		trans2.setByX(-100);
        		trans2.setByY(-400);
        		trans1.play();
        		trans2.play();
    			
    		}else if(7==this.number_of_mouse_click) {
    			trans1.setByX(-200);
        		trans1.setByY(-200);
        		trans2.setByX(200);
        		trans2.setByY(200);
        		trans1.play();
        		trans2.play();
    			
    		}else if(8==this.number_of_mouse_click) {
    			trans1.setByX(200);
        		trans1.setByY(200);
        		trans2.setByX(-200);
        		trans2.setByY(-200);
        		trans1.play();
        		trans2.play();
    		}else if(9==this.number_of_mouse_click) {
    			trans1.setByX(-200);
        		trans1.setByY(-200);
        		trans2.setByX(200);
        		trans2.setByY(200);
        		trans1.play();
        		trans2.play();
    			
    		}else if(10==this.number_of_mouse_click) {
    			trans1.setByX(0);
        		trans1.setByY(0);
        		trans2.setByX(-300);
        		trans2.setByY(0);
        		trans1.play();
        		trans2.play();
    			
    		}
    		
    		
        
//        System.out.println(String.valueOf(getRondomX()));
//        System.out.println(String.valueOf(getRondomY()));

	
	}
	

}

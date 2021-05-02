package MediaClass;

import Transitions.ITransitionStrategy;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class PlayNewMedia implements ITransitionStrategy{
	private String path;
	private String get_path;

	public PlayNewMedia() {
		
	}

	public PlayNewMedia(String path) {
		super();
		this.path = path;
	}
	public void run() {
		this.get_path = getClass().getResource(this.path).toString();
        Media media = new Media(get_path);
        MediaPlayer mp = new MediaPlayer(media);
        mp.play();
	}
	

}

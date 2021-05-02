package FXML_Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Chance_page extends Main implements Initializable{
	@FXML
    private JFXButton Button_OK;

    @FXML
    private Label PopUp_Label;

    @FXML
    void Click_On_OK(MouseEvent event) {
    	((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		PopUp_Label.setText(Static_PopUp_Label.getText());
		
	}

}

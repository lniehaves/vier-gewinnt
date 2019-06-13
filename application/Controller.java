package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Controller 
{
	private MainApp mainApp_temp = new MainApp();
	
	@FXML
	private Button buttonSingleplayer;
	
	@FXML
	private Button buttonMultiplayer;
	
	@FXML
	private Button buttonExit;
	
	@FXML 
	private Button buttonAdd1;
	
	@FXML 
	private Label labelSpielerRot;

	@FXML 
	private Label labelSpielerBlau;
	
	@FXML 
	private Label labelRemainingRed;
	
	@FXML 
	private Label labelRemainingBlue;
	
	@FXML 
	private Label labelPointsRed;
	
	@FXML 
	private Label labelPointsBlue;
	
	@FXML
	private Label labelEventHandling;
	
	@FXML
	private void handlebuttonAdd1(ActionEvent event) {
		
	}
	
	@FXML
	private void handlebuttonAdd2(ActionEvent event) {
		
	}
	
	@FXML
	private void handlebuttonAdd3(ActionEvent event) {
		
	}
	
	@FXML
	private void handlebuttonAdd4(ActionEvent event) {
		
	}
	
	@FXML
	private void handlebuttonAdd5(ActionEvent event) {
		
	}
	
	@FXML
	private void handlebuttonAdd6(ActionEvent event) {
		
	}
	
	@FXML
	private void handlebuttonAdd7(ActionEvent event) {
		
	}
	
	@FXML 
	private void handlebuttonExit(ActionEvent event) {
		this.labelEventHandling.setText("Spiel beendet");
		System.exit(0);
	}
	
	public void setEventText(String text)
	{
		this.labelEventHandling.setText(text);
	}
	
}



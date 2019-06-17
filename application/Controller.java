package application;

import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Controller 
{
	
	boolean SpielerFarbe = true;
	boolean geändert;
	
	
	
	
	
	
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
		
		geändert =false;
		spielSteinErstellen(SpielerFarbe,0);
		
		
		
		//Siegbedingung überprüfen
		if (Sieg(Main.getaktuellerSpielstein()) = true && verbunden()== false) {
			this.labelEventHandling.setText("Spiel beendet-Gewonnen");
			TimeUnit.MILLISECONDS.sleep(1000);
			if(Main.getaktuellerSpielstein().getFarbe()= true) {this.labelEventHandling.setText("Sieg: Spieler Blau");}
			if(Main.getaktuellerSpielstein().getFarbe()= false) {this.labelEventHandling.setText("Sieg: Spieler Rot");}
		}
		if (Sieg(Main.getaktuellerSpielstein()) = true && Main.alleverbunden(getaktuellerSpielstein)== true) {
			this.labelEventHandling.setText("Spiel beendet-Unentschieden(Verbunden)");
		}
		
		//Unentschieden überprüfen(21Steine gesetzt)
		Maximum();
		
		SpielerFarbe= farbeändern(SpielerFarbe,geändert);
		
		
		
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



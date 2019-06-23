package application;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class SpielStein extends Circle {

	private boolean farbe;
	private int posX;
	private int posY;
	boolean verbunden;
	
	public SpielStein(boolean farbe, int posX, int posY) {
		
		this.farbe = farbe;
		this.posX = posX;
		this.posY = posY;
		verbunden = false;
		
	
		if(farbe)
		{
			this.setStyle("-fx-background-color:#0000ff");
			this.setFill("#0000ff");
		}
		else
		{
			this.setStyle("-fx-background-color:#ff0000");
			this.setFill("#ff0000");
		}
		
	}
	
	public Circle generateCircle(boolean farbe,int posX,int posY)
	{
		Circle a = new Circle(60+ posX*120,47.5+posY*95,40); 
		return a;
	}

	private void setFill(String string) {
		// TODO Auto-generated method stub
		
	}

	public boolean getFarbe() {
		return farbe;
	}

	public boolean getVerbunden() {
		return verbunden;
	}
	public void setVerbunden(boolean verbunden) {
		this.verbunden= verbunden;
	}
	
	public void setFarbe(boolean farbe) {
		this.farbe = farbe;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	
}

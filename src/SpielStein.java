import javafx.scene.shape.Circle;

public class SpielStein extends Circle {

	private boolean farbe;
	private int posX;
	private int posY;
	boolean verbunden;
	
	public SpielStein(boolean farbe, int posX, int posY) {
		
		super(60+ posX*120, 47.5+posY*95,40);
		verbunden = true;
		this.farbe = farbe;
		this.posX = posX;
		this.posY = posY;
		if(farbe)
		{
			this.setStyle("-fx-background-color:#0000ff");
		}
		else
		{
			this.setStyle("-fx-background-color:#ff0000");
		}
		
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

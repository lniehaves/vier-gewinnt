package application;

import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Controller 
{
	SpielStein[][] feld = new SpielStein[7][6];
	boolean SpielerFarbe = true;
	SpielStein aktuellerStein;
	int blaueSteine;
	int roteSteine;
	int pointsBlue;
	int pointsRed;
	boolean farbe;
	boolean gewonnen;
	
	private Main main_temp = new Main();
	
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
	private Label labelRemainingRed ;
	
	@FXML 
	private Label labelRemainingBlue;
	
	@FXML 
	private Label labelPointsRed;
	
	@FXML 
	private Label labelPointsBlue;
	
	@FXML
	private Label labelEventHandling;
	
	@FXML
	private Label labelEventHandling1 = new Label();
	
	
	//////////////////////////////////////////////////////////////////////////
	@FXML
	private Circle stein1;
	
	@FXML
	private Circle stein2;
	
	@FXML
	private Circle stein3;
	
	@FXML
	private Circle stein4;
	
	@FXML
	private Circle stein5;
	
	@FXML
	private Circle stein6;
	
	@FXML
	private Circle stein7;
	
	@FXML
	private Circle stein8;
	
	@FXML
	private Circle stein9;
	
	@FXML
	private Circle stein10;
	
	@FXML
	private Circle stein11;
	
	@FXML
	private Circle stein12;
	
	@FXML
	private Circle stein13;
	
	@FXML
	private Circle stein14;
	
	@FXML
	private Circle stein15;
	
	@FXML
	private Circle stein16;
	
	@FXML
	private Circle stein17;
	
	@FXML
	private Circle stein18;
	
	@FXML
	private Circle stein19;
	
	@FXML
	private Circle stein20;
	
	@FXML
	private Circle stein21;
	
	@FXML
	private Circle stein22;
	
	@FXML
	private Circle stein23;
	
	@FXML
	private Circle stein24;
	
	@FXML
	private Circle stein25;
	
	@FXML
	private Circle stein26;
	
	@FXML
	private Circle stein27;
	
	@FXML
	private Circle stein28;
	
	@FXML
	private Circle stein29;
	
	@FXML
	private Circle stein30;
	
	@FXML
	private Circle stein31;
	
	@FXML
	private Circle stein32;
	
	@FXML
	private Circle stein33;
	
	@FXML
	private Circle stein34;
	
	@FXML
	private Circle stein35;
	
	@FXML
	private Circle stein36;
	
	@FXML
	private Circle stein37;
	
	@FXML
	private Circle stein38;
	
	@FXML
	private Circle stein39;
	
	@FXML
	private Circle stein40;
	
	@FXML
	private Circle stein41;
	
	@FXML
	private Circle stein42;
	
	@FXML
	private Circle[][] steine;
	//////////////////////////////////////////////////////////////////////////////////////////////
	

	
	
	@FXML
	private void handlebuttonAdd1(ActionEvent event) {
		/* erzeugeStein
		 * aktualisiere verbleibende Steine
		 * farbe wechseln
		 * gewinnpruefung
		 * unentschiedenpruefung
		 */
		if(!gewonnen)
		{
			steinErzeugen(0);
			aktualisiereSteine();
			farbeWechseln();
			checkForWin(aktuellerStein);
		}
		else
		{
			setEventText("Starte ein neues Spiel!");
		}
		
		
		
	}
	
	@FXML
	private void handlebuttonAdd2(ActionEvent event) {
		if(!gewonnen)
		{
			steinErzeugen(1);
			aktualisiereSteine();
			farbeWechseln();
			checkForWin(aktuellerStein);
		}
		else
		{
			setEventText("Starte ein neues Spiel!");
		}
		
	}
	
	@FXML
	private void handlebuttonAdd3(ActionEvent event) {
		if(!gewonnen)
		{
			steinErzeugen(2);
			aktualisiereSteine();
			farbeWechseln();
			checkForWin(aktuellerStein);
		}
		else
		{
			setEventText("Starte ein neues Spiel!");
		}
		
	}
	
	@FXML
	private void handlebuttonAdd4(ActionEvent event) {
		if(!gewonnen)
		{
			steinErzeugen(3);
			aktualisiereSteine();
			farbeWechseln();
			checkForWin(aktuellerStein);
		}
		else
		{
			setEventText("Starte ein neues Spiel!");
		}
		
	}
	
	@FXML
	private void handlebuttonAdd5(ActionEvent event) {
		if(!gewonnen)
		{
			steinErzeugen(4);
			aktualisiereSteine();
			farbeWechseln();
			checkForWin(aktuellerStein);
		}
		else
		{
			setEventText("Starte ein neues Spiel!");
		}
	}
	
	@FXML
	private void handlebuttonAdd6(ActionEvent event) {
		if(!gewonnen)
		{
			steinErzeugen(5);
			aktualisiereSteine();
			farbeWechseln();
			checkForWin(aktuellerStein);
		}
		else
		{
			setEventText("Starte ein neues Spiel!");
		}
	}
	
	@FXML
	private void handlebuttonAdd7(ActionEvent event) {
		if(!gewonnen)
		{
			steinErzeugen(6);
			aktualisiereSteine();
			farbeWechseln();
			checkForWin(aktuellerStein);
		}
		else
		{
			setEventText("Starte ein neues Spiel!");
		}
	}
	
	@FXML 
	private void handlebuttonExit(ActionEvent event) {
		setEventText("Spiel beendet");
		System.exit(0);
	}
	//muss noch angepasst werden an die ki
	@FXML
	private void handleButtonSinglePlayer(ActionEvent event) {
		initialize();
		buttonSingleplayer.setText("Neues Spiel");
		buttonMultiplayer.setText("Neues Spiel");
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<6;j++)
			{
				steine[i][j].setStyle("-fx-opacity:0");
			}
		}
		
	}
	
	@FXML
	private void handleButtonMultiPlayer(ActionEvent event) {
		initialize();
		buttonSingleplayer.setText("Neues Spiel");
		buttonMultiplayer.setText("Neues Spiel");
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<6;j++)
			{
				steine[i][j].setStyle("-fx-opacity:0");
			}
		}
		
	}
	
	public void setEventText(String text)
	{
		this.labelEventHandling.setText(text);
	}
	
	
	
	public void setEventText(String text,int wZeit)
	{
		this.labelEventHandling.setText(text);
		try {
			TimeUnit.MILLISECONDS.wait(wZeit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.labelEventHandling.setText("");
	}
	
	public void setLabelEventHandling1(String text) {
		this.labelEventHandling1.setText(text);
	}

	public void setLabelRemainingRed(String text) {
		this.labelRemainingRed.setText(text);
	}

	public void setLabelRemainingBlue(String text) {
		this.labelRemainingBlue.setText(text);
	}

	public void setLabelPointsRed(String text) {
		this.labelPointsRed.setText(text);
	}

	public void setLabelPointsBlue(String text) {
		this.labelPointsBlue.setText(text);
	}

	public void steinErzeugen(int posX)
	{
		if(feld[posX][0] == null)
		{
			for(int i = 0;i<6;i++)
			{
				if(feld[posX][5]== null)
				{
					
					feld[posX][5] = new SpielStein(farbe,posX,5);
					setAktuellerStein(feld[posX][5]) ;
					if(getAktuellerStein().getFarbe()== true)
					{
						steine[posX][5].setFill(Color.BLUE);
						steine[posX][5].setStyle("-fx-opacity: 100");
					}
					else
					{
						steine[posX][5].setFill(Color.RED);
						steine[posX][5].setStyle("-fx-opacity: 100");
					}
					if(aktuellerStein.getFarbe()==true )blaueSteine++;
					else roteSteine++;
					break;
				}
				
				else if(feld[posX][i]!= null)
				{
					feld[posX][i-1] = new SpielStein(farbe,posX,i-1);
					setAktuellerStein(feld[posX][i-1]) ;
					if(getAktuellerStein().getFarbe()== true)
					{
						steine[posX][i-1].setFill(Color.BLUE);
						steine[posX][i-1].setStyle("-fx-opacity: 100");
					}
					else
					{
						steine[posX][i-1].setFill(Color.RED);
						steine[posX][i-1].setStyle("-fx-opacity: 100");
					}
					if(aktuellerStein.getFarbe()==true )blaueSteine++;
					else roteSteine++;
					break;
					
				}
			}
		}
		else
		{
			System.out.println("Zeile voll");
		}
	}

	public SpielStein getAktuellerStein() {
		return aktuellerStein;
	}

	public void aktualisiereSteine()
	{
		setLabelRemainingBlue(Integer.toString(blaueSteine)+"/21");
		setLabelRemainingRed(Integer.toString(roteSteine)+"/21");
	}
	
	public void setAktuellerStein(SpielStein aktuellerStein) {
		this.aktuellerStein = aktuellerStein;
	}
	
	public void farbeWechseln()
	{
		if(aktuellerStein.getFarbe()== true)farbe = false;
		else farbe= true;
	}
	
	public void initialize()
	{
		feld = new  SpielStein[7][6];
		steine = new Circle[7][6];
		steine[0][0]= stein1;
		steine[1][0]= stein2;
		steine[2][0]= stein3;
		steine[3][0]= stein4;
		steine[4][0]= stein5;
		steine[5][0]= stein6;
		steine[6][0]= stein7;
		steine[0][1]= stein8;
		steine[1][1]= stein9;
		steine[2][1]= stein10;
		steine[3][1]= stein11;
		steine[4][1]= stein12;
		steine[5][1]= stein13;
		steine[6][1]= stein14;
		steine[0][2]= stein15;
		steine[1][2]= stein16;
		steine[2][2]= stein17;
		steine[3][2]= stein18;
		steine[4][2]= stein19;
		steine[5][2]= stein20;
		steine[6][2]= stein21;
		steine[0][3]= stein22;
		steine[1][3]= stein23;
		steine[2][3]= stein24;
		steine[3][3]= stein25;
		steine[4][3]= stein26;
		steine[5][3]= stein27;
		steine[6][3]= stein28;
		steine[0][4]= stein29;
		steine[1][4]= stein30;
		steine[2][4]= stein31;
		steine[3][4]= stein32;
		steine[4][4]= stein33;
		steine[5][4]= stein34;
		steine[6][4]= stein35;
		steine[0][5]= stein36;
		steine[1][5]= stein37;
		steine[2][5]= stein38;
		steine[3][5]= stein39;
		steine[4][5]= stein40;
		steine[5][5]= stein41;
		steine[6][5]= stein42;
		setLabelRemainingBlue("/21");
		setLabelRemainingRed("/21");
		setLabelEventHandling1("");
		setEventText("");
		blaueSteine = 0;
		roteSteine = 0;
		gewonnen = false;
	}

	
	public Circle[][] getSteine() {
		return steine;
	}

	public void setSteine(Circle[][] steine) {
		this.steine = steine;
	}
	//Methode zum pruefen auf Siegbedingung
	public void  checkForWin(SpielStein stein)
	{
		int zahler = 0;
		
				//horizontal		
				for (int i=-3;i <=3;i++) {
					if(stein.getPosX()+i>= 0 && stein.getPosX()+i<7&& feld[stein.getPosX()+i][stein.getPosY()]!= null )
					{
						if(feld[stein.getPosX()+i][stein.getPosY()].getFarbe()== stein.getFarbe())zahler++;
						else zahler = 0;

						if(zahler == 4)
							{
								spielGewonnen();
								break;
							}
					}
				}
				
				//vertikal
				zahler = 0;
				for(int i = -3;i<=3;i++)
				{
					if(stein.getPosY()+i>= 0 && stein.getPosY()+i<6&& feld[stein.getPosX()][stein.getPosY()+i]!= null)
					{
						if(feld[stein.getPosX()][stein.getPosY()+i].getFarbe()== stein.getFarbe())zahler++;
						else zahler=0;
						if(zahler == 4)
							{
								spielGewonnen();
								break;
							}
					}
				}
				
				zahler = 0;
				//diagonal oben links-unten rechts
				for(int i = -3;i<=3;i++)
				{
					if(stein.getPosX()+i >=0 && stein.getPosX()+i<7&&stein.getPosY()+i>0&&stein.getPosY()+i<6&& feld[stein.getPosX()+i][stein.getPosY()+i]!= null)
					{
						if(feld[stein.getPosX()+i][stein.getPosY()+i].getFarbe() == stein.getFarbe())zahler++;
						else zahler =0;
						if(zahler == 4)
							{
								spielGewonnen();
								break;
							}
					}
				}
				zahler = 0;
				//diagonal oben rechts-unten links
				for(int i = -3;i<=3;i++)
				{
					if(stein.getPosX()+i >=0 && stein.getPosX()+i<7&&stein.getPosY()-i>0&&stein.getPosY()-i<6&& feld[stein.getPosX()+i][stein.getPosY()-i]!= null)
					{
						if(feld[stein.getPosX()+i][stein.getPosY()-i].getFarbe() == stein.getFarbe())zahler++;
						else zahler =0;
						if(zahler == 4)
							{
								spielGewonnen();
								break;
							}
					}
				}
				
	}
	
	//Methode zum Verfahren nach Sieg
	public void spielGewonnen()
	{
		gewonnen = true;
		if(aktuellerStein.getFarbe()== true)
		{
			//prueft auf unentschieden mit farbe rot
			if(checkForDraw(false))
			{
				setEventText("Unentschieden");
				pointsBlue++;
				pointsRed++;
				setLabelPointsBlue(Integer.toString(pointsBlue));
				setLabelPointsRed(Integer.toString(pointsRed));
			}
			else {
				setEventText("Blau hat gewonnen!");
				pointsBlue++;
				setLabelPointsBlue(Integer.toString(pointsBlue));
			}
			
		}
		else
		{
			if(checkForDraw(true))
			{
				setEventText("Unentschieden");
				pointsBlue++;
				pointsRed++;
				setLabelPointsBlue(Integer.toString(pointsBlue));
				setLabelPointsRed(Integer.toString(pointsRed));
			}
			else
			{
				setEventText("Rot hat gewonnen");
				pointsRed++;
				setLabelPointsRed(Integer.toString(pointsRed));
			}
			
		}
	}
	
	public boolean checkForDraw(boolean farbe)
	{
		boolean link = true;
	
		for(int i =0;i<7;i++)
		{
			for(int j =0;j<6;j++)
			{
				//checkt ob jeder spielstein der anderen farbe mit einem spielstein der gleichen farbe verbunden ist
				if(feld[i][j] != null&& feld[i][j].getFarbe()== farbe)
				{
					//horizontal
					for(int k =-1;k<2;k++)
					{
						if(i+k>=0&&i+k<7&&k!=0&&feld[i][j]!= null && feld[i+k][j]!=null && feld[i][j].getFarbe() == farbe)
						{
							if(feld[i+k][j].getFarbe()==farbe)
							{
								
								feld[i][j].setVerbunden(true);
								break;
							}
						}
					}
					
					//vertikal
					for(int k =-1;k<2;k++)
					{
						if(j+k>=0&&j+k<6&&k!=0&&feld[i][j]!= null && feld[i][j+k]!=null && feld[i][j].getFarbe() == farbe)
						{
							if(feld[i][j+k].getFarbe()==farbe)
							{
							
								feld[i][j].setVerbunden(true);
								break;
							}
						}
					}
					
					//diagonal oben links-unten rechts
					for(int k =-1;k<2;k++)
					{
						if(i+k>=0&&i+k<7&&j+k>=0&&j+k<6&&k!=0&&feld[i][j]!= null && feld[i+k][j+k]!=null && feld[i][j].getFarbe() == farbe)
						{
							if(feld[i+k][j+k].getFarbe()==farbe)
							{
								
								feld[i][j].setVerbunden(true);
								break;
							}
						}
					}
					
					//diagonal oben rechts-unten links
					for(int k =-1;k<2;k++)
					{
						if(i+k>=0&&i+k<7&&j-k>=0&&j-k<6&&k!=0&&feld[i][j]!= null && feld[i+k][j-k]!=null && feld[i][j].getFarbe() == farbe)
						{
							if(feld[i+k][j-k].getFarbe()==farbe)
							{
								feld[i][j].setVerbunden(true);
								break;
							}
						}
					}
					
					
				}
			}
		}
		
		for(int i =0;i<7;i++)
		{
			for(int j =0;j<6;j++)
			{
				if(feld[i][j] != null&& feld[i][j].getFarbe()== farbe)
				{
					if(!feld[i][j].getVerbunden())
					{
						link = false;
					}
				}
			}
		}
		
		return link;
	}
	
}



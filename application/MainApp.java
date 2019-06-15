package application;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application 
{
	private Stage primaryStage;
    private BorderPane rootLayout;
   SpielStein[][] feld = new SpielStein[7][6];
   

	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
        initRootLayout();
		
	}
	
	 /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try 
        {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = loader.load();
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
    void spielSteinErstellen(boolean farbe,int posX)
    {
    	if(feld[posX][0]== null)
    	{
    		for(int i = 0; i<6;i++)
    		{
    			if(SpielStein[posX][i]!= null)
    			{
    				feld[posX][i-1] = new SpielStein(farbe,posX,i-1);
    			}
    		}
    	}
    	else {
    		Controller.setEventText("Spalte ist bereits voll!");
    		TimeUnit.MILLISECONDS.sleep(2000);
    		Controller.setEventText("");
    	}
    }
   
    
	public static void main(String[] args) {
		launch(args);
	}
	
	private boolean Sieg(SpielStein stein) {
		int zähler =0;
		boolean gewonnen = false
				
		//horizontal		
		for (int i=-3;i <=3;i++) {
	    if(zeile+i>0 && zeile+i< 6) {
	    	if (SpielStein[zeile+i][spalte].getFarbe() == stein.getFarbe(){zähler++; };
	    	else {zähler =0;};
		if(zähler =4) {gewonnen = true;}
	    }
		}
		
		//vertikal
		for (int j=-3;j <=3;j++) {
			if(spalte+j>0 && spalte+j< 7) {
				if (SpielStein[zeile][spalte+j].getFarbe() == stein.getFarbe(){zähler++};
				else {zähler =0;};
			if(zähler =4) {gewonnen = true;}
			}
			}
		
		//Diagonal-links-rechts
		for (int i=-3;i <=3;i++) {
		    if(zeile+i>0 && zeile+i< 6 && spalte+i>0 && spalte+i< 7) {
		    	
		    	if (SpielStein[zeile+i][spalte+i].getFarbe() == stein.getFarbe(){zähler++; };
		    	else {zähler =0;};
			if(zähler =4) {gewonnen= true;}
		    }
			}
		
		//Diagonal-rechts-links
		for (int i=-3;i <=3;i++) {
		    if(zeile+i>0 && zeile+i< 6 && spalte+i>0 && spalte+i< 7) {
		    	
		    	if (SpielStein[zeile+i][spalte-i].getFarbe() == stein.getFarbe(){zähler++; };
		    	else {zähler =0;};
			if(zähler =4) {gewonnen= true;}
		    }
			}
		
		return gewonnen;
	}
	
}

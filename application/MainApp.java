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
    		feld[posX][0] = new SpielStein(farbe,posX,0);
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
}

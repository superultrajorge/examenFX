package Clase;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class OneController {
	
	//not using yet
	@FXML
	private ImageView imageRaw;


	/**
     * Opens an stage to send the profile
     */
    
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFX.class.getResource("Send.fxml"));
            BorderPane page = (BorderPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send");
            Scene scene = new Scene(page);
             sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Method to handle the ImageView action in the Main stage 
     */
    
    @FXML
    private void handleSend() {
    	showSendProfile();
    }

    /**
     * Closes the application when clicked on Exit in the secondary stage
     */
    @FXML
    private void handleClose() {
   	        System.exit(0);
    }
    }
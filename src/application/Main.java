package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
	    fxmlLoader.setLocation(getClass().getResource("/Layout.fxml"));
	    Parent root = fxmlLoader.load();
	    primaryStage.setTitle("HTTP Server");
	    primaryStage.setScene(new Scene(root, 300, 275));
	    primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}



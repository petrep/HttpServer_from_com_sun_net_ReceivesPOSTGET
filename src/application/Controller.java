package application;

import java.net.InetSocketAddress;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.net.httpserver.HttpServer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

	


public class Controller implements Initializable {
	@FXML TextField textfield1;
    @FXML TextArea consoleoutput;
    HttpServer server;

	public void startserver() throws Exception{
        System.out.println("-- startserver method --");
        
        
        int port = 9000;
        server = HttpServer.create(new InetSocketAddress(port), 0);
        System.out.println("server started at " + port);
        server.createContext("/", new RootHandler());
        server.createContext("/echoHeader", new EchoHeaderHandler());
        server.createContext("/echoGet", new EchoGetHandler());
        server.createContext("/echoPost", new EchoPostHandler());
        server.setExecutor(null);
        server.start();
        
        
        
    }
    
    public void stopserver() throws Exception{
        System.out.println("-- stopserver method --");
        try{
            System.out.println("stopping the server");
            server.stop(1);
            } catch (Exception e) {
            System.out.println("Could not close socket");
            System.exit(-1);
        }
    }
    

	@Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
    


	
}
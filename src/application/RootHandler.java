package application;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class RootHandler implements HttpHandler {

    @Override

    public void handle(HttpExchange he) throws IOException {
            String port = "9000";
			String response = "<h1>Server start success if you see this message</h1>" + "<h1>Port: " + port + "</h1>";
            he.sendResponseHeaders(200, response.length());
            OutputStream os = he.getResponseBody();
            os.write(response.getBytes());
            os.close();
    }
}
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started... waiting for client");

        Socket s = ss.accept(); // waits for connection
        System.out.println("Client connected!");

        InputStream in = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String message = br.readLine();
        System.out.println("Client says: " + message);

        s.close();
        ss.close();
    }
}

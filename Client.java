import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        System.out.println("Connected to server!");

        OutputStream out = s.getOutputStream();
        PrintStream ps = new PrintStream(out);

        ps.println("Hello, Server!");

        s.close();
    }
}

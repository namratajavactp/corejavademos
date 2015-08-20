import java.io.*;

public class QuoteServer {
    public static void main(String[] args) throws IOException {


		//start a new server thread to handle the client
        new QuoteServerThread().start();
    }
}

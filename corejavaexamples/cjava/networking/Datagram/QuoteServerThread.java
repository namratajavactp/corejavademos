import java.io.*;
import java.net.*;
import java.util.*;
/*
algorithm:

1) server thread will bind a socket to port 
2) It will create a datagram packet 
3) it will give a blocking call socket.receive(pass a datagram packet here).
    Blocking call means server prgm would wait here till the client sends a datagram packet.
4) Once a datagram packet is received from client it would get address and 
   port of client from the packet send by the client
5) Create a new Datagram packet passing it the clients address and port 
6) Read a one linener text by giving call to GetNextQuote function and pass
   it to datagram packet created in line 5 via buffer
7) Send that datagram packet to client.
*/

public class QuoteServerThread extends Thread {

    protected DatagramSocket socket = null;
    protected BufferedReader in = null;
    protected boolean moreQuotes = true;

    public QuoteServerThread() throws IOException {
	this("QuoteServerThread");
    }

    public QuoteServerThread(String name) throws IOException {
        super(name);


		//bind a datagram socket 
        socket = new DatagramSocket(4445);


    
        try {
            in = new BufferedReader(new FileReader("one-liners.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Could not open quote file. Serving time instead.");
        }
    }

    public void run() {

        while (moreQuotes) {
            try {
                byte[] buf = new byte[256];

                    // receive request

/*It will create a datagram packet */

/*give a blocking call socket.receive(pass a datagram packet here).
   Blocking call means server prgm would wait here till the client sends a datagram packet.*/


                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);

                    // figure out response

	/*Read a one linener text by giving call to GetNextQuote function and pass
   it to datagram packet created in line  */

                String dString = null;
                if (in == null)
                    dString = new Date().toString();
                else
                    dString = getNextQuote();


                buf = dString.getBytes();

		    // send the response to the client at "address" and "port"

/*	Once a datagram packet is received from client get address and 
   port of client from the packet send by the client */
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buf, buf.length, address, port);
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
		moreQuotes = false;
            }
        }
        socket.close();
    }

    protected String getNextQuote() {
        String returnValue = null;
        try {
            if ((returnValue = in.readLine()) == null) {
                in.close();
		moreQuotes = false;
                returnValue = "No more quotes. Goodbye.";
            }
        } catch (IOException e) {
            returnValue = "IOException occurred in server.";
        }
        return returnValue;
    }
}

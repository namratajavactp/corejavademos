import java.io.*;
import java.net.*;
import java.util.*;

public class QuoteClient {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
             System.out.println("Usage: java QuoteClient <hostname>");
             return;
        }

            // get a datagram socket
        DatagramSocket socket = new DatagramSocket();

            // send request
        byte[] buf = new byte[256];

		//get IP address of local host
        InetAddress address = InetAddress.getByName(args[0]);

		/*create a datagram packet based on host address and port
		on which server is listening */

        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);

		/*send an empty packet to the server so that server can figure 
		out clients address and port */

        socket.send(packet);
    
         //wait for the packet (response) from server
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

	    // display response
        String received = new String(packet.getData());
        System.out.println("Quote of the Moment: " + received);
    
        socket.close();
    }
}

package ComputerNetworks.Assignment5;

import java.io.*;
import java.net.*;

public class Server
{
    public static void main(String args[]) throws IOException
    {
        ServerSocket ss = null;
        Socket socket =null;

        String message;

        ss = new ServerSocket(8001);
        System.out.println("Server socket is created and waiting for client");

        socket = ss.accept();
        DataOutputStream ostream = new DataOutputStream(socket.getOutputStream());
        DataInputStream istream = new DataInputStream(socket.getInputStream());

        if(socket.getTcpNoDelay()) socket.setTcpNoDelay(true);
        // to disable Nagle's Algorithm

        message = istream.readUTF(); // read operation

        System.out.println("Client Says: "+message);

        // message = "Thanks";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Server Message :");
        message=br.readLine();

        ostream.writeUTF(message);   // write operation

        System.out.println("Reply to Client:" +message);

        socket.close();
        ostream.close();
        istream.close();
    }
}

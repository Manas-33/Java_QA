package ComputerNetworks.Assignment6;


import java.net.*;
import java.io.*;

public class Udpclient1 {
    public static void main(String[] args) {
        DatagramSocket socket = null;

        try {
            socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost"); // Change to server IP if needed
            int serverPort = 9876;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Client 1 - Enter a message: ");
                String message = reader.readLine();

                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                socket.send(sendPacket);

                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Client 1 - Server response: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}

package ComputerNetworks.Assignment6;

import java.net.*;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Udpserver {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        ExecutorService executorService = Executors.newFixedThreadPool(10); // Adjust the number of threads as needed

        try {
            socket = new DatagramSocket(9876); // Server listens on port 9876
            byte[] receiveData = new byte[1024];

            System.out.println("Server started. Waiting for clients...");

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received message from " + clientAddress + ":" + clientPort + ": " + message);

                // Create a new thread to handle communication with this client
                Runnable clientHandler = new ClientHandler(socket, receivePacket);
                executorService.execute(clientHandler);
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

class ClientHandler implements Runnable {
    private DatagramSocket socket;
    private DatagramPacket receivePacket;

    public ClientHandler(DatagramSocket socket, DatagramPacket receivePacket) {
        this.socket = socket;
        this.receivePacket = receivePacket;
    }

    @Override
    public void run() {
        try {
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            // You can add your chat logic here
            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());

            // Send a response back to the client
            String responseMessage = "Server received your message: " + message;
            byte[] sendData = responseMessage.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
            socket.send(sendPacket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package server;

import java.io.IOException;
import java.net.Socket;
public class ServerHandler extends Thread {
    private Socket clientSocket;

    /**
     *
     * @param clientSocket
     */
    public ServerHandler(Socket clientSocket) {
        // Constructor to initialize the client socket
        this.clientSocket = clientSocket;
    }

    @Override
    /**
     *
     */
    public void run() {
        // Override the run method to define the behavior of the server handler
        // This is where you would implement the logic to handle client requests
        // You can process client data and send responses here
        // It's currently empty for now
    }

    /**
     *
     */
    public void close() {
        // A function to close the client's connection
        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

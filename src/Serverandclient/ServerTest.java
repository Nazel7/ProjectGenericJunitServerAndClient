package Serverandclient;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerTest {
    public static void main(String[] args) {
        try(ServerSocket server= new ServerSocket(5001)){
            while(true){
            new ServerAndConnectToMultiClient(server.accept()).start();
            }

        }catch (IOException e){
            System.out.println("Unable to transmit connection"+ e.getMessage());
        }
    }
}

package Serverandclient;

import java.io.IOException;
import java.net.DatagramSocket;

public class ServerClassUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket= new DatagramSocket(5002);
        try{
            while(true){
               new ServerUDP(socket).start();
            }
        }finally{
            socket.close();
        }
    }
}

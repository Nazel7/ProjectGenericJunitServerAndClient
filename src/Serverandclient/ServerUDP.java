package Serverandclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerUDP extends Thread {
    DatagramSocket socket;

    public ServerUDP(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try{
            while(true){
                byte[] byteBuffer= new byte[50];
                DatagramPacket packets= new DatagramPacket(byteBuffer, byteBuffer.length);
                socket.receive(packets);
                System.out.println("from server: "+ new String(byteBuffer, 0, byteBuffer.length));
                String byteBuffer2= new String(byteBuffer, 0, byteBuffer.length);
                byte[] byteBuffer1= byteBuffer2.getBytes();
                int port= packets.getPort();
                InetAddress address= packets.getAddress();
                DatagramPacket packet= new DatagramPacket(byteBuffer1, byteBuffer1.length, address, port);
                socket.send(packet);

            }
        }catch (IOException e){
            System.out.println("IOException thrown: "+ e.getMessage());
        }

    }
}

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class ClientUDP {
    public static void main(String[] args) throws IOException {
        try(DatagramSocket socket= new DatagramSocket()){
            InetAddress address=InetAddress.getLocalHost();
            Scanner scanner= new Scanner(System.in);
            String outputString;
            do{
                System.out.println("Enter message: ");
                outputString= scanner.next();
                byte[] outputBuffer= outputString.getBytes();
                DatagramPacket packets= new DatagramPacket(outputBuffer, outputBuffer.length, address, 5002);
                socket.send(packets);
                byte[] inputByte= new byte[50];
                DatagramPacket packet= new DatagramPacket(inputByte, inputByte.length);
                socket.receive(packet);
                System.out.println("from clientServer: "+ new String(inputByte, 0, packet.getLength()));
            }while(!outputString.equals("exit"));
        }catch (SocketTimeoutException e){
            System.out.println("SocketTimeOutException thrown "+ e.getMessage());
        }
    }
}

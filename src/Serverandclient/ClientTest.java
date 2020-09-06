import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localHost", 5001)) {
            socket.setSoTimeout(5000);
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter clientOutPut = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String outString, inputResponse;
            do {
                outString = scanner.nextLine();
                clientOutPut.println("Client : " + outString);
                if (!outString.equals("exit")) {
                    inputResponse = input.readLine();
                    System.out.println(inputResponse);

                }
            }while (!outString.equalsIgnoreCase("exit"));

        }catch (SocketTimeoutException e){
            System.out.println("SocketTimeOut Exception returned "+ e.getMessage());
        }
    }
}
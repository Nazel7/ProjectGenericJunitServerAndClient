package Serverandclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerAndConnectToMultiClient extends Thread {
    private Socket socket;

    public ServerAndConnectToMultiClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            BufferedReader input= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output= new PrintWriter(socket.getOutputStream(), true);
            System.out.println("connected to server");
            String echoString;
            while(true){

                echoString= input.readLine();
                if(echoString.equals("exit")){
                    break;
                }
                output.println("From Server: "+echoString);
            }


        }catch(IOException e){
            System.out.println("IOException return"+ e.getMessage());
        }finally {
            try{
                socket.close();
            }catch (IOException e){
                System.out.println("From connection close: "+ e.getMessage());
            }
        }
    }
}

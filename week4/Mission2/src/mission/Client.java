package mission;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader inputServer = null;
        BufferedReader inputKeyboard = null;
        PrintWriter output = null;
        InetAddress ia = null;

        try {
            ia = InetAddress.getLocalHost();
            socket = new Socket(ia, 8000);
            inputServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            inputKeyboard = new BufferedReader(new InputStreamReader(System.in));
            output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

            System.out.println(socket.toString());
        } catch (IOException e) {

        }
        try {
            System.out.print("서버로 보낼 메세지 : ");
            String data = inputKeyboard.readLine();
            output.println(data);
            output.flush();

            String str2 = inputServer.readLine();
            System.out.println("서버로부터 되돌아온 메세지 : " + str2);
            socket.close();
        }catch (IOException e) {

        }

    }
}

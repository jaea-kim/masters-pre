package mission;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        BufferedReader input = null;
        BufferedWriter output = null;

        try {
            serverSocket = new ServerSocket(8000);
        } catch (IOException e) {
            System.out.println(8000 + "포트는 열려있습니다.");
        }
        try {
            System.out.println("서버가 열렸습니다.\n --- 클라이언트 대기 중 --- ");
            socket = serverSocket.accept();
            System.out.println("클라이언트가 연결되었습니다.");

            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String str = null;
            str = input.readLine();

            System.out.println("클라이언트 메세지 : " + str);
            output.write(str);
            output.flush();
            socket.close();
        } catch (IOException e) {

        }


    }
}

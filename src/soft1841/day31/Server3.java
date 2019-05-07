package soft1841.day31;

import jdk.jfr.events.SocketReadEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器向客户端发送信息--控制台
 * server端使用打印流向客户端输出文本内容
 */

public class Server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket= new ServerSocket(10080);
        System.out.println("服务器启动");
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread3 server = new ServerThread3(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread3 implements Runnable{
    private Socket socket;
    public ServerThread3(Socket socket){
        this.socket =socket;
    }

    @Override
    public void run() {
        System.out.println("客户端"+ socket.getInetAddress() + "连接成功！");
        String info = "这是一条服务器通知";
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
        }catch (IOException e){
            e.printStackTrace();
        }
        PrintStream printStream = new PrintStream(outputStream);
        printStream.print(info);
        printStream.close();
    }
}

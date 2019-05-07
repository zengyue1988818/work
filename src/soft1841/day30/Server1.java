package soft1841.day30;

import org.jb2011.lnf.beautyeye.ch20_filechooser.BEFileChooserUIWin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 2019-05-07
 * 客户端向服务器短发送文本数据--控制台版本
 * server端
 */
public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("服务器启动");
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread1 server = new ServerThread1(socket);
            new Thread(server).start();
        }
    }
}
//建立线程
class ServerThread1 implements  Runnable{
    private Socket socket;
    //两种方法传值： setter 和 构造方法
    public  ServerThread1(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        System.out.println("客户端" +socket.getInetAddress() +"连接成功");
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(br.readLine());
            br.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

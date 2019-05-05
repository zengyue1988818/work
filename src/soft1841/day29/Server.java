package soft1841.day29;
/**
 *
 * 2019-5-6
 * java网络的应用
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器对象，射影端口10086
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动，端口号：" + ss.getLocalPort());
        while (true){
            //获得和客户端对象的连接
            Socket socket = ss.accept();
            System.out.println("客户端:" + socket.getInetAddress() +"上线了");
            socket.close();
        }

    }
}

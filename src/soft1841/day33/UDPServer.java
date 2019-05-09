package soft1841.day33;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 服务器端
 */

public class UDPServer {
    public static void main(String[] args)throws IOException {
        /**
         * 接受客户信息
         */
        //1.创建服务端DatagramSocket ,指定端口
        DatagramSocket socket = new DatagramSocket(8888);
        //2.创建数据报，用于接受客户端发送的数据
        byte[] data = new byte[1024];
        //创建字节数组，指定接收的数据包的大小
        DatagramPacket packet = new DatagramPacket(data,data.length);
        System.out.println("*****服务器端已经启动，等待客户端发送数据。");
        socket.receive(packet);
        String info = new String(data,0,packet.getLength());
        System.out.println("我是服务器，客户端说：" + info);
        /**
         * 向客户端响应数据
         */
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        byte[] data2 = "欢迎您！".getBytes();
        DatagramPacket packet2 = new DatagramPacket(data2,data2.length,address,port);
        socket.send(packet2);
        socket.close();

    }
}


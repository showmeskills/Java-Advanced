package Demo01.TCp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClient {
    public static void main(String ...args) throws IOException {
//        1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
            Socket socket = new Socket("localhost",8080);
            System.out.println(socket);
//        2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
            OutputStream out = socket.getOutputStream();//前端向后端写入数据
//        3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
            out.write("你好服务器".getBytes());
//        4.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
            InputStream in = socket.getInputStream();
//        5.使用网络字节输入流InputStream对象中的方法read,读取服务器回写的数据
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            System.out.println("我是来自后端:"+new String(bytes,0,len));
//        6.释放资源(Socket)
            socket.close();
    }
}

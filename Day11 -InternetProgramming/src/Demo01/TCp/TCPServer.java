package Demo01.TCp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String ...args) throws IOException {
//        1.创建服务器ServerSocket对象和系统要指定的端口号
            ServerSocket server = new ServerSocket(8080);
//        2.使用ServerSocket对象中的方法accept,获取到请求的客户端对象Socket
            Socket socket = server.accept();//获得请求客户端的对象Socket
//        3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
            InputStream in = socket.getInputStream();//后端获取到前端发送的value使用InputStream
//        4.使用网络字节输入流InputStream对象中的方法read,读取客户端发送的数据
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            System.out.println("我来自前端:"+new String(bytes,0,len));
//        5.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
            OutputStream out = socket.getOutputStream();//后端给前端发送数据的时候需要使用OutputStream
//        6.使用网络字节输出流OutputStream对象中的方法write,给客户端回写数据
            out.write("数据收到".getBytes());
//        7.释放资源(Socket,ServerSocket)
            socket.close();
            server.close();
    }
}

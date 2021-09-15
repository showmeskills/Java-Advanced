package Demo01.BufferedStream;

import java.io.*;

public class Demo01BufferedOutputStream {
    public static void main(String ...args) throws IOException {
        show();
    }
    public static void show() throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/a.txt");
        FileOutputStream fos = new FileOutputStream(pathname);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        bos.flush();//可以不刷新直接关闭
        bos.close();
    }
}
